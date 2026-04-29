package dao;

import curdInterface.CrudInterface;
import dbConn.DBConn;
import entity.CustomerMemberships;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerMemberShipDao implements CrudInterface<CustomerMemberships,Long> {
    @Override
    public List<CustomerMemberships> findAll() {
        List<CustomerMemberships> customerMembershipsList= new ArrayList<>();
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "SELECT * FROM customer_memberships ORDER BY customer_membership_id";
            preparedStatement =connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                customerMembershipsList.add(
                        new CustomerMemberships(
                                resultSet.getLong("customer_membership_id"),
                                resultSet.getLong("customer_id"),
                                resultSet.getLong("membership_plan_id"),
                                resultSet.getInt("remaining_balance"),
                                resultSet.getTimestamp("joined_at").toLocalDateTime(),
                                resultSet.getTimestamp("expired_at").toLocalDateTime(),
                                resultSet.getString("status")
                        )
                );
            }
            preparedStatement.close();
            resultSet.close();
        }catch (Exception e){
            System.out.println("findAll 실패"+e.getMessage());
        }
        return customerMembershipsList;
    }

    @Override
    public CustomerMemberships findById(Long id) {
        CustomerMemberships customerMemberships = null;
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            String sql = "SELECT * FROM customer_memberships WHERE customer_membership_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                customerMemberships = new CustomerMemberships(
                        resultSet.getLong("customer_membership_id"),
                        resultSet.getLong("customer_id"),
                        resultSet.getLong("membership_plan_id"),
                        resultSet.getInt("remaining_balance"),
                        resultSet.getTimestamp("joined_at").toLocalDateTime(),
                        resultSet.getTimestamp("expired_at").toLocalDateTime(),
                        resultSet.getString("status")
                );
            }
        } catch (Exception e) {
            System.out.println("findById 실패 " + e.getMessage());
        }
        return customerMemberships;
    }

    @Override
    public boolean save(CustomerMemberships entity) {
        int result = 0;
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        try{
            String sql = """
                    INSERT INTO customer_memberships(
                    customer_id,
                    membership_plan_id,
                    remaining_balance,
                    joined_at,
                    expired_at,
                    status
                    ) VALUES (?,?,?,?,?,?)
                    """;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,entity.getCustomerId());
            preparedStatement.setLong(2,entity.getMembershipPlanId());
            preparedStatement.setInt(3,entity.getRemainingBalance());
            preparedStatement.setTimestamp(4, Timestamp.valueOf(entity.getJoinedAt()));
            preparedStatement.setTimestamp(5, Timestamp.valueOf(entity.getExpiredAt()));
            preparedStatement.setString(6, entity.getStatus());
            result = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("save" + e.getMessage());
        }
        return result > 0;
    }

    @Override
    public boolean update(CustomerMemberships entity) {
        int result = 0;
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        try{
            String sql = """
                    UPDATE customer_memberships 
                    SET
                    customer_id = ?,
                    membership_plan_id = ?,
                    remaining_balance = ?,
                    joined_at = ?,
                    expired_at = ?,
                    status = ?
                    WHERE customer_membership_id = ?
                    """;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,entity.getCustomerId());
            preparedStatement.setLong(2,entity.getMembershipPlanId());
            preparedStatement.setInt(3,entity.getRemainingBalance());
            preparedStatement.setTimestamp(4,Timestamp.valueOf(entity.getJoinedAt()));
            preparedStatement.setTimestamp(5,Timestamp.valueOf(entity.getExpiredAt()));
            preparedStatement.setString(6, entity.getStatus());
            preparedStatement.setLong(7,entity.getCustomerMembershipId());
            result = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("update 실패 " + e.getMessage());
        }
        return result > 0;
    }

    @Override
    public boolean deleteById(Long id) {
        int result = 0;
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        try{
            String sql = "DELETE FROM customer_memberships WHERE customer_membership_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("deleteById 실패" + e.getMessage());
        }
        return  result > 0;
    }
}

package dao;

import curdInterface.CrudInterface;
import dbConn.DBConn;
import entity.Customer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements CrudInterface<Customer,Long> {
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            String sql = "SELECT *FROM customers ORDER BY customer_id";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                customerList.add(
                        new Customer(
                                resultSet.getLong("customer_id"),
                                resultSet.getString("customer_name"),
                                resultSet.getString("phone_number"),
                                resultSet.getDate("birth_date").toLocalDate(),
                                resultSet.getDate("frist_visit_date").toLocalDate(),
                                resultSet.getLong("primary_staff_id"),
                                resultSet.getString("customer_status"),
                                resultSet.getString("notes")
                        )
                );
            }
            preparedStatement.close();
            resultSet.close();
        } catch (Exception e) {
            System.out.println("전체 회원 조회 실패" + e.getMessage());
        }
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        Customer customer = null;
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            String sql = "SELECT * FROM customers WHERE customer_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                customer = new Customer(
                        resultSet.getLong("customer_id"),
                        resultSet.getString("customer_name"),
                        resultSet.getString("phone_number"),
                        resultSet.getDate("birth_date").toLocalDate(),
                        resultSet.getDate("first_visit_date").toLocalDate(),
                        resultSet.getLong("primary_staff_id"),
                        resultSet.getString("customer_status"),
                        resultSet.getString("notes")
                );
            }
            preparedStatement.close();
            resultSet.close();
            return customer;
        } catch (Exception e) {
            System.out.println("findById 실패" + e.getMessage());
        }
        return null;
    }

    @Override
    public boolean save(Customer entity) {
        int result = 0;
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        try{
            String sql = """
                    INSERT INTO customers(
                    customer_name,
                    phone_number,
                    birth_date,
                    first_visit_date,
                    primary_staff_id,
                    customer_status,
                    notes
                    ) VALUES(?,?,?,?,?,?,?)
                    """;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getName());
            preparedStatement.setString(2, entity.getPhoneNumber());
            preparedStatement.setDate(3, Date.valueOf(entity.getBirthDate()));
            preparedStatement.setDate(4,Date.valueOf(entity.getFirstVisitDate()));
            preparedStatement.setLong(5,entity.getStaffId());
            preparedStatement.setString(6,entity.getStatus());
            preparedStatement.setString(7,entity.getNotes());
            result = preparedStatement.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("save 실패"+e.getMessage());
        }
        return result > 0;
    }

    @Override
    public boolean update(Customer entity) {
        int result = 0;
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        try{
            String sql = """
                    UPDATE customers
                    SET 
                    customer_name = ?,
                    phone_number = ?,
                    birth_date = ?,
                    first_visit_date = ?,
                    primary_staff_id = ?,
                    customer_status = ?,
                    notes = ?
                    WHERE customer_id = ?
                    """;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(8,entity.getCustomerId());
            preparedStatement.setString(1,entity.getName());
            preparedStatement.setString(2, entity.getPhoneNumber());
            preparedStatement.setDate(3, Date.valueOf(entity.getBirthDate()));
            preparedStatement.setDate(4,Date.valueOf(entity.getFirstVisitDate()));
            preparedStatement.setLong(5,entity.getStaffId());
            preparedStatement.setString(6,entity.getStatus());
            preparedStatement.setString(7,entity.getNotes());
            result = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("update 실패" + e.getMessage());
        }
        return result > 0;
    }

    @Override
    public boolean deleteById(Long id) {
        int result = 0;
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            String sql = "DELETE FROM customers WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);
            result = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("deleteById 실패"+ e.getMessage());
        }
        return result > 0;
    }
}

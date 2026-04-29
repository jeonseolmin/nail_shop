package dao;

import curdInterface.CrudInterface;
import dbConn.DBConn;
import entity.Incentives;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class incentiveDao implements CrudInterface<Incentives,Long> {
    @Override
    public List<Incentives> findAll() {
        Connection connection = DBConn.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            String sql = "SELECT * FROM incentives ORDER BY incentive_id";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                
            }
        } catch (Exception e) {
            System.out.println("findAll 실패" + e.getMessage());
        }
        return List.of();
    }

    @Override
    public Incentives findById(Long aLong) {
        return null;
    }

    @Override
    public boolean save(Incentives entity) {
        return false;
    }

    @Override
    public boolean update(Incentives entity) {
        return false;
    }

    @Override
    public boolean deleteById(Long aLong) {
        return false;
    }
}

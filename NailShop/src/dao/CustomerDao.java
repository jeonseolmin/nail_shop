package dao;

import curdInterface.CrudInterface;
import entity.Customer;

import java.util.List;

public class CustomerDao implements CrudInterface<Customer,Long> {
    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public Customer findById(Long aLong) {
        return null;
    }

    @Override
    public boolean save(Customer entity) {
        return false;
    }

    @Override
    public boolean update(Customer entity) {
        return false;
    }

    @Override
    public boolean deleteById(Long aLong) {
        return false;
    }
}

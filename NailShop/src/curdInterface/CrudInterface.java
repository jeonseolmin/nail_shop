package curdInterface;

import java.util.List;

public interface CrudInterface<T, ID> {

    List<T> findAll();

    T findById(ID id);

    boolean save(T entity);

    boolean update(T entity);

    boolean deleteById(ID id);
}

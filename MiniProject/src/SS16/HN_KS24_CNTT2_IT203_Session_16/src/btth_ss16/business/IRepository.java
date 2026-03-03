package btth_ss16.business;

import btth_ss16.model.Product;

import java.util.List;

public interface IRepository <T>{
    boolean add(Product item);

    boolean removeById(String id) ;
    T findById(String id);
    List<T> findAll() ;

}

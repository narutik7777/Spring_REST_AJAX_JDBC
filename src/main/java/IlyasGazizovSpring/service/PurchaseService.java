package IlyasGazizovSpring.service;

import IlyasGazizovSpring.db.model.Purchase;

public interface PurchaseService {

    Iterable<Purchase> listAll();

    void delete(Integer id);
    
    Purchase add(Integer quantity, String name);

}

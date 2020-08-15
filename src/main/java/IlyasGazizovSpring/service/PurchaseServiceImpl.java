package IlyasGazizovSpring.service;

import IlyasGazizovSpring.db.model.Purchase;
import IlyasGazizovSpring.db.dao.PurchaseRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final static Logger log = Logger.getLogger(PurchaseServiceImpl.class);

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Iterable<Purchase> listAll() {
        return purchaseRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        purchaseRepository.delete(id);
    }

    @Override
    public Purchase add(Integer quantity, String name) {
        return purchaseRepository.save(new Purchase(quantity, name));
    }



}

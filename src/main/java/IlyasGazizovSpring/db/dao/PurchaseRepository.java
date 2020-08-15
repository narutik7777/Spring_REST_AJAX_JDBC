package IlyasGazizovSpring.db.dao;
import IlyasGazizovSpring.db.model.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer> { }

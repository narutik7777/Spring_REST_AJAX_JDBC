package IlyasGazizovSpring.db.model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Purchase")

public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    public Purchase() {
    }

    public Purchase(Integer id, Integer qolvo, String name) {
        this.id = id;
        this.quantity = qolvo;
        this.name = name;
    }
    public Purchase(Integer qolvo, String name) {
        this.quantity = qolvo;
        this.name = name;
    }

    @Id
    @Column(name = "purchase_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    @Column(name = "purchase_quantity")
    private Integer quantity;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getNumber() {
        return quantity;
    }

    @Column(name = "purchase_name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

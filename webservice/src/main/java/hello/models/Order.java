package hello.models;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    private Timestamp timestamp;

    private Integer koyber;

    @ManyToOne
    User waiter;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItemBridge> itemBridges = new HashSet<>();

    public Order(Integer koyber, User waiter, List<ItemBridge> itemBridges){
        this.koyber = koyber;
        this.waiter = waiter;
        for(ItemBridge itemBridge : itemBridges)
            itemBridge.setOrder(this);

        this.itemBridges = new HashSet<>(itemBridges);
    }

    public User getWaiter() {
        return waiter;
    }

    public void setWaiter(User waiter) {
        this.waiter = waiter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getKoyber() {
        return koyber;
    }

    public void setKoyber(int koyber) {
        this.koyber = koyber;
    }
}
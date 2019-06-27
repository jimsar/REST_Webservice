package hello.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ItemBridge implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn
    private Item item;

    @Id
    @ManyToOne
    @JoinColumn
    private Order order;

    private Integer quantity;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ItemBridge(Item item, Integer quantity){
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof ItemBridge)) return false;
        ItemBridge that = (ItemBridge) o;
        return Objects.equals(item.getName(), that.item.getName()) &&
                Objects.equals(item.getPrice(), that.item.getPrice()) &&
                Objects.equals(item.getDescription(), that.item.getDescription()) &&
                Objects.equals(order.getTimestamp(), that.order.getTimestamp()) &&
                Objects.equals(order.getKoyber(), that.order.getKoyber()) &&
                Objects.equals(order.getWaiter(), that.order.getWaiter()) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item.getName(), item.getPrice(), item.getDescription(),
                order.getTimestamp(), order.getKoyber(), order.getWaiter(), quantity);
    }

}

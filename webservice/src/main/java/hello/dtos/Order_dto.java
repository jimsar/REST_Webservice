package hello.dtos;

import java.util.List;

public class Order_dto {
    private Integer koyber;
    private Integer waiter_id;
    private List<ItemBridge_dto> listItems;

    public Order_dto(Integer koyber, Integer waiter_id, List<ItemBridge_dto> listItems) {
        this.koyber = koyber;
        this.waiter_id = waiter_id;
        this.listItems = listItems;
    }

    public Order_dto() {
    }

    public Integer getKoyber() {
        return koyber;
    }

    public void setKoyber(Integer koyber) {
        this.koyber = koyber;
    }

    public Integer getWaiter_id() {
        return waiter_id;
    }

    public void setWaiter_id(Integer waiter_id) {
        this.waiter_id = waiter_id;
    }

    public List<ItemBridge_dto> getListItems() {
        return listItems;
    }

    public void setListItems(List<ItemBridge_dto> listItems) {
        this.listItems = listItems;
    }
}

package hello.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity// This tells Hibernate to make a table out of this class
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String ctgry;

    private Float price;

    private String description;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItemBridge> itemBridges = new HashSet<>();

    public Item(){}

    public Item(String name, Float price, String description, String ctgry){
        this.name = name;
        this.price = price;
        this.description = description;
        this.ctgry = ctgry;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCtgry() {
        return ctgry;
    }

    public void setCtgry(String ctgry) {
        this.ctgry = ctgry;
    }
}
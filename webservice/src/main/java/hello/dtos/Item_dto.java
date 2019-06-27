package hello.dtos;

public class Item_dto {

    private String name;

    private String ctgry;

    private Float price;

    private String description;

    public Item_dto(String name, Float price, String description, String ctgry) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.ctgry = ctgry;
    }

    public Item_dto() {
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

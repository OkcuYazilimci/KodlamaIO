package Entities;

public class Category {
    private String name;

    public Category() {
        super();
    }

    public Category(String name) {
        this.name = name;
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

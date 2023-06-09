package Entities;

public class Course {
    private int id;
    private String name;
    private double unitPrice;

    public Course(int id, String name, double unitPrice){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // GETTER & SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        try {
            if (unitPrice <= 0) {
                throw new Exception("Price cannot be 0 or negative");
            }
            this.unitPrice = unitPrice;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

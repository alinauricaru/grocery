package ro.food.model.dto;

//DTO - un obiect data transfer care contine informatii
public class ProductDto {

    private String name;
    private String brand;
    private int nrBuc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNrBuc() {
        return nrBuc;
    }

    public void setNrBuc(int nrBuc) {
        this.nrBuc = nrBuc;
    }
}

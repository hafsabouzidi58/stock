package org.sid.demo.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class ProductForm {
    public ProductForm(String id, String description, String name, double currentPrice, int quantity, CategoryForm category) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.category = category;
    }

    public ProductForm() {
    }

    @Override
    public String toString() {
        return "ProductForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", currentPrice=" + currentPrice +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public CategoryForm getCategory() {
        return category;
    }

    private String id;
    private String name;
    private String description;
    private double currentPrice;
   // private String photoName;
    private int quantity;
    private CategoryForm category;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(CategoryForm category) {
        this.category = category;
    }
}

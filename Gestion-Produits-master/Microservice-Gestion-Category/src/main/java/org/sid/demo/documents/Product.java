package org.sid.demo.documents;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    public Product(String id, Category category, int quantity, boolean available, double currentPrice, String name, String description) {
        this.id = id;
        this.category = category;
        this.quantity = quantity;
        this.available = available;
        this.currentPrice = currentPrice;
        this.name = name;
        this.description = description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

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

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Id
    private String id;

    private String name;
    private String description;
    private double currentPrice;
    private boolean available;
    //private String photoName;
    private int quantity;

    @DBRef
    private Category category;
}

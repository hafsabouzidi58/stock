package org.sid.demo.documents;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    public void setId(String id) {
        this.id = id;
    }

    public Category() {
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

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Category(String id, String name, String description, ArrayList<Product> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.products = products;
    }

    @Id
    private String id;
    private String name;
    private String description;

    @DBRef
    @JsonIgnore
    private ArrayList<Product> products;
}

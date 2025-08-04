package org.sid.demo.forms;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryForm {
    public String getId() {
        return id;
    }

    public CategoryForm() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    private String id;
    private String name;
    private String description;

    public CategoryForm(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

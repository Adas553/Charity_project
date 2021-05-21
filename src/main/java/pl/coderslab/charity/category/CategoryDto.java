package pl.coderslab.charity.category;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CategoryDto {

    private long id = 0L;

    @NotBlank
    private String name;

    public CategoryDto(String name) {
        this.name = name;
    }

    public CategoryDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


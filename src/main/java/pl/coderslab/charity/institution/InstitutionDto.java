package pl.coderslab.charity.institution;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InstitutionDto {

    private long id = 0L;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    public InstitutionDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public InstitutionDto() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

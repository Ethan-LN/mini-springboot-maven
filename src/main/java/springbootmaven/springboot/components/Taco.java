package springbootmaven.springboot.components;

import java.util.Date;
import java.util.List;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
public class Taco {
    private Long id;
    private Date createdAt = new Date();

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    @NotNull
    @Size(min=1, message = "You must choose at least one ingredient")
    private List<Ingredient> ingredients;
}
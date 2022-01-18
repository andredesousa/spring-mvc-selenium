package app.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min = 4, max = 20)
    private String name;

    @Positive
    private Double quantity;

    @NotBlank
    @Size(min = 1, max = 1)
    private String unit;

    @Positive
    private Double price;

    @NotBlank
    @Size(min = 1, max = 1)
    private String currency;

    @NotNull
    private Date expirationDate;

}

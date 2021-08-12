package co.com.foodbank.stock.dto;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import co.com.foodbank.contribution.dto.ContributionPK;
import co.com.foodbank.product.dto.ProductPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.dto 22/06/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockDTO {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateStock;

    @NotNull
    @Pattern(regexp = "^[0-9]{1,5}$",
            message = "Quantity must be numeric between 1-5 digits.")
    private String quantity;

    @Valid
    private ContributionPK contribution;

    @Valid
    private ProductPK product;



}

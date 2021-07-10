package co.com.foodbank.stock.dto;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import co.com.foodbank.contribution.dto.ContributionPK;
import co.com.foodbank.product.dto.ProductPK;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.dto 22/06/2021
 */
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



    /**
     * Default constructor.
     */
    public StockDTO() {}


    public ContributionPK getContribution() {
        return contribution;
    }

    public void setContribution(ContributionPK contribution) {
        this.contribution = contribution;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


    public ProductPK getProduct() {
        return product;
    }


    public void setProduct(ProductPK product) {
        this.product = product;
    }


    public Date getDateStock() {
        return dateStock;
    }


    public void setDateStock(Date dateStock) {
        this.dateStock = dateStock;
    }



}

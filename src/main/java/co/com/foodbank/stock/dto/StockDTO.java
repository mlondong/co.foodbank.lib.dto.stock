package co.com.foodbank.stock.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import co.com.foodbank.contribution.dto.ContributionData;
import co.com.foodbank.product.dto.ProductDTO;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.dto 22/06/2021
 */
public class StockDTO {

    private Date dateStock;

    @JsonIgnore(value = true)
    private ContributionData contribution;

    private ProductDTO product;


    /**
     * Default constructor.
     */
    public StockDTO() {}


    public ContributionData getContribution() {
        return contribution;
    }

    public void setContribution(ContributionData contribution) {
        this.contribution = contribution;
    }



    public ProductDTO getProduct() {
        return product;
    }


    public void setProduct(ProductDTO product) {
        this.product = product;
    }


    public Date getDateStock() {
        return dateStock;
    }


    public void setDateStock(Date dateStock) {
        this.dateStock = dateStock;
    }



}

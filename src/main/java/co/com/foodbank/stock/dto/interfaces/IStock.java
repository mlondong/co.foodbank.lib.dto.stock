package co.com.foodbank.stock.dto.interfaces;

import java.util.Date;
import co.com.foodbank.contribution.dto.interfaces.IContribution;
import co.com.foodbank.product.dto.interfaces.IProduct;


/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.v1.model 21/06/2021
 */
public interface IStock {

    public String getId();

    public IContribution getContribution();

    public IProduct getProduct();

    public Date getDateStock();

    public Long getQuantity();


}

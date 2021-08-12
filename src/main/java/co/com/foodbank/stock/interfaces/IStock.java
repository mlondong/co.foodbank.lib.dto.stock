package co.com.foodbank.stock.interfaces;

import java.util.Date;
import co.com.foodbank.contribution.interfaces.IContribution;
import co.com.foodbank.product.interfaces.IProduct;

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

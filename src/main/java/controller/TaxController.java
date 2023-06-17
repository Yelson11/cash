package controller;
import model.CONSTANTS;
/**
 *
 * @author Yelson Monge
 */
public class TaxController {
    public TaxController(){
        
    }
    
    public int calculateInsuranceFee(int salary){
        return (int) Math.round(salary*CONSTANTS.CCSS_FEE/100);
    }
}

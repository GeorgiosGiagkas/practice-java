/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterchallengelect50;

/**
 *
 * @author giagkas
 */
public class HealthyBurger extends BasicHam{
    private String addition5;
    private double priceAdd5;
    private String addition6;
    private double priceAdd6;
    
    public HealthyBurger(String meat, double price){
        super("Healthy", "Brown rye",  meat, price);
              
    }
    
       public void setHamAdd4(String addition5, double priceAdd5){
        this.addition5=addition5;
        this.priceAdd5=priceAdd5;
             
    }
    
       public void setHamAdd6(String addition6, double priceAdd6){
        this.addition6=addition6;
        this.priceAdd6=priceAdd6;
             
    }
    
    
    
    @Override
    public double hamPriceTotal(){
        double hamPrice = super.hamPriceTotal();
        if(this.addition5!=null){
            hamPrice+=this.priceAdd5;
            System.out.println("Addtition "+this.addition5+ " charging extra: "+this.priceAdd5);
        }
        if(this.addition6!=null){
            hamPrice+=this.priceAdd6;
            System.out.println("Addtition "+this.addition6+ " charging extra: "+this.priceAdd6);
        }
        return hamPrice;
    }
    
    
    
}

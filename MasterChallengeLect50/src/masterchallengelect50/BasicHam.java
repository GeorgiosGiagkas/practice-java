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
public class BasicHam {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;
   
    private String addition1;
    private double priceAdd1;
    
    private String addition2;
    private double priceAdd2;
    
    private String addition3;
    private double priceAdd3;
    
    private String addition4;
    private double priceAdd4;

    public BasicHam(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price= price;

    }


    public void setHamAdd1(String addition1, double priceAdd1){
        this.addition1=addition1;
        this.priceAdd1=priceAdd1;
             
    }
    public void setHamAdd2(String addition2, double priceAdd2){
        this.addition2=addition2;
        this.priceAdd2=priceAdd2;
             
    }
    public void setHamAdd3(String addition3, double priceAdd3){
        this.addition3=addition3;
        this.priceAdd3=priceAdd3;
             
    }
    public void setHamAdd4(String addition4, double priceAdd4){
        this.addition4=addition4;
        this.priceAdd4=priceAdd4;
             
    }
    
    public double hamPriceTotal(){
        double hamPrice=this.price;
        System.out.println("Hamburger name: "+this.name+". Meat type: "+this.meat+
                ". Bread roll type: "+this.breadRollType+". Base price: "+this.price);
        if(this.addition1!=null){
            hamPrice+=this.priceAdd1;
            System.out.println("Addtition "+this.addition1+ " charging extra: "+this.priceAdd1);
        }
        if(this.addition2!=null){
            hamPrice+=this.priceAdd2;
            System.out.println("Addtition "+this.addition2+ " charging extra: "+this.priceAdd2);
        }
        if(this.addition3!=null){
            hamPrice+=this.priceAdd3;
            System.out.println("Addtition "+this.addition3+ " charging extra: "+this.priceAdd3);
        }
        if(this.addition4!=null){
            hamPrice+=this.priceAdd4;
            System.out.println("Addtition "+this.addition4+ " charging extra: "+this.priceAdd4);
        }
        return hamPrice;
    }
    
    
}

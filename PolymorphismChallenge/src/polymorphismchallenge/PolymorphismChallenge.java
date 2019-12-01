
package polymorphismchallenge;

class Car{//defaule access specifier is protected
    private String name;
    private int cylinders;
    private int wheels=4;
    private boolean engine=true;
    
    public Car(String name,int cylinders){
        this.name=name;
        this.cylinders=cylinders;
    }
    
    public void startEngine(){
        System.out.println("Engine is starting");
    }
    public void accelerate(){
        System.out.println("Car "+this.name+" is accelerating!");
    }
    public void brake(){
        System.out.println("Car "+this.name+" is decreasing speed!");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
    
}

class Porche extends Car{
    public Porche(String name, int cylinders){
        super(name,cylinders);
    }
    @Override
    public void startEngine(){
        System.out.println("Engine of Porche is amazing!");
    }
    
    @Override
    public void accelerate(){
        super.accelerate();
        System.out.println("Porche model "+getName()+" is accelerating too fast!");
    }
}
class Fiat extends Car{
    public Fiat(String name, int cylinders){
        super(name,cylinders);
    }
    @Override
    public void startEngine(){
        System.out.println("Engine of Fiat is horrible!");
    }
    
    @Override
    public void accelerate(){
        super.accelerate();
        System.out.println("Fiat model "+getName()+" is accelerating too fast!");
    }
}








public class PolymorphismChallenge {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Porche myPorcheModel = new Porche("X3450F", 4);
//        myPorcheModel.startEngine();
//        myPorcheModel.brake();
//        myPorcheModel.accelerate();
//        
//        
//        Fiat myFiatModel = new Fiat("004TDa",2);
//        myFiatModel.startEngine();
//        myFiatModel.brake();
//        myFiatModel.accelerate();
//        

        Car myCar;//declare Car object newCar
        
        //polymorphism... dynamic binding. Compiler does not know which mehtod to call until run time!
        
        /*
        In Java, all non-static methods are by default "virtual functions." 
        Only methods marked with the keyword final, which cannot be overridden, 
        along with private methods, which are not inherited, are non-virtual.
        
        Quoting from C++:
        Each class with at least one method has a VTable.
        A vtable holds the addresses of methods(instance methods(not final nor priVate) for the specific class.
        Objects of same class have the same VTable.
        
        (final methods cannot be ovveriden, so cannot be virtual)
        (class methods, that is static methods do not refer to instance so they are not virtual)
        */
        for(int i=0;i<=10;i++){
            myCar = randomCar();
            myCar.getName();
            myCar.startEngine();
            myCar.accelerate();
            System.out.println("=============================");
        }
        
        
        
    }
    
    public static Car randomCar(){
        int randNum = (int)(Math.random()*2)+1;
        switch(randNum){
            case 1:
                return new Porche("XOXOXOA",4); 
            case 2:
                return new Fiat("wEWesAO",2);
        }
        
        return null;//return statement null
    }
    
}

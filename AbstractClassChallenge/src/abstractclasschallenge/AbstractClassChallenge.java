/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasschallenge;

/**
 *
 * @author giagkas
 */
public class AbstractClassChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stringData ="Thessaloniki Athens Lamia Heraklion Patra Volos Athens Lamia";
        MyLinkedList myCityList = new MyLinkedList(null);
        String [] data = stringData.split(" ");
        for(String city: data){
            myCityList.addItem(new MyNode(city));
        }
        
        myCityList.goThroughList(myCityList.getRoot());
    }
    
}

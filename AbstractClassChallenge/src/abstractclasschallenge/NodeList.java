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
public interface NodeList {
    MyList getRoot();//head of the list
    boolean addItem(MyList item);
    boolean removeItem(MyList item);
    void goThroughList(MyList root);
}

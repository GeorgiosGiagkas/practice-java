/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacechallenge;

import java.util.ArrayList;

/**
 *
 * @author giagkas
 */
public interface ISavable {
    //no access modifier. The implimentation is taken care in the class that implements
    ArrayList<String> write();
    void read(ArrayList<String> savedValues);
}

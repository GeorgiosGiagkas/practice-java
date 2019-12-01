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
public class MyNode extends MyList {
    
    public MyNode(Object myObject){
        super(myObject);
    }
    
    @Override
    public MyList moveToNextItem(){
        return this.nextItem;
    }
    @Override
    public MyList moveToPreviousItem(){
        return this.previousItem;
    }
    
    @Override
    public MyList setNextItem(MyList myList){
        this.nextItem=myList;
        return this.nextItem;
    }
    @Override
    public MyList setPreviousItem(MyList myList){
        this.previousItem=myList;
        return this.previousItem;
    }
    
    @Override
    public int myCompareTo(MyList myList){
        if(myList!=null){
            return ((String) super.getMyObject()).compareTo(((String)myList.getMyObject()));
        }
        else{
            return -1;
        }
    }
}

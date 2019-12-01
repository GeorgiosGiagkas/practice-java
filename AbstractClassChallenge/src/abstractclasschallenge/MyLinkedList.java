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
public class MyLinkedList implements NodeList {

    private MyList root;
    public MyLinkedList(MyList root){
        this.root=root;
    }
    
    @Override
    public MyList getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(MyList item) {
        if(this.root==null){
            this.root=item;
            return true;
        }
        
        MyList currentItem = this.root;
        
        while(currentItem!=null){
            int comparison= currentItem.myCompareTo(item);
            if(comparison<0){
                //if item is gretter move to right
                if(currentItem.moveToNextItem()!=null){
                currentItem=currentItem.moveToNextItem();
                }
                else{
                    currentItem.setNextItem(item).setPreviousItem(currentItem);
                    return true;
                }
            }
            
            else if(comparison>0){
                if(currentItem.moveToPreviousItem()!=null){
                    currentItem.moveToPreviousItem().setNextItem(item).setPreviousItem(currentItem.moveToPreviousItem());
                    item.setNextItem(currentItem).setPreviousItem(item);
                    
                }
                else{
                    item.setNextItem(this.root).setPreviousItem(item);
                    this.root=item;
                }
                return true;
            }
            else{
                System.out.println(item.getMyObject()+ " already present!Do not add!");
                return false;
            }
            
        }
        return false;
        
    }

    @Override
    public boolean removeItem(MyList item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void goThroughList(MyList root) {
        if(root==null){
            System.out.println("The list is empty");
        }
        else{
            while(root!=null){
                System.out.println(root.getMyObject());
                root=root.moveToNextItem();
            }
        }
    }
    
}

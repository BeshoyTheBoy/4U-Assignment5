/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class MyIntNode {
    
    private int item;
    private MyIntNode next;

    public MyIntNode(int num) {
        item = num;
        next = null;
    }
    
    /**
     * Returns the number stored in the 
     * @return the stored number
     */
    public int getNum(){
        return item;
    }
    
    /**
     * Returns the next node
     * @return the next node
     */
    public MyIntNode getNext(){
        return next;
    }
    
    /**
     * Sets the next node
     * @param node the node to point to
     */
    public void setNext(MyIntNode node){
        next = node;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class A5Q1 {

    private MyIntNode head;
    private int numItems;

    public A5Q1() {
        head = null;
        numItems = 0;
    }

    public void add(int num) {
        // start at beginning of list
        MyIntNode node = head;
        // see if it is the first item
        if (node == null) {
            MyIntNode temp = new MyIntNode(num);
            head = temp;
        } else {
            // go through list and compare values
            for (int i = 0; i < num; i++) {

            }
        }
        // increse the size counter
        numItems++;
    }

    // remove a specific number from the list
    public void remove(int num) {
        MyIntNode node = head;
        // look for number
        for (int i = 0; i < node.getNum(); i++) {
            
        }
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int index) {
        MyIntNode node = head;
        // move the number of times
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

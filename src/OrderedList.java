/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class OrderedList {

    private MyIntNode head;
    private int numItems;

    public OrderedList() {
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
            // travel to the end
            while (node.getNext() != null) {
                node = node.getNext();
            }
            // node is the last node
            // create the new node
            MyIntNode temp = new MyIntNode(num);
            // insert it into the list
            node.setNext(temp);
        }
        // increse the size counter
        numItems++;
    }
    

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int position) {
        MyIntNode node = head;
        // move the number of times
        for (int i = 0; i < position; i++) {
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

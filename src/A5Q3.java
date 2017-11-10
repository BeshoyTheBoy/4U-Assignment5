
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisho
 */
public class A5Q3 {

    public boolean inLang(String word) {
        //create stack
        Stack<Character> charStack = new Stack<Character>();
        //special cases
        //if there is no word
        if (word.length() == 0) {
            return false;
            //if there's only a dollar sign in the word
        } else if (word == "$") {
            return true;
        } else {
            //go through string
            for (int i = 0; i < word.length(); i++) {
                // add characters into stack
                charStack.push(word.charAt(i));
            }
            
            // new array to compare to original string
            char[] compare = new char[word.length()];
            
            //pop characters back out and see if strings equal
            for (int i = 0; i < charStack.size(); i++) {      
                compare[i] = charStack.pop();
            }

            //compare to the original string
            for (int i = 0; i < word.length(); i++) {
                if (compare[i] == word.charAt(i)) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A5Q3 test = new A5Q3();
        
        String word = new String("cat$cat");
        
        System.out.println(test.inLang(word));
    }

}

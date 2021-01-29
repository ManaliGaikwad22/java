// Write a JAVA program that takes given String of words and return the length of the shortest word.

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;

public class taskfiveone {
    public static void main(String[] args) {

        String st = " My name is Manali Gaikwad";
        String word = "";
        String small ;
        String[] w = new String[200];
        int length = 0 ;
        st = st + " ";

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ') {
                word = word + st.charAt(i);
            } else {
                w[length] = word;
                length++;
                word = " ";
            }
        }
        small = w[0];

        for (int k = 0; k < length; k++) {
            if (small.length() > w[k].length())
                small = w[k];
        }
        System.out.println("The length of the shortest word: " + small);
    }

}


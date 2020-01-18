package Main;

import java.util.Arrays;

public class Collection {
    static void display(int array[]) {
        for (int x : array)
            System.out.println(x);
    }

     public static void main (String[] args) {
        int [][] array = {
                {1,2,3,4},
                {5,6,7,8}
        };

        display(array[0]);
        display(array[1]);

         String intArrayString = Arrays.toString(array[1]);
         System.out.println(intArrayString);
    }
}


package Arrays;

import java.util.Arrays;

public class CopyArray {

    // The program copies an array and prints it out

    public static void main(String[] args) {

        int[] tab = {1,2,3,4,5,6,7};
        System.out.println("The original array :"+Arrays.toString(tab));
        int[] tab1 = new int [tab.length];
        int a = 0;

        for (int i=0,j=0;i<tab.length && j<tab1.length;i++) {
            a = tab[i];
            tab1[j] = a;
            j++;
        }
        System.out.println("Copied array: "+Arrays.toString(tab1));
    }
}

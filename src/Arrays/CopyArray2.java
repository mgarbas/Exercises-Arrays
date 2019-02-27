package Arrays;

import java.util.Arrays;

public class CopyArray2 {

    // The program copies an array in two ways

    public static void main(String[] args) {

        int[] tab = {1,2,3,4,5};
        int[] tab1 = new int[tab.length];
        int[] tab2 = Arrays.copyOf(tab,tab.length);

        for (int i=0;i<tab.length;i++) {
            tab1[i] = tab[i];
        }
        System.out.println("Original array: "+Arrays.toString(tab));
        System.out.println("Copy one : "+Arrays.toString(tab1));
        System.out.println("Copy two : "+Arrays.toString(tab2));

    }
}

package Arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ReverseArray {

    // The program reversed the order of an array

    public static void main(String[] args) {

        int[] tab = {1,2,3,4,5,6};
        System.out.println("Original array: "+Arrays.toString(tab));
        for (int i=tab.length-1;i>=0;i--){
            System.out.print(tab[i]+" ");
        }
        ArrayUtils.reverse(tab);
        System.out.println("\n"+"Reversed Arrays: "+Arrays.toString(tab));
    }
}

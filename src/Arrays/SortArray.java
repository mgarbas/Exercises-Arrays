package Arrays;

import java.util.Arrays;

public class SortArray {

    // The program sorts an array

    public static void main(String[] args) {

        int[] tab = {1,34,2,54,21,235,11,67,3,78,42};
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+" ");
        }
    }
}

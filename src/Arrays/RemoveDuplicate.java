package Arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] tab = {1, 234, 1 ,2, 32, 11, 56, 32, 86, 234, 765};
        System.out.println("Original array: "+Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    tab = ArrayUtils.remove(tab, j);
                }
            }
        }System.out.println("Array without duplicates: "+Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

    }
}





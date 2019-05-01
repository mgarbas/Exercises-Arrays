package Arrays;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab = {1,2,32,11,56,32,86,234,765};

        for (int i=0;i<tab.length;i++) {
            for (int j=0;j<tab.length-1;j++) {
                if (tab[j] > tab[j+1]) {
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                    System.out.println(tab[j]);
                }
            }
        }
    }
}

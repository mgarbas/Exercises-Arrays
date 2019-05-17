package Arrays;

import java.util.Arrays;

public class ZeroToEnd2 {

    public static void main(String[] args) {

        int[] tab = {1,0,65,1,0,48,0,64,0,147};

        int zeroIndex = 0;

        for (int i=0;i<tab.length;i++) {
            if (tab[i] != 0) {
                tab[zeroIndex] = tab[i];
                zeroIndex++;
            }
        }
        while (zeroIndex < tab.length) {
            tab[zeroIndex] = 0;
            zeroIndex++;
        }
        System.out.println(Arrays.toString(tab));
    }
}

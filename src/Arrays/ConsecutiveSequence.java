package Arrays;

import java.util.Arrays;

public class ConsecutiveSequence {

    public static void main(String[] args) {

        int[] tab = {12,5,56,47,82,2,63,4,3,100,214};

        Arrays.sort(tab);

        int counter = 1;
        for (int i=0;i<tab.length;i++) {
            for (int j=i+1;j<tab.length;j++) {
                if (tab[j] - tab[i] == 1) {
                    counter++;
                }
            }
        }
        System.out.println("The longest consecutive sequence is: "+counter);
    }
}

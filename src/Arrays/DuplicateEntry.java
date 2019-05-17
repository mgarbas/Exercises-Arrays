package Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class DuplicateEntry {

    // The program finds a duplicated value

    public static void main(String[] args) {

        int[] tab = {43,1,2,3,2,4,23,51,76,43};

        for (int i=0;i<tab.length-1;i++){
            for (int j=i+1;j<tab.length;j++) {
                if (tab[i] == tab[j]){
                    System.out.println("The duplicated value is: " + tab[j]);
                }
            }
        }
    }
}

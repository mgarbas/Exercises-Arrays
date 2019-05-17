package Arrays;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] tab = {{1,0,65,1,0,48,0,64,0,147},{2,4,5,3,2,6,4,2}};

        for (int i=0;i<tab.length;i++) {
            for (int j = 0; j < tab[i].length; j++)


                System.out.print(tab[i][j]+" ");
        }


    }
}

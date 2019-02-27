package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    // The program removes the requested element of an array

    public static void main(String[] args) {

        int[] tab = {1,3,4,26,23,52,12,54,21,87};
        System.out.println(Arrays.toString(tab));
        int[] tab1 = new int[tab.length-1];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the index you want to remove");
        int remove = scan.nextInt();


        for (int i=0,j=0;i<tab.length && j<tab1.length;i++) {
            int a = tab[i];
            if (i==remove) {
            }else {
                tab1[j] = a;
                j++;
            }
        }
        System.out.println(Arrays.toString(tab1));
    }
}

package Arrays;

import java.util.Scanner;

public class FindIndex {

    public static void main(String[] args) {

        int[] tab = {1,2,3,4,5,6,7,8,9,10};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to check");
        int a = scan.nextInt();
        for (int i=0; i<tab.length;i++) {
            if (a == tab[i]) {
                System.out.println("The index of "+a+" is: "+(i+1));
            }
        }
    }
}

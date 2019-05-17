package Arrays;

import java.util.Scanner;

public class PairEquals {

    public static void main(String[] args) {

        int[] tab = {2,46,21,7,45,12,8,43,3,33,54,123,88,65,28,9,10,32};
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        for (int i=0;i<tab.length;i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] + tab[j] == num) {
                    System.out.println("These two numbers added together equal your number: "+tab[i] + " and " + tab[j]);
                }
            }
        }

    }
}

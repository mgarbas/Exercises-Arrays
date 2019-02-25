package Arrays;

import java.util.Scanner;

public class SpecificValue {

    public static void main(String[] args) {

        int[] tab = {23,1,54,2,76,2,45,88,22,13,5,87,103,34,75,321};

        boolean isOrNot = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a value to be checked");
        int a = scan.nextInt();
        for (int i=0; i<tab.length; i++) {
            if (tab[i] == a) {
                isOrNot = true;
            }
        }if (isOrNot == true) {
            System.out.println(a+" is a part of the array");
        }else {
            System.out.println(a+" is not a part of the array");
        }
    }
}

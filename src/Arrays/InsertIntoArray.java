package Arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class InsertIntoArray {

    public static void main(String[] args) {

        int[] tab = {1, 3, 65, 2, 7, 4, 12, 234, 789};
        System.out.println("Original array: "+Arrays.toString(tab));

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the index");
        int index = scan.nextInt();
        System.out.println("Please enter the number");
        int num = scan.nextInt();

        tab = ArrayUtils.insert(index, tab, num);
        System.out.println("Resulting array: "+Arrays.toString(tab));

    }
}

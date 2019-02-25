package Arrays;

public class AverageArray {

    public static void main(String[] args) {

        // The program prints out an avarage of the int array

        int[] tab = {2,43,56,3,2,5,12,1000,45,432,32};
        int sum = 0;
        for (int i =0; i < tab.length; i++) {
            sum += tab[i];
        }
        System.out.println("The average of the array is: "+sum/tab.length);

    }
}

package Arrays;

public class DifferenceLargestSmallest {

    public static void main(String[] args) {

        int[] tab = {43,23,21,65,124,67,2,39,43,26657,32,42};
        int min = tab[0];
        int max = tab[0];

        for (int i=0;i<tab.length;i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        int dif = max - min;
        System.out.println("The difference between the largest and smallest value if the array is: "+dif);
    }
}

package Arrays;

public class SecondSmallest {

    public static void main(String[] args) {

        int[] tab = {23,6,2,12,76,3,56};
        int min = tab[0];
        int secondMin = tab[0];

        for (int i=0;i<tab.length;i++) {
            if (tab[i] < min) {
                secondMin = min;
                min = tab[i];
            }else if (tab[i] < secondMin) {
                secondMin = tab[i];
            }
        }
        System.out.println(secondMin);
    }
}

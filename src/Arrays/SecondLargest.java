package Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int[] tab = {2, 54,42,5337, 21, 6432, 842};
        int max = tab[0];
        int secondMax = tab[0];

        for (int i=0;i<tab.length;i++) {
            if (tab[i] > max){
                secondMax = max;
                max = tab[i];
            }else if (tab[i] > secondMax){
                secondMax = tab[i];
            }
        }

        System.out.println(secondMax);
    }
}

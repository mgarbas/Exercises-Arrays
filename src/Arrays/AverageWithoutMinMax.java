package Arrays;

public class AverageWithoutMinMax {

    public static void main(String[] args) {

        int[] tab = {43,23,21,65,124,67,2,39,43,26657,32,42};
        int min = tab[0];
        int max = tab[0];
        int sum = 0;

        for (int i=0;i<tab.length;i++) {
            sum += tab[i];
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        double noMaxMin = sum - max - min;
        double avg = noMaxMin / (tab.length-2);
        System.out.println(sum);
        System.out.println(noMaxMin);
        System.out.println(avg);
    }
}

package Arrays;

public class CheckIfSumOfTenIsThirty {

    public static void main(String[] args) {

        int[] tab = {1,52,10,36,10,24,689,28,10,366,2,47,58,10,10};

        int counter = 0;
        boolean check = false;

        for (int i=0;i<tab.length;i++) {
            if (tab[i] == 10) {
                counter++;
            }
        }
        if (counter == 3) {
            check = true;
        }
        if (check == true) {
            System.out.println("The sum of tens is thirty");
        }else if (check == false) {
            int sum = counter * 10;
            System.out.println("The sum of ten is not thirty. It is in fact: "+sum);

        }

    }
}

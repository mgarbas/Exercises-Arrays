package Arrays;

public class MissingElement {

    public static void main(String[] args) {

        int[] tab = {1,2,4,5,6,8,9};

        int missing = 0;

        try {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i + 1] - tab[i] != 1) {
                    missing = tab[i] + 1;
                    System.out.println("The missing number in the sequence is: " + missing);
                }
                            }
        }catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}

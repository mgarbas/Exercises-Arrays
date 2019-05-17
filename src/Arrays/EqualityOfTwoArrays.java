package Arrays;

public class EqualityOfTwoArrays {

    public static void main(String[] args) {

        int[] tab = {1,2,3,4,5};
        int[] tab1 = {1,2,3,4,5};

        boolean test = true;

        if (tab.length != tab1.length) {
            test = false;
            System.out.println("Arrays are not equal");
            return;
        }
        for (int i=0;i<tab.length;i++) {
            if (tab[i] != tab1[i]) {
                test = false;
            }
        }
        if (test == true) {
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }
    }
}

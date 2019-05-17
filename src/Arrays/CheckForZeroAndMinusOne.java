package Arrays;

public class CheckForZeroAndMinusOne {

    public static void main(String[] args) {

        int[] tab = {1,3,4,77,42,24,6,-1,43,12};

        boolean check = true;

        for ( int i=0;i<tab.length;i++) {
            if (tab[i] == 0 || tab[i] == -1) {
                check = false;
            }
        }
        if (check == true) {
            System.out.println("The array does not contain 0 or -1");
        }else {
            System.out.println("The array contains 0 or -1 or both");
        }
    }
}

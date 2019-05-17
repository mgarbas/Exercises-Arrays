package Arrays;

public class RemoveDupicatesShowLength {

    public static void main(String[] args) {

        int[] tab = {1,25,36,48,65,25,48,2,36,47,51};

        int counter = 0;

        for (int i=0;i<tab.length;i++) {
            for (int j=i+1;j<tab.length;j++) {
                if (tab[i] == tab[j]) {
                    counter++;

                }
            }
        }
        int newLength = tab.length - counter;
        System.out.println("Discounting the dupliactes the length of the array is: "+newLength);
    }
}

package Arrays;

public class CommonInt {

    public static void main(String[] args) {

        int[] tab = {2,45,22,5,23,7,43};
        int[] tab2 = {65,87,345,32,7,231};
        int dupl;

        for (int i=0;i<tab.length;i++) {
            for (int j=0;j<tab2.length;j++) {
                if (tab[i] == tab2[j]) {
                    dupl = tab[i];
                    System.out.println("The duplicate is: "+dupl);
                }
            }
        }

    }
}

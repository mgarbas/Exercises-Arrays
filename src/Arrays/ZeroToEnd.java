package Arrays;


public class ZeroToEnd {

    public static void main(String[] args) {

        int[] tab = {1,0,5,14,0,36,21,48,0,147};

        for (int i=0;i<tab.length;i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] == 0) {
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        for (int i : tab) {
            System.out.print(i+" ");
        }

    }
}

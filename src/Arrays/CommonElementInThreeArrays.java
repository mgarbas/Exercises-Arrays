package Arrays;

public class CommonElementInThreeArrays {

    public static void main(String[] args) {

        int[] tab = {2,4,7,8,12,24,123};
        int[] tab1 = {3,5,8,11,13,15,24,25,45,78};
        int[] tab2 = {1,6,8,14,16,24};

        int common = 0;

        for (int i=0;i<tab.length;i++) {
            for (int j=0;j<tab1.length;j++) {
                for (int k=0;k<tab2.length;k++) {
                    if (tab[i] == tab1[j] && tab[i] == tab2[k]) {
                        common = tab[i];
                        System.out.println("The common element is the arrays is: "+common);

                    }
                }
            }
        }
    }
}

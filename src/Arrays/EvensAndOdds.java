package Arrays;

public class EvensAndOdds {

    public static void main(String[] args) {

        int[] tab = {1,25,4,65,39,54,21,7,96,4,41,63,85,45,2};

        int even = 0;
        int odd = 0;

        for (int i=0;i<tab.length;i++) {
            if (tab[i] % 2 == 0) {
                even++;
            }else if (tab[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("The number of even values is: "+even);
        System.out.println("The number of odd values is: "+odd);
    }
}

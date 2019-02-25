package Arrays;

public class GridArray {

    public static void main(String[] args) {

        // The program prints out a grid of stars 10x10

        int[][] tab = new int[10][10];

        for (int i=0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("*", tab[i][j]);

            }
            System.out.println();
        }
    }
}

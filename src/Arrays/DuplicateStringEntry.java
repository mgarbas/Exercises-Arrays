package Arrays;

public class DuplicateStringEntry {

    // The program finds a duplicated String value

    public static void main(String[] args) {

        String[] tab = {"dog","cat","mouse","sparrow","shark","cat","otter"};

        for (int i=0;i<tab.length-1;i++){
            for (int j=i+1;j<tab.length;j++) {
                if ((tab[i].equals(tab[j])) && (i !=j)) {
                    System.out.println("The duplicated value is: " + tab[j]);
                }
            }
        }
    }
}

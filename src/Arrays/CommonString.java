package Arrays;

public class CommonString {

    public static void main(String[] args) {

        String[] str1 = {"ksck", "scsa", "ksjnjca", "oijsa"};
        String[] str2 = {"jskcj", "sjnjca", "xmjhs", "ksck"};
        String dupl = "";

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i].equals(str2[j])) {
                    dupl = str1[i];
                    System.out.println("The duplicate entry is: " + dupl);
                }
            }
        }
    }
}


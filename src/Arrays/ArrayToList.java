package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {

    public static void main(String[] args) {

        String[] tab = {"cat","mouse","duck","horse"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(tab));
        System.out.println(list);
    }
}

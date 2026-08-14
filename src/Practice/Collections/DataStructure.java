package Practice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElements {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(18);
        list.add(4);
        list.add(6);

        System.out.println(list.indexOf(3));
    }
}

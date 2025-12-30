package Simple;


import java.util.ArrayList;
import java.util.List;

public class ZeroOne {
    public static void main(String[] args) {

        // Step 1: Create list
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);

        // Step 2: Print all 0s
        System.out.print("0s: ");
        for (int num : list) {
            if (num == 0) {
                System.out.print(num);
            }
        }

        // Step 3: Print all 1s
        System.out.print("\n1s: ");
        for (int num : list) {
            if (num == 1) {
                System.out.print(num);
            }
        }
    }
}

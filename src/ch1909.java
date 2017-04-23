
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ch1909 {

    public static void main(String[] args) {
        ArrayList<Integer> List = getArratList(95, 64, 62);
        System.out.println("before sort: " + List);
        ch1909.sort(List);
        System.out.println("after sort: " + List);

    }

    public static ArrayList<Integer> getArratList(int a, int b, int c) {
        Integer[] temparray = {new Integer(a), new Integer(b), new Integer(c)};
        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(temparray));
        return List;
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);}

//--------found from internet. clear and nice coding.-----
//        E currentMin;
//        int currentMinIndex;
//
//        for (int i = 0; i < list.size() - 1; i++) {
//            // Find the minimum in the ArrayList
//            currentMin = list.get(i);
//            currentMinIndex = i;
//
//            for (int j = i + 1; j < list.size(); j++) {
//                if (currentMin.compareTo(list.get(j)) > 0) {
//                    currentMin = list.get(j);
//                    currentMinIndex = j;
//                }
//            }
//
//            // Swap list.get(i) wtih list.get(currentMinIndex) if necessary;
//            if (currentMinIndex != i) {
//                list.set(currentMinIndex, list.get(i));
//                list.set(i, currentMin);
//            }
//        }

}

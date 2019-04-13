package stroke;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class ArrayStroke {
    public static void traverse(int[] ints){
        for(int i : ints)
            System.out.print(i + "\t");
    }
    public static void main(String[] args) {
        //1. Arrays provides a lot methods to transform array into collections
        int[] ints = {1, 2, 3};
        List<Integer> list =
                Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println(list);

        //2. copy
        float[] f1 = {1.4f, 2.0f, 3.5f, 4.2f};
        float[] f2 = Arrays.copyOf(f1, f1.length - 1);
        //we can also use copyOfRange
        float[] f3 = Arrays.copyOfRange(f1, 0, f1.length);
        for(float f : f1)
            System.out.println(f + "\t");

        //3. fill
        int[] ints1 = new int[5];
        Arrays.fill(ints1, -1);

        //4. sort
        int[] ints2 = {3, 2, 1};
        Arrays.sort(ints2);
        traverse(ints2);

        //5.binary search
        System.out.println("\nindex of 2 in ints2: "
                + Arrays.binarySearch(ints2, 2));

        //6. toString
        System.out.println(Arrays.toString(ints2));

        //7. equals for two arrays
        double[] d1 = {1.0, 2.0, 3.0};
        double[] d2 = {1.0, 2.0, 3.0};
        System.out.println(Arrays.equals(d1, d2));

        String[] names1 = {"Sheep Core", "Marshall Lee"};
        String[] names2 = { "Sheep Core","Marshall Lee"};
        System.out.println(Arrays.equals(names1, names2));

    }

}

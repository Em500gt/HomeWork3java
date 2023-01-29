// Реализовать алгоритм сортировки слиянием
import java.util.Arrays;

public class Task1{
    public static int[] Sort(int[] Arr) {
        int[] first = Arrays.copyOf(Arr, Arr.length);
        int[] second = new int[Arr.length];
        int[] result = SortInner(first, second, 0, Arr.length);
        return result;
    }

    public static int[] SortInner(int[] f, int[] s, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return f;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = SortInner(f, s, startIndex, middle);
        int[] sorted2 = SortInner(f, s, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == f ? s : f;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {5, 6, 3, 1, 5, 15, 4};
        int[] result = Sort(sortArr);
        System.out.println(Arrays.toString(result));
    }
}
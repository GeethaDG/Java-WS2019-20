package de.ovgu.icse.assignment03;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static <T extends Comparable<T>> void quickSort(T[] a) {
        qsort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<T>> void qsort(T[] a, int first, int last) {
        if (first < last) {
            int i = first, j = last;
            T temp = a[(i + j) / 2];
            do {
                while (a[i].compareTo(temp) < 0)
                    i++;
                while (temp.compareTo(a[j]) < 0)
                    j--;
                if (i <= j) {
                    T temp2 = a[i];
                    a[i] = a[j];
                    a[j] = temp2;
                    i++;
                    j--;
                }
            } while (i <= j);
            qsort(a, first, j);
            qsort(a, i, last);
        }
    }

    public static <T> void mergeSort(T[] a, T[] copy, int start, int end, Comparator<T> c) {
        int i, j, k;
        if (start < end) {
            int center = (start + end) / 2;
            mergeSort(a, copy, start, center, c);
            mergeSort(a, copy, center + 1, end, c);
            for (i = center + 1; i > start; i--)
                copy[i - 1] = a[i - 1];
            for (j = center; j < end; j++)
                copy[end + center - j] = a[j + 1];
            for (k = start; k <= end; k++) {
                if (c.compare(copy[i], copy[j]) < 0)
                    a[k] = copy[i++];
                else
                    a[k] = copy[j--];
            }
        }
    }

    public static <T> void mergeSort(T[] a, Comparator<T> c) {
        mergeSort(a, (T[]) new Object[a.length], 0, a.length - 1, c);
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{90, 56, 67, 89, 70, 7, 8};
        quickSort(a);
        System.out.println("QuickSort" + Arrays.toString(a));
        String[] b = {"Apple", "Oranges", "Pizza", "Greek Salad", "Rice", "Pringles", "Tuna", "Lamb Leg Roast",
                "Broccoli", "Mustard"};
        Comparator<String> ascending = new Comparator<String>() {
            public int compare(String m, String n) {
                return m.compareTo(n);
            }
        };

        Comparator<String> descending = new Comparator<String>() {
            public int compare(String m, String n) {
                return m.compareTo(n);
            }
        };

        mergeSort(b, ascending);
        System.out.print("Ascending" + "\n" + Arrays.toString(b));
        mergeSort(b, descending);
        System.out.print("Descending" + "\n" + Arrays.toString(b));
    }
}

package Test1.Trees.src.summary.home;

import java.util.*;
import java.util.stream.IntStream;

public class Home {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 ={1, 0, 6, 15, 6, 4, 7, 0};
        int[] arr3 ={0,3,-2,4,3,2};

        System.out.println(searchCopyElement(arr,arr2));
        System.out.println(searchCopyElementAndDel(arr3));
        System.out.println(searchSecondElementOfSize(arr3));
        System.out.println(searchSecondElementOfSmallSize(arr3));


    }
    /*
    Напишите программу на Java
    для поиска общих элементов между двумя массивами целых чисел
     */
    public static List<Integer> searchCopyElement(int[]arr, int[]arr2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j])
                    list.add(arr[i]);
            }
        }

        return list;
    }
    /*
    Напишите программу на Java для удаления повторяющихся элементов из массива.
     */
    public static Set<Integer> searchCopyElementAndDel(int[]arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set;
    }
    /*
    Напишите программу на Java для поиска второго по величине элемента в массиве.
     */
    public static int searchSecondElementOfSize(int[]arr) {
        int secondElement = 0;
        int biggestElement = 0;
        for (int i : arr) {
            if (i > biggestElement) {
                secondElement = biggestElement;
                biggestElement = i;
            }
        }
        return secondElement;
    }
    /*
    Напишите программу Java для поиска второго наименьшего элемента в массиве.
     */
    public static int searchSecondElementOfSmallSize(int[]arr) {
        int secondElement = 0;
        int biggestElement = 0;
        for (int i : arr) {
            if (i < biggestElement) {
                secondElement = biggestElement;
                biggestElement = i;
            }
        }
        return secondElement;
    }
}

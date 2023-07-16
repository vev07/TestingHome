package Test1.Trees.src.summary.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {

    @Test
    void searchCopyElement() {
        int[] arr = { 1,2, 5, 5, 8, 9, 7, 10};
        int[] arr2 ={ 1,0, 6, 15, 6, 4, 7, 0};

        List<Integer> result = List.of(1, 7);
        Assertions.assertIterableEquals(result, Home.searchCopyElement(arr,arr2));
    }

    @Test
    void searchCopyElementAndDel() {
        int[] arr3 ={0,3,-2,4,3,2};
        List<Integer> result = List.of(0, -2, 2, 3, 4);
        Assertions.assertIterableEquals(result, Home.searchCopyElementAndDel(arr3));
    }

    @Test
    void searchSecondElementOfSize() {
        int[] arr3 ={0,3,-2,4,3,2};
        int result = 3;
        Assertions.assertEquals(result, Home.searchSecondElementOfSize(arr3));
    }

    @Test
    void searchSecondElementOfSmallSize() {
        int[] arr3 ={0,3,-2,4,3,2};
        int result = 0;
        Assertions.assertEquals(result, Home.searchSecondElementOfSmallSize(arr3));
    }
}
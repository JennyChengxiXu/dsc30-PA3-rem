import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortsTest {

    @org.junit.jupiter.api.Test
    void insertionSort() {
        Sorts newSort= new Sorts();
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(2);
        arr1.add(7);
        arr1.add(6);
        arr1.add(1);
        arr1.add(9);
        arr1.add(3);
        arr1.add(5);
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(1);
        arr2.add(3);
        arr2.add(2);
        ArrayList<Integer> arr3= new ArrayList<Integer>();
        arr3.add(5);
        arr3.add(0);
        arr3.add(1);
        arr3.add(6);
        arr3.add(3);
        arr3.add(8);
        arr3.add(4);
        List<Integer> answer1= new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 6, 7, 9));
        List<Integer> answer2= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        List<Integer> answer3= new ArrayList<>(Arrays.asList(0, 1, 3, 4, 5, 6, 8));
        newSort.InsertionSort(arr1,0,arr1.size()-1);
        newSort.InsertionSort(arr2,0,arr2.size()-1);
        newSort.InsertionSort(arr3,0,arr3.size()-1);
        Assertions.assertEquals(arr1,answer1);
        Assertions.assertEquals(arr2,answer2);
        Assertions.assertEquals(arr3,answer3);
    }

    @org.junit.jupiter.api.Test
    void quickSort() {
        Sorts newSort= new Sorts();
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(2);
        arr1.add(7);
        arr1.add(6);
        arr1.add(1);
        arr1.add(9);
        arr1.add(3);
        arr1.add(5);
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(1);
        arr2.add(3);
        arr2.add(2);
        ArrayList<Integer> arr3= new ArrayList<Integer>();
        arr3.add(5);
        arr3.add(0);
        arr3.add(1);
        arr3.add(6);
        arr3.add(3);
        arr3.add(8);
        arr3.add(4);
        List<Integer> answer1= new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 6, 7, 9));
        List<Integer> answer2= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        List<Integer> answer3= new ArrayList<>(Arrays.asList(0, 1, 3, 4, 5, 6, 8));
        newSort.QuickSort(arr1,0,arr1.size()-1);
        newSort.QuickSort(arr2,0,arr2.size()-1);
        newSort.QuickSort(arr3,0,arr3.size()-1);
        Assertions.assertEquals(arr1,answer1);
        Assertions.assertEquals(arr2,answer2);
        Assertions.assertEquals(arr3,answer3);
    }
    @org.junit.jupiter.api.Test
    void partition() {
        Sorts newSort= new Sorts();
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(2);
        arr1.add(7);
        arr1.add(6);
        arr1.add(1);
        arr1.add(9);
        arr1.add(3);
        arr1.add(5);
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(1);
        arr2.add(3);
        arr2.add(2);
        ArrayList<Integer> arr3= new ArrayList<Integer>();
        arr3.add(5);
        arr3.add(0);
        arr3.add(1);
        arr3.add(6);
        arr3.add(3);
        arr3.add(8);
        arr3.add(4);
        List<Integer> answer1= new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 6, 7, 9));
        List<Integer> answer2= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        List<Integer> answer3= new ArrayList<>(Arrays.asList(0, 1, 3, 4, 5, 6, 8));
        newSort.QuickSort(arr1,0,arr1.size()-1);
        newSort.QuickSort(arr2,0,arr2.size()-1);
        newSort.QuickSort(arr3,0,arr3.size()-1);
        Assertions.assertEquals(arr1,answer1);
        Assertions.assertEquals(arr2,answer2);
        Assertions.assertEquals(arr3,answer3);
    }

    @org.junit.jupiter.api.Test
    void modified_QuickSort() {
        Sorts newSort= new Sorts();
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(2);
        arr1.add(7);
        arr1.add(6);
        arr1.add(1);
        arr1.add(9);
        arr1.add(3);
        arr1.add(5);
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(1);
        arr2.add(3);
        arr2.add(2);
        ArrayList<Integer> arr3= new ArrayList<Integer>();
        arr3.add(5);
        arr3.add(0);
        arr3.add(1);
        arr3.add(6);
        arr3.add(3);
        arr3.add(8);
        arr3.add(4);
        List<Integer> answer1= new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 6, 7, 9));
        List<Integer> answer2= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        List<Integer> answer3= new ArrayList<>(Arrays.asList(0, 1, 3, 4, 5, 6, 8));
        newSort.Modified_QuickSort(arr1,0,arr1.size()-1,3);
        newSort.Modified_QuickSort(arr2,0,arr2.size()-1,3);
        newSort.Modified_QuickSort(arr3,0,arr3.size()-1,3);
        Assertions.assertEquals(arr1,answer1);
        Assertions.assertEquals(arr2,answer2);
        Assertions.assertEquals(arr3,answer3);
    }

    @org.junit.jupiter.api.Test
    void bucketSort() {
        Sorts newSort= new Sorts();
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(2);
        arr1.add(7);
        arr1.add(6);
        arr1.add(1);
        arr1.add(9);
        arr1.add(3);
        arr1.add(5);
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(1);
        arr2.add(3);
        arr2.add(2);
        ArrayList<Integer> arr3= new ArrayList<Integer>();
        arr3.add(5);
        arr3.add(0);
        arr3.add(1);
        arr3.add(6);
        arr3.add(3);
        arr3.add(8);
        arr3.add(4);
        List<Integer> answer1= new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 6, 7, 9));
        List<Integer> answer2= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        List<Integer> answer3= new ArrayList<>(Arrays.asList(0, 1, 3, 4, 5, 6, 8));
        Assertions.assertEquals(newSort.bucketSort(arr1),answer1);
        Assertions.assertEquals(newSort.bucketSort(arr2),answer2);
        Assertions.assertEquals(newSort.bucketSort(arr3),answer3);
    }

    @org.junit.jupiter.api.Test
    void countSort() {
        Sorts newSort= new Sorts();
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(2);
        arr1.add(7);
        arr1.add(6);
        arr1.add(1);
        arr1.add(9);
        arr1.add(3);
        arr1.add(5);
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(1);
        arr2.add(3);
        arr2.add(2);
        ArrayList<Integer> arr3= new ArrayList<Integer>();
        arr3.add(5);
        arr3.add(0);
        arr3.add(1);
        arr3.add(6);
        arr3.add(3);
        arr3.add(8);
        arr3.add(4);
        List<Integer> answer1= new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 6, 7, 9));
        List<Integer> answer2= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        List<Integer> answer3= new ArrayList<>(Arrays.asList(0, 1, 3, 4, 5, 6, 8));
        Assertions.assertEquals(newSort.countSort(arr1),answer1);
        Assertions.assertEquals(newSort.countSort(arr2),answer2);
        Assertions.assertEquals(newSort.countSort(arr3),answer3);
    }
}
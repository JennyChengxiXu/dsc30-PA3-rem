/*
 * NAME: Chengxi XU
 * PID:  A17461647
 */

//Provided imports, feel free to use these if needed
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a class called Sorts, that includes different methods to sort arrays.
 */
public class Sorts {
    public int divide=2;
    /**
     * This method performs insertion sort on the input arraylist
     *
     * @param list The arraylist we want to sort
     * @param start The inital index on subsection of Arraylist we want to sort
     * @param end The final index of the subsection of Arraylist we want to sort
     */
    public void InsertionSort(ArrayList<Integer> list, int start, int end) {
        int current=0;
        if(start<end){
            // for loop to find the number at i position its final position
            for (int i = start+1; i <=end; i++) {
                int preIndex=i-1;
                int standard=list.get(preIndex);
                current = list.get(i);
                int currentPosition=i;
                // find the number at i position its final position in partially sorted part
                while (standard>current){
                    list.set(preIndex,current);
                    list.set(currentPosition,standard);
                    if(preIndex==0){
                        break;
                    }else if(preIndex!=0){
                        preIndex--;
                        currentPosition--;
                        standard=list.get(preIndex);

                    }

                }
            }
        }
    }

    /**
     * This method performs merge sort on the input arraylist
     *
     * @param list The arraylist we want to sort
     * @param start The inital index on subsection of Arraylist we want to sort
     * @param end The final index of the subsection of Arraylist we want to sort
     */
    public void MergeSort(ArrayList<Integer> list, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            MergeSort(list, start, mid);
            MergeSort(list, mid + 1, end);

            merge(list, start, mid, end);
        }
    }

    /**
     * merge helper function for MergeSort
     *
     * @param arr The arraylist we want to sort
     * @param l left-most index we want to merge
     * @param m the middle index we want to merge
     * @param r right-most index we want to merge
     */
    private void merge(ArrayList<Integer> arr, int l, int m, int r) {

        int mergedSize = r - l + 1;

        ArrayList<Integer> mergedNums = new ArrayList<>();
        int left = l, right = m + 1;
        while (left <= m && right <= r) {
            if (arr.get(left).compareTo(arr.get(right)) <= 0) {
                mergedNums.add(arr.get(left));
                left++;
            } else {
                mergedNums.add(arr.get(right));
                right++;
            }
        }

        while (left <= m) {
            mergedNums.add(arr.get(left));
            left++;
        }
        while (right <= r) {
            mergedNums.add(arr.get(right));
            right++;
        }
        for (int i = 0; i < mergedSize; i++) {
            arr.set(l + i, mergedNums.get(i));
        }
    }

    /**
     * this recursion method quicksort
     * right is larger that it.
     * if the length between the start and the end, is smaller or equal to
     * cutoff, then we sort the array by insertion, otherwise quicksort
     * @param list the input list
     * @param start the position the sorting starts
     * @param end the position the sorting ends
     * @return the completely sorted version of the input array
     */
    public void QuickSort(ArrayList<Integer> list, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(list, start, end);
            QuickSort(list, start, pivotIndex - 1);
            QuickSort(list, pivotIndex + 1, end);
        }
    }

    /**
     * this helper settles the midpoint pivot into a position that
     * elements on its left is smaller or equal to it, elements on its
     * right is larger that it.
     * if the length between the start and the end, is smaller or equal to
     * cutoff, then we sort the array by insertion, otherwise quicksort
     * @param arr the input list
     * @param l the position the sorting starts
     * @param h the position the sorting ends
     * @return the partially sorted version of the input array
     */
    private int partition(ArrayList<Integer> arr, int l, int h) {
        int midpoint = 2;
        int pivotIndex = (int) (h - l) / midpoint+l;
        int pivot = arr.get(pivotIndex);
        int initial= arr.get(l);
        arr.set(pivotIndex,initial);
        arr.set(l,pivot);
        int i=l+1;
        int j=h;
        /* loop through other elements than the pivot to see whether it is larger or smaller
        than the pivot
         */
        while (i<=j){
            //move the l to right till see an element larger than pivot
            while(i<=j && arr.get(i)<=pivot){
                i++;
            }
            //move the h to left till see an element smaller or equal to pivot
            while(i<=j && arr.get(j)>pivot){
                j--;
            }
            if(i<j){
                int tem=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,tem);


            }
        }
        int tep=arr.get(l);
        arr.set(l,arr.get(j));
        arr.set(j,tep);

        return j;
    }

    /**
     * this helper sorts the array with both quicksort and insertion sort
     * if the length between the start and the end, is smaller or equal to
     * cutoff, then we sort the array by insertion, otherwise quicksort
     * @param list the input list
     * @param start the position the sorting starts
     * @param end the position the sorting ends
     * @param cutoff the maximum length of array between start and end that use insertion
     * @return the sorted version of the input array
     */
    public void Modified_QuickSort(ArrayList<Integer> list, int start, int end, int cutoff) {
        if (end > start) {
            if (end - start + 1 <= cutoff) {
                InsertionSort(list, start, end);
            } else {
                int pivotIndex = partition(list, start, end);
                Modified_QuickSort(list, start, pivotIndex - 1,cutoff);
                Modified_QuickSort(list, pivotIndex + 1, end,cutoff);
            }
        }
    }

    /**
     * this helper finds the appropriate number of buckets you should allocate
     * based on the range of the values in the input list
     * @param list the input list to bucket sort
     * @return number of buckets
     */
    private int assignNumBuckets(ArrayList<Integer> list) {
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        return (int) Math.sqrt(max - min) + 1;
    }

    /**
     * this helper finds the appropriate bucket index that a data should be
     * placed in
     * @param data a particular data from the input list if you are using
     *             loop iteration
     * @param numBuckets number of buckets
     * @param listMin the smallest element of the input list
     * @return the index of the bucket for which the particular data should
     * be placed in
     */
    private int assignBucketIndex(Integer data, int numBuckets, Integer listMin) {
        return (data - listMin) / numBuckets;
    }

    /**
     * this method performs bucketsort on input array.
     * @param list the to be sorted input list
     * @return the sorted version
     */
    public ArrayList<Integer> bucketSort(ArrayList<Integer> list) {
        ArrayList<Integer> sorted= new ArrayList<Integer>();
        int bucketNum= assignNumBuckets(list);
        List<Integer>[] buckets = new List[bucketNum];
        // for loop to create arraylists in the array buckets
        for (int i = 0; i < bucketNum; i++) {
            buckets[i] = new ArrayList<>();
        }
        Integer min = Collections.min(list);
        // for loop the list to find its position in buckets
        for(int i=0; i< list.size();i++){
            int position=assignBucketIndex(list.get(i),bucketNum,min);
            buckets[position].add(list.get(i));

        }
            /* for loop the buckets, and insertion sort the bucket, pull elements in order into
            the output arraylist  sorted.
             */
        for (int i=0; i<bucketNum;i++){
            if (buckets[i].size()!=0){
                ArrayList<Integer> tem= (ArrayList<Integer>) buckets[i];
                InsertionSort(tem,0,buckets[i].size()-1);
                for (int j = 0; j <tem.size(); j++){
                    sorted.add((Integer) tem.get(j));
                }

            }
        }
        return sorted;
    }

    /**
     * this method performs countSort on input array.
     * @param list the to be sorted input list
     * @return the sorted version
     */

    public ArrayList<Integer> countSort(ArrayList<Integer> list) {
        int max = 0;
        // find the largest element in list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        // fill count with the number of elements at position element
        int[] count = new int[max + 1];
        for (int i = 0; i < list.size(); i++) {
            count[list.get(i)]=count[list.get(i)]+1;
        }
        // make the number of position i be the sum of all elements in front of it
        for (int i = 1; i <= max; i++) {
            count[i] += count[i-1];
        }
        ArrayList<Integer> sorted = new ArrayList<Integer>(list.size());
        //create an arraylist of size(list.size())
        for (int i = 0; i < list.size(); i++) {
            sorted.add(0);
        }
        // pull elements into sorted according to the number at its position in count -1.
        for (int i = 0; i < list.size(); i++) {
            int position= count[list.get(i)]-1;
            sorted.set(position,list.get(i));
            count[list.get(i)]=count[list.get(i)]-1;

        }

        return sorted;
    }
}
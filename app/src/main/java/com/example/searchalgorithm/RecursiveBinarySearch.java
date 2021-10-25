package com.example.searchalgorithm;

import android.util.Log;

public class RecursiveBinarySearch {

    int a[] = {1, 2, 5, 8, 9, 10, 23, 45, 67, 78};
    private int mid, key = 7;

    public void BinarySerach() {
        BinarySearch(a, 0, a.length - 1);
    }

    private int BinarySearch(int a[], int low, int high) {

        if (high >= low) {
            mid = (low + high) / 2;

            if (key == a[mid]) {
                Log.v("RecursiveBinarySearch", "Element" + key + "is  found at:" + mid);
                return 1;
            }
            if (key > a[mid])
                return BinarySearch(a, mid + 1, high);

            return BinarySearch(a, low, mid - 1);

        } else {
            Log.v("RecursiveBinarySearch", "Element not found");
            return -1;
        }


    }
}

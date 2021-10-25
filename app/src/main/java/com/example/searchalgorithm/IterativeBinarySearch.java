package com.example.searchalgorithm;

import android.util.Log;

public class IterativeBinarySearch {
    int a[] = {1, 2, 5, 8, 9, 10, 23, 45, 67, 78};
    private int mid, key = 1678;

    public void BinarySerach() {
        BinarySearch(0, a.length);
    }

    private void BinarySearch(int low, int high) {

        while (low < high) {
            mid = (low + high) / 2;
            if (key == a[mid]) {
                Log.v("IterativeBinarySearch", "Element" + key + "is  found at:" + mid);
                return;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else if (key < a[mid]) {
                high = mid - 1;
            }

        }

        Log.v("IterativeBinarySearch", "Element not found");

    }
}

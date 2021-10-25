package com.example.searchalgorithm;

import android.util.Log;

public class LinearSearch {

    int a[] = {1, 2, 5, 8, 9, 10, 23, 45, 67, 78};
    private int mid, key = 78;
    boolean found = false;

    public void LinearSearch() {
        startSearch();
    }

    private void startSearch() {

        for(int i=0;i< a.length;i++) {
            if(a[i] == key) {
                found = true;
                Log.v("LinearSearch", "Element" + key + "is  found at:" + i);
            }
        }
        if(!found) {
            Log.v("LinearSearch", "Element not found");
        }

    }
}

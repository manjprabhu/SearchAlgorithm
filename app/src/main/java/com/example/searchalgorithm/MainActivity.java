package com.example.searchalgorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecursiveBinarySearch search = new RecursiveBinarySearch();
//        search.BinarySerach();

        IterativeBinarySearch binarySearch = new IterativeBinarySearch();
        binarySearch.BinarySerach();
    }
}
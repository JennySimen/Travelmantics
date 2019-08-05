package com.example.cressence.travelmantics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ArrayList<TravelDeal> deals;
    private mFirebaseDatabase mFirebaseDatabase;
    private mFirebaseReference  mFirebaseReference;
    private ChildEventListerner mChildListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mFirebaseReference = FirebaseReference.getReference().child("traveldeals");

        mChildListener = new childEventListener() {


        }
    }
}

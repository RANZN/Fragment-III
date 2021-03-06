package com.ranzan.fragment_iiicommunicationandbackstackiw;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class StudentDetailsActivity extends AppCompatActivity implements CommunicationListener {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        launchStudentPersonalDetailsFragment();
    }

    private void launchStudentPersonalDetailsFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment fragment = new StudentPersonalDetailsFragment();
        fragmentTransaction.add(R.id.container, fragment, "personal").commit();
    }

    @Override
    public void launchPerformanceFragment(Bundle bundle) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StudentPerformanceDetailsFragment fragment=new StudentPerformanceDetailsFragment();
        fragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.container,fragment,"performance").addToBackStack("").commit();

    }
}
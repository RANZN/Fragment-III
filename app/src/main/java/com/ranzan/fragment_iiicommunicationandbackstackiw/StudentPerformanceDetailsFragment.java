package com.ranzan.fragment_iiicommunicationandbackstackiw;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class StudentPerformanceDetailsFragment extends Fragment {
    private String name;
    private int age;
    private EditText etGrade,etPercentage;
    private Button previewBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_perfomance_detials, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString("name");
            age = getArguments().getInt("age");
        }
    }

    private void initViews(View v) {
        etGrade=v.findViewById(R.id.etStudentGrade);
        etPercentage=v.findViewById(R.id.etStudentPercentage);
        previewBtn=v.findViewById(R.id.btnPreview);
        previewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grade=etGrade.getText().toString();
                String percentage=etPercentage.getText().toString();
                Model model=new Model(name,age,grade,percentage);
                Intent intent=new Intent(getContext(),PreviewActivity.class);
                intent.putExtra("model",model);
                startActivity(intent);
            }
        });
    }
}
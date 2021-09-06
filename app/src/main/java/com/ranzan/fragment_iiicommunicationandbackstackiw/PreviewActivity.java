package com.ranzan.fragment_iiicommunicationandbackstackiw;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewActivity extends AppCompatActivity {
    private TextView tvName, tvAge, tvGrade, tvPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initViews();
        getDataFromIntent();

    }

    private void getDataFromIntent() {
        Model model = (Model) getIntent().getSerializableExtra("model");
        tvName.setText(model.getName());
        tvAge.setText(model.getAge() + "");
        tvGrade.setText(model.getGrade());
        tvPercentage.setText(model.getPercentage());
    }

    private void initViews() {
        tvName = findViewById(R.id.tvStudentName);
        tvAge = findViewById(R.id.tvStudentAge);
        tvGrade = findViewById(R.id.tvStudentGrade);
        tvPercentage = findViewById(R.id.tvStudentPercentage);
    }
}
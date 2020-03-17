package com.example.a20200317_02_java_first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a20200317_02_java_first.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = binding.inputEdt.getText().toString();

                binding.resultTxt.setText(input);
                binding.inputEdt.setText("");
            }
        });

    }
}

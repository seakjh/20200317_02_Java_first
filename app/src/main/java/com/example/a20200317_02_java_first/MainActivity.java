package com.example.a20200317_02_java_first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a20200317_02_java_first.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("버튼클릭", "입력 버튼 눌림");

                String input = binding.inputEdt.getText().toString();

                Log.d("입력값확인", input);

                binding.resultTxt.setText(input);
                binding.inputEdt.setText("");
            }
        });

//        입력한 비밀번호가 1234일때 로그인버튼을 누르면
//        토스트로 로그인성공
//        그외의 비밀번호로 로그인 버튼을 누르면
//        토스트로 잘못된 비밀번호입니다

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              입력한 값을 변수로 저장
                String pw = binding.pwEdt.getText().toString();
                
//                1234 / 아니냐
                if(pw.equals("1234")){
                    Toast.makeText(MainActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "잘못된 비번입니다.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

package com.example.mobilerobot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.robotemi.sdk.Robot;
import com.robotemi.sdk.TtsRequest;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    private Robot robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn =(Button)findViewById(R.id.btn);
        robot = Robot.getInstance();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //서버에서 센서 신호 받아서 이동, 위치 알림 보내기, 암구호 요청(입력페이지 필요함 intent),
                //암구호 입력시 홈베이스 이동, 미입력시 촬영 및 따라가기, 관리자 도착시 홈베이스
            }
        });
    }
}
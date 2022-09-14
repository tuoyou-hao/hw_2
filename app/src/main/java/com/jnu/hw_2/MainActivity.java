package com.jnu.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Context textviewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textviewTitle = findViewById(R.id.textView);
        Button chinese_button = findViewById(R.id.chinese);
        Button english_button = findViewById(R.id.english);

        chinese_button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                textviewTitle.setText(R.string.chinese);
            }
        });

        english_button.setOnClickListener(new MyListener());

}

    private class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //自定义方式
            Toast.makeText(getApplicationContext(), "你点击了按钮", Toast.LENGTH_SHORT).show();
            textviewTitle.setText(((Button)clickButtonView).getText());
            Toast.makeText(MainActivity.this, ((Button)english_button).getText(),100);
        }
    }
}

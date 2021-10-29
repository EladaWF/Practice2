package ru.mirea.zhilov.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "МИРЭА");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Жилов Никита Витальевич");
        startActivity(Intent.createChooser(shareIntent, "Мое ФИО"));
    }
}
package ru.test.t6_service;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;
    int counter = 0;
    final String counterTAG = "counter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(counterTAG);
        }

        timer = new Timer(true);// создание таймера и объявление его потока демоном
        startTimer();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        timer.cancel();
        timer.purge();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(counterTAG, counter);
    }

    private void showToast() {
        Toast.makeText(this, "[" + ++counter + "] " + "Hi User!", Toast.LENGTH_SHORT).show();
    }

    private void startTimer() {
        timer.scheduleAtFixedRate(new TimerTask() {// задача для таймера
            @Override
            public void run() {
                runOnUiThread(MainActivity.this::showToast);// вывод повторяющегося сообщения с периодичностью в 3,5 сек
            }
        }, 0, 3500);
        moveTaskToBack(true);
    }
}

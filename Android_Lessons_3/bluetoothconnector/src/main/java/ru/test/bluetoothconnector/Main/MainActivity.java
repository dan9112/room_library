package ru.test.bluetoothconnector.Main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import ru.test.bluetoothconnector.R;

public class MainActivity extends MainActivity_Methods {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.id_bt_button) {
            if (!btAdapter.isEnabled()) enableBt();
            else {
                btAdapter.disable();
                menuItem.setIcon(R.drawable.ic_bt_enable);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        menuItem = menu.findItem(R.id.id_bt_button);

        setBtIcon();

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ENABLE_REQUEST) {
            if (resultCode == RESULT_OK) {
                setBtIcon();
            }
        }
    }
}
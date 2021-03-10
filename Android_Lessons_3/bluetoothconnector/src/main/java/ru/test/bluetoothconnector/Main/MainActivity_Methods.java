package ru.test.bluetoothconnector.Main;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;

import ru.test.bluetoothconnector.R;

/**
 * Класс для хранения методов класса MainActivity
 */
class MainActivity_Methods extends MainActivity_Variables {

    /**
     * Процедура смены иконки кнопки вызова меню
     */
    protected void setBtIcon() {
        if (btAdapter.isEnabled()) {
            menuItem.setIcon(R.drawable.ic_bt_disable);
        } else {
            menuItem.setIcon(R.drawable.ic_bt_enable);
        }
    }

    /**
     * Процедура инициализации переменных
     */
    protected void init() {
        btAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    /**
     * Процедура включения Bluetooth-модуля на устройстве
     */
    protected void enableBt() {
        Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(intent, ENABLE_REQUEST);
    }
}

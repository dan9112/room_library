package ru.test.bluetoothconnector.Main;

import android.bluetooth.BluetoothAdapter;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Класс для хранения переменных класса MainActivity
 */
class MainActivity_Variables extends AppCompatActivity {

    /**
     * Элемент меню, отображающийся в панели действий Activity
     */
    protected MenuItem menuItem;
    /**
     * Адаптер Bluetooth для взаимодействия с модулем Bluetooth устройства
     */
    protected BluetoothAdapter btAdapter;
    /**
     * Код запроса включения Bluetooth-модуля на устройстве
     */
    protected final int ENABLE_REQUEST = 15;
}

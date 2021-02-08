package ru.test.my_tests.db

import android.content.Context
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper

class MyDbHelper(context: Context?) : SQLiteAssetHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "Entertainment.db"
        private const val DATABASE_VERSION = 2
    }
}

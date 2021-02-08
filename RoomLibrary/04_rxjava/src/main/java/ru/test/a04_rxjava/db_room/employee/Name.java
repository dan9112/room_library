package ru.test.a04_rxjava.db_room;

import androidx.room.ColumnInfo;

public class Name {

    @ColumnInfo(name = "first_name")
    public String firstName;

    @ColumnInfo(name = "last_name")
    public String lastName;
}

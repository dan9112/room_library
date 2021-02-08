package ru.test.a03_query.db_room.employee;

import androidx.room.ColumnInfo;

public class Name {

    @ColumnInfo(name = "first_name")
    public String firstName;

    @ColumnInfo(name = "last_name")
    public String lastName;
}

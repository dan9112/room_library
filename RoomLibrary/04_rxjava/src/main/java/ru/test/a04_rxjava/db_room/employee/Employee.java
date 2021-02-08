package ru.test.a03_query.db_room.employee;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity()
public class Employee {

    @PrimaryKey(autoGenerate = true)// автоинкремент
    public long id;

    @ColumnInfo(name = "first_name")// явное именование столбца
    public String firstName;

    @ColumnInfo(name = "last_name")// явное именование столбца
    public String lastName;

    public int salary;

}
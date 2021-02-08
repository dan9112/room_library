package ru.test.a05_multiple_query_relation;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Employee {

    @PrimaryKey
    public long id;

    public String name;

    public int salary;

    @ColumnInfo(name = "department_id")
    public int departmentId;

}

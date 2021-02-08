package ru.test.a05_multiple_query_relation;

import androidx.room.ColumnInfo;

public class EmployeeDepartment {

    public String name;

    public int salary;

    @ColumnInfo(name = "department_name")
    public String departmentName;

}

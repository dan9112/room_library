package ru.test.a05_multiple_query_relation;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EmployeeDao {

    @Query("SELECT employee.name, employee.salary, " + "department.name AS department_name " +
            "FROM employee, department " +
            "WHERE department.id == employee.department_id")
    public List<EmployeeDepartment> getEmployeeWithDepartment();

    // ...

}

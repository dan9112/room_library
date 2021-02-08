package ru.test.a03_query.db_room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import ru.test.a03_query.db_room.employee.Employee;
import ru.test.a03_query.db_room.employee.EmployeeDao;
import ru.test.a03_query.db_room.guest.Guest;
import ru.test.a03_query.db_room.guest.GuestDao;

@Database(entities = {Employee.class, Guest.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EmployeeDao employeeDao();

    public abstract GuestDao guestDao();
}

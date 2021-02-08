package ru.test.a05_multiple_query_relation;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Department {

    @PrimaryKey
    public int id;

    public String name;

}

package com.example.database.services;

import com.example.database.entities.Database;

import java.util.List;

public interface ServicesInterface {
    public List<Database> getAllData();
    public Database getDataById(int id);

    public Database addData(Database database);

    public Database updateDataById(Database database);

    public void deleteDataById(int id);
}

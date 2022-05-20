package com.example.database.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE1")
public class Database {

    @Id
    private int id;
    private String name;

    public Database() {
        super();
    }

    public Database(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.example.database.services;

import com.example.database.entities.Database;
import com.example.database.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class Services implements ServicesInterface{
//    List<Database> list;
    @Autowired
    private Repository repo;

    public Services() {
//        list = new ArrayList<>();
//        list.add(new Database(100,"Gopinath Bhowmick"));
//        list.add(new Database(101,"Puja Manna"));
    }

    @Override
    public List<Database> getAllData() {
//        return list;
        return repo.findAll();
    }

    @Override
    public Database getDataById(int id) {
//        Database d=null;
//        for (Database database : list){
//            if(database.getId()==id){
//                d=database;
//                break;
//            }
//        }
//        return d;

        Optional<Database> e = repo.findById(id);
        if(e.isPresent()){
            return e.get();
        }
        return null;
    }

    @Override
    public Database addData(Database database) {
//        list.add(database);
//        return database;
        repo.save(database);
        return database;
    }

    @Override
    public Database updateDataById(Database database) {
//        list.forEach(e->{
//            if(e.getId() == database.getId()){
//                e.setId(database.getId());
//                e.setName(database.getName());
//            }
//        });
//        return database;
        repo.save(database);
        return database;
    }

    @Override
    public void deleteDataById(int id) {
//        list=this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
        repo.deleteById(id);
    }
}

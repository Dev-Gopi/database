package com.example.database.controllers;

import com.example.database.entities.Database;
import com.example.database.services.ServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Controllers {

    @Autowired
    private ServicesInterface servicesInterface;

    @GetMapping("/")
    public String home(){
        return "Welcome to my REST Api Project";
    }

    //Get All Data From Database
    @GetMapping("/data")
    public List<Database> getAllData(){
        return this.servicesInterface.getAllData();
    }

    //Get All Data From Database by id
    @GetMapping("/data/{id}")
    public Database getDataById(@PathVariable int id){
        return this.servicesInterface.getDataById(id);
    }

    //add Data
    @PostMapping("/add")
    public Database addData(@RequestBody Database database){
        return this.servicesInterface.addData(database);
    }

    //add Data
    @PutMapping("/update")
    public Database updateDataById(@RequestBody Database database){
        return this.servicesInterface.updateDataById(database);
    }

    //add Data
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteDataById(@PathVariable int id){
        try {
            this.servicesInterface.deleteDataById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

package com.csi.controller;

import com.csi.model.Employee;
import com.csi.repo.GitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    GitRepo gitRepo;

    @PostMapping("/saveData")
    public ResponseEntity<Employee>saveData(@RequestBody Employee employee){
        return ResponseEntity.ok(gitRepo.save(employee));
    }
    @GetMapping("/getDataById/{empId}")
    public ResponseEntity<Optional<Employee>>getDataById(@PathVariable int empId){
        return ResponseEntity.ok(gitRepo.findById(empId));
    }
    @GetMapping("/getAllData")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(gitRepo.findAll());
    }
    @DeleteMapping("/deleteDataById/{empId}")
    public ResponseEntity<String>deketeDataById(@PathVariable int empId){

        gitRepo.deleteById(empId);

        return ResponseEntity.ok("data deleted");
    }
    @GetMapping("/say")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("Hii Gauravvvvvvv");
    }
}

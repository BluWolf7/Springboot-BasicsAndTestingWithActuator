package com.bluwolf.Springboot.tutorial.controlller;

import com.bluwolf.Springboot.tutorial.entity.Department;
import com.bluwolf.Springboot.tutorial.error.DepartmentNotFoundException;
import com.bluwolf.Springboot.tutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside saveDepartment of DepartmentController");

        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");

        return departmentService.fetchDepartmentList();

    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable Long id) throws DepartmentNotFoundException {
        LOGGER.info("Inside fetchDepartmentById of DepartmentController");

        return departmentService.fetchDepartmentById(id);

    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable Long id){
        LOGGER.info("Inside deleteDepartmentById of DepartmentController");

        departmentService.deleteDepartmentById(id);
         return "Department Deleted Successfully";

    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department){
        LOGGER.info("Inside updateDepartment of DepartmentController");

        return departmentService.updateDepartment(id,department);

    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable String name){
        LOGGER.info("Inside fetchDepartmentByName of DepartmentController");

        return departmentService.fetchDepartmentByName(name);

    }

}

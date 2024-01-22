package com.bluwolf.Springboot.tutorial.service;

import com.bluwolf.Springboot.tutorial.entity.Department;
import com.bluwolf.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {


    /**
     * Saves the department to db
     */
    Department saveDepartment(Department department);

    /**
     * Returns all the departments in  db
     */
    List<Department> fetchDepartmentList();

    /**
     * Returns department in  db with passed id
     */
    Department fetchDepartmentById(Long id) throws DepartmentNotFoundException;

    /**
     * Deletes department in  db with passed id
     */
    void deleteDepartmentById(Long id);

    /**
     * Updates department in  db with passed id
     */
    Department updateDepartment(Long id, Department department);

    /**
     * Returns department in  db with passed name
     */
    Department fetchDepartmentByName(String name);
}

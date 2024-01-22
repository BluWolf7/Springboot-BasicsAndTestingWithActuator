package com.bluwolf.Springboot.tutorial.service;

import com.bluwolf.Springboot.tutorial.entity.Department;
import com.bluwolf.Springboot.tutorial.error.DepartmentNotFoundException;
import com.bluwolf.Springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    @Override
    public Department saveDepartment(Department department) {
        try{
            return departmentRepository.save(department);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Department> fetchDepartmentList() {
        try{
            return departmentRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public Department fetchDepartmentById(Long id) throws DepartmentNotFoundException {
        Optional<Department>department= departmentRepository.findById(id);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department Not Available");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long id) {
        try{
            departmentRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Department updateDepartment(Long id, Department department) {


        try{

            Department depDB = departmentRepository.findById(id).get();

            if(Objects.nonNull(department.getDepartmentName()) &&
                    !"".equalsIgnoreCase(department.getDepartmentName())){
                depDB.setDepartmentName(department.getDepartmentName());
            }
            if(Objects.nonNull(department.getDepartmentCode()) &&
                    !"".equalsIgnoreCase(department.getDepartmentCode())){
                depDB.setDepartmentCode(department.getDepartmentCode());
            }
            if(Objects.nonNull(department.getDepartmentAddress()) &&
                    !"".equalsIgnoreCase(department.getDepartmentAddress())){
                depDB.setDepartmentAddress(department.getDepartmentAddress());
            }
            return departmentRepository.save(depDB);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;    }

    @Override
    public Department fetchDepartmentByName(String name) {
        try{
            return departmentRepository.findByDepartmentNameIgnoreCase(name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;    }
}

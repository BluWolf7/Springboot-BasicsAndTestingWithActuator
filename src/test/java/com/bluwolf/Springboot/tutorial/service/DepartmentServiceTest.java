package com.bluwolf.Springboot.tutorial.service;

import com.bluwolf.Springboot.tutorial.entity.Department;
import com.bluwolf.Springboot.tutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder().departmentName("IT").departmentAddress("Banglore").departmentCode("IT-06").build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);


    }

    @Test
    @DisplayName("Get Data Based on valid Department Name")
    public void whenValidDepartmentName_thenDepartmentShouldBeFound() {
        String departmentName = "IT";
        Department found = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName,found.getDepartmentName());
    }


}
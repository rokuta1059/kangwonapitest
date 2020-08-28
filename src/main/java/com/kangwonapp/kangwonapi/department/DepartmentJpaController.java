package com.kangwonapp.kangwonapi.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentJpaController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("")
    public List<departmentSite> retrieveAllDepartments() {
        return departmentRepository.findAll();
    }
}

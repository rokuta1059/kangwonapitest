package com.kangwonapp.kangwonapi.department;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/department")
public class DepartmentJpaController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<department> retrieveAllDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping("{id}")
    public department getDepartment(@PathVariable String id){
        return departmentRepository.findById(id)
                .get();
    }
}

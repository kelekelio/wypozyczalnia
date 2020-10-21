package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.repository.BranchRepository;
import com.example.wypozyczalnia.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {
    @Autowired
    private final BranchRepository branchRepository;

    public List<Branch> listAll() {
        return branchRepository.findAll();
    }

    public void save(Branch branch) {
        branchRepository.save(branch);
    }

    public Branch get(Long id) {

        return branchRepository.findById(id).get();
    }

    public void delete(Long id) {
        branchRepository.deleteById(id);
    }

    public BranchService(BranchRepository branchRepository) {

        this.branchRepository = branchRepository;
    }
}

package com.csi.repo;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GitRepo extends JpaRepository<Employee,Integer> {
}

package com.tosuncu.springmanagementapp.repo;

import com.tosuncu.springmanagementapp.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long> {
}

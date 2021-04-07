package com.tosuncu.springmanagementapp.repo;

import com.tosuncu.springmanagementapp.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}

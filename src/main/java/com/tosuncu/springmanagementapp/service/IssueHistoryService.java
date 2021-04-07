package com.tosuncu.springmanagementapp.service;


import com.tosuncu.springmanagementapp.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IssueHistoryService {


    IssueHistory save(IssueHistory issueHistory);
    IssueHistory getById(Long id);
    Page<IssueHistory> getAllPageable(Pageable pageable);
    Boolean delete (IssueHistory issueHistory);

}

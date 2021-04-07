package com.tosuncu.springmanagementapp.service;

import com.tosuncu.springmanagementapp.dto.IssueDto;
import com.tosuncu.springmanagementapp.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IssueService {

     IssueDto save(IssueDto issue);
     IssueDto getById(Long id);
     TPage<IssueDto> getAllPageable(Pageable pageable);
     Boolean delete(IssueDto issue);

}

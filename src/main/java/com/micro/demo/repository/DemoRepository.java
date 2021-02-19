package com.micro.demo.repository;

import com.micro.demo.model.Demo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DemoRepository extends PagingAndSortingRepository <Demo, Long> {

}

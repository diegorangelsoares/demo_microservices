package com.micro.demo.endpoint.service;

import com.micro.demo.model.Demo;
import com.micro.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DemoService {

    private final DemoRepository demoRepository;

    public Iterable<Demo> list (Pageable pageable){
        log.info("Listando todos os Demos");
        return demoRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }


}

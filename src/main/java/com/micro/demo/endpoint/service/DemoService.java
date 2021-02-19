package com.micro.demo.endpoint.service;

import com.micro.demo.model.Demo;
import com.micro.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Collection;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public Collection<Demo> list (){
        Collection< Demo> livros= demoRepository.findAll();
        log.info("Listando todos os Demos");
        return livros;
    }

    public Demo buscaPorId (long id){
        Optional<Demo> livro= demoRepository.findById(id);
        log.info("Listando Demo por id");
        return livro.get();
    }


}

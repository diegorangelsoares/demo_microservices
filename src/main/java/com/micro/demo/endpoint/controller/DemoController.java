package com.micro.demo.endpoint.controller;


import com.micro.demo.endpoint.service.DemoService;
import com.micro.demo.model.Demo;
import com.micro.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.awt.print.Pageable;
import java.util.Collection;

@RestController
@RequestMapping("v1/admin/demo")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(method = RequestMethod.GET, value="/Livros",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Demo>> list (){
        Collection< Demo> PropostasBuscados= demoService.list();
        return new ResponseEntity<>(PropostasBuscados, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value="/Livro/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Demo> getDemo (@PathVariable Integer  id){
        Demo demo = demoService.buscaPorId(id);
        return new ResponseEntity<>(demo, HttpStatus.OK);
    }



}

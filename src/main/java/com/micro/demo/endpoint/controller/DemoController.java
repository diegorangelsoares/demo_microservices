package com.micro.demo.endpoint.controller;


import com.micro.demo.endpoint.service.DemoService;
import com.micro.demo.model.Demo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.awt.print.Pageable;

@RestController
@RequestMapping("v1/admin/demo")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DemoController {

    private final DemoService demoService;

    @GetMapping (produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Demo>> list (Pageable pageable){
        return new ResponseEntity<>(demoService.list(pageable), HttpStatus.OK);
    }



}

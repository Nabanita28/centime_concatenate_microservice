package com.ct.centime.controllers;

import com.ct.centime.configuration.LogMethodParam;
import com.ct.centime.dto.Person;
import com.ct.centime.dto.Response;
import com.ct.centime.services.ConcatenateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("centime/api/v1")
public class ConcatenateController {
    private final ConcatenateService concatenateService;

    @Autowired
    public ConcatenateController(ConcatenateService concatenateService) {
        this.concatenateService = concatenateService;
    }

    @LogMethodParam
    @PostMapping(path = "/concatenate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> concatenateStrings(@RequestBody Person person){
        return ResponseEntity.ok().body(Response.of(concatenateService.concatenateStrings(person)));
    }
}

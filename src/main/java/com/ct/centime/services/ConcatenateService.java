package com.ct.centime.services;

import com.ct.centime.configuration.LogMethodParam;
import com.ct.centime.dto.Person;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConcatenateService {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());


    public String concatenateStrings(Person person) {
        String name = person.getName();
        String surName = person.getSurname();

        LOG.info("Name is : " + name + " Surname is - " + surName);

        return name + " " + surName;
    }
}

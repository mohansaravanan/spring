package com.papcloud.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatusController {

    @ResponseBody
    @RequestMapping(value = "/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getStatus() {
        return new ResponseEntity<String>("{\"Status\": \"Ok\"}", HttpStatus.ACCEPTED);
    }

}
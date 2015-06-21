package com.youngidea.springbootstarter.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sean on 6/20/15.
 */
@RequestMapping("/api/helloworld")
@RestController
public class HelloWordEndPoint {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String helloWorld() {
        return "Hello Dude !!";
    }

}

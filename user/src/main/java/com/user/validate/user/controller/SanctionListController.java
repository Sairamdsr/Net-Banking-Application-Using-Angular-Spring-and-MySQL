package com.user.validate.user.controller;

import com.user.validate.user.service.Status;
import com.user.validate.user.service.SanctionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SanctionListController {

    @Autowired
    SanctionListService sanctionListService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/checkSDNList/{name}")
    public ResponseEntity<Status> checkName(@PathVariable("name") String name) {

        Status status = sanctionListService.fetchUserInSanctionList(name);

        return new ResponseEntity<>(status, HttpStatus.OK);
    }

}

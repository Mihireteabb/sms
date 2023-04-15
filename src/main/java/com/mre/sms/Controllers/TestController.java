package com.mre.sms.Controllers;

import com.mre.sms.Domains.Test;
import com.mre.sms.Services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RestController
@RequestMapping
public class TestController {
    @Autowired
    public TestServices testServices;
    @PostMapping("/api/tests")
    public ResponseEntity<?> createTest(@RequestBody Test test) {

        try {
            Test savedTest = testServices.registerTest(test);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(savedTest);
        } catch (Exception ex) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":" + ex.getMessage() + "}");

        }
    }

    @GetMapping("/api/tests")
    public Iterable<Test> getAllTests() {
        return testServices.getAllTests();
//        return accountRepository.findAll();
    }
}

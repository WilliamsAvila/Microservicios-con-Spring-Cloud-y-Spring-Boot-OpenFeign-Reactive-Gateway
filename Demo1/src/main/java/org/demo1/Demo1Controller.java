package org.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
public class Demo1Controller {

    @Autowired
    private Demo1Service demo1Service;

    @PostMapping("/Created")
    public ResponseEntity<Demo1Model> addDemo1(@RequestBody Demo1Model model) {
        Demo1Model result = demo1Service.addDemo1(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}

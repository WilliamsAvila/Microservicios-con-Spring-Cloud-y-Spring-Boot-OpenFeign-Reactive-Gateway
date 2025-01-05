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

    @GetMapping("/GetName/{name}")
    public ResponseEntity<Demo1Model> getDemo1 (@PathVariable String name) {
        Demo1Model result = demo1Service.getDemo1(name);
        if (result != null) {
            Demo1Model demo1Model = new Demo1Model();
            var name1 = result.getName();
            demo1Model.setName(name1);
            return ResponseEntity.status(HttpStatus.OK).body(demo1Model);
        } else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            
        }
}

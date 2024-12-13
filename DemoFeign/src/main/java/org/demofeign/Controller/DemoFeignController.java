package org.demofeign.Controller;

import org.demofeign.Model.DemoFeignModel;
import org.demofeign.Repository.DemoFeignRepository;
import org.demofeign.Services.DemoFeignServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Feign")
public class DemoFeignController {

    @Autowired
    private DemoFeignServices demoFeignServices;

    @GetMapping("/GetName/{name}")
    public ResponseEntity<DemoFeignModel> getName(@PathVariable String name) {
        return ResponseEntity.ok(demoFeignServices.getName(name));

    }
}

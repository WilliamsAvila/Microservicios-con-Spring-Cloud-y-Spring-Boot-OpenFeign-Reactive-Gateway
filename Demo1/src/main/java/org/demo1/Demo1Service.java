package org.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Demo1Service {

    @Autowired
    private Demo1Repository demo1Repository;

    public Demo1Model addDemo1(Demo1Model demo1Model) {
        Demo1Model newDemo1 = new Demo1Model();
        newDemo1.setName(demo1Model.getName());
        demo1Repository.save(demo1Model);
        return newDemo1;
    }

    public Demo1Model getDemo1(String name) {
        return demo1Repository.findByName(name);
    }
}

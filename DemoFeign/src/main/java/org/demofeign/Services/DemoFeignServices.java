package org.demofeign.Services;

import com.netflix.discovery.EurekaClient;
import org.demofeign.Model.DemoFeignModel;
import org.demofeign.Repository.DemoFeignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoFeignServices {

    @Autowired
    private DemoFeignRepository demoFeignRepository;

    public DemoFeignModel getName(String name){
        return demoFeignRepository.getByName(name).orElseThrow();
    }

}

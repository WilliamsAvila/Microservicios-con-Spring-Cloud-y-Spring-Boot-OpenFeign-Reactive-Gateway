package org.demofeign.Repository;

import org.demofeign.LoadBalancerConfiguration;
import org.demofeign.Model.DemoFeignModel;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "Demo1")
@LoadBalancerClient(name = "Demo1", configuration = LoadBalancerConfiguration.class)
public interface DemoFeignRepository {

    @GetMapping("/prueba/API/GetName/{name}")
    Optional<DemoFeignModel> getByName(@PathVariable String name);

}

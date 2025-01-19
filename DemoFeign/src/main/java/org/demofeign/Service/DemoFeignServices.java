package org.demofeign.Service;

import org.demofeign.Helper.ReportHelper;
import org.demofeign.Model.DemoFeignModel;
import org.demofeign.Repository.DemoFeignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoFeignServices {

    @Autowired
    private DemoFeignRepository demoFeignRepository;

    @Autowired
    private ReportHelper reportHelper;

    public DemoFeignModel getName(String name){
        reportHelper.getReport();
        return demoFeignRepository.getByName(name).orElseThrow();
    }

}

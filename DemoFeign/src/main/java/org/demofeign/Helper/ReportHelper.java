package org.demofeign.Helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReportHelper {

    @Value("${report}")
    private String report;


    public String getReport() {
        System.out.println(report);
        return report;
    }
}

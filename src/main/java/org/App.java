package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext("org");
        CalcService calcService = (CalcService) app.getBean("calcService");
        calcService.beginApp();
    }
}

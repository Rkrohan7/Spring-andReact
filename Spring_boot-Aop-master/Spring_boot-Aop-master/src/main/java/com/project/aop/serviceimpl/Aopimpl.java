package com.project.aop.serviceimpl;

import com.project.aop.service.Myinterface;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class Aopimpl implements Myinterface {

    @Override
    public String testAop() {
        return "hello Aop";
    }
}

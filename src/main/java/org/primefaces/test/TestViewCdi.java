package org.primefaces.test;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestViewCdi {
    
    private String testString;

    private List<String> list;

    @PostConstruct  
    public void init() {
        testString = "Welcome to PrimeFaces (from CDI!) !!!";

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add("Text " + i);
        }
        this.list = list;
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public List<String> getList() {
        return list;
    }
}

package org.primefaces.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named
@RequestScoped
public class TestViewCdi {
    
    private String testString;

    List<SelectItem> options;
    List<String> selected = new ArrayList<>();
    
    @PostConstruct  
    public void init() {
        testString = "Welcome to PrimeFaces (from CDI!) !!!";


        options = new LinkedList<>();
        for(char c = 'A'; c <= 'Z'; c++) {
            char[] repeat = new char[3];
            Arrays.fill(repeat, c);
            String value = new String(repeat).intern();
            options.add(new SelectItem(value));
            selected.add(value);
        }
        for(char c = 'a'; c <= 'z'; c++) {
            char[] repeat = new char[3];
            Arrays.fill(repeat, c);
            String value = new String(repeat).intern();
            options.add(new SelectItem(value));
        }
    }

    public List<SelectItem> getOptions() {
        return options;
    }

    public void setOptions(List<SelectItem> options) {
        this.options = options;
    }

    public List<String> getSelected() {
        return selected;
    }

    public void setSelected(List<String> selected) {
        this.selected = selected;
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }    
}

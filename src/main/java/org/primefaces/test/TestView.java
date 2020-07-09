package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

    private String testString;
    private List<Row> rows;

    @PostConstruct
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
        List<Row> _list = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            _list.add(new Row(i));
        }
        rows = _list;
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public List<Row> getRows() {
        return rows;
    }

    public static class Row implements Serializable{
        private String str;

        public Row() {
        }

        public Row(int i) {
            this.str = String.format("row %02d", i);
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
}

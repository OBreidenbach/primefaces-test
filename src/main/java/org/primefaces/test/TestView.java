package org.primefaces.test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

    private List<SelectItem> options = Arrays.asList(
            new SelectItem("Option1"), new SelectItem("Option2")
    );

    private String selected;

    public List<SelectItem> getOptions() {
        return options;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }
}

package org.primefaces.test;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@ViewScoped
public class TestViewCdi implements Serializable
{
    private List<String> entries ;
    private int first = 0;
    private int columns = 1;

    @PostConstruct
    public void init() {
        entries = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        System.out.println("TestViewCdi init() done.");
    }

    public List<String> getEntries()
    {
        return entries;
    }

    public int getColumns()
    {
        return columns;
    }

    public void setColumns(int columns)
    {
        this.columns = columns;
    }

    public int getFirst()
    {
        return first;
    }

    public void setFirst(int first)
    {
        this.first = first;
    }
}


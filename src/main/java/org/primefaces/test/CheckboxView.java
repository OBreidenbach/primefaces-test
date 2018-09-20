/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.test;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class CheckboxView {

    private String[] selectedCities;
    private List<SelectItem> cities;

    @PostConstruct
    public void init() {
        cities = new ArrayList<>();
        add(cities, "Miami");
        add(cities, "London");
        add(cities, "Paris");
        add(cities, "Istanbul");
        add(cities, "Berlin");
        add(cities, "Barcelona");
        add(cities, "Rome");
        add(cities, "Brasilia");
        add(cities, "Amsterdam");
    }

    private void add(List<SelectItem> list, String label) {
        list.add(new SelectItem(label, label, null, (((list.size()) %2) == 1)));
    }

    public String[] getSelectedCities() {
        return selectedCities;
    }

    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }

    public List<SelectItem> getCities() {
        return cities;
    }
}

package com.sylinx.p7.pojo.autowiretest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PeopleAuto {

    @Autowired
    @Qualifier(value="catAuto1")
    private CatAuto catAuto;
    @Autowired
    @Qualifier(value="dogAuto")
    private DogAuto dogAuto;

    private String autoName;

    public CatAuto getCatAuto() {
        return catAuto;
    }

    public DogAuto getDogAuto() {
        return dogAuto;
    }


    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }
}

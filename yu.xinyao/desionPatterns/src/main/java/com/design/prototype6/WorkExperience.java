package com.design.prototype6;

import lombok.Data;
@Data
public class WorkExperience implements Cloneable{
    private String workDate;
    private String company;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

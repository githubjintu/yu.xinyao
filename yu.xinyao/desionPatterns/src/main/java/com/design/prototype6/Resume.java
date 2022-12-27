package com.design.prototype6;

import lombok.Data;

@Data
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private WorkExperience workExperience;
    public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }
    public Resume(String name,String sex) throws CloneNotSupportedException {
        workExperience = new WorkExperience();
        this.name = name;
        this.sex = sex;
    }
    public void setWorkExperience(String company,String workDate){
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }
    public void display(){
        System.out.println("姓名:"+this.name+",性别:"+this.sex
        +",原公司:"+workExperience.getCompany()+",时间:"+
                workExperience.getWorkDate());
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package com.design.component15;

import java.nio.charset.StandardCharsets;

public class Demo {
    public static void main(String[] args) {
        ConcreteCompany concreteCompany = new ConcreteCompany("北京总部");
        concreteCompany.add(new HRDepartment("总公司人力部"));
        concreteCompany.add(new FinanceDepartment("总公司财务部"));
        ConcreteCompany concreteCompany1 = new ConcreteCompany("上海分公司");
        concreteCompany1.add(new HRDepartment("上海分公司人力部"));
        concreteCompany1.add(new FinanceDepartment("上海分公司财务部"));
        concreteCompany.add(concreteCompany1);
        System.out.println("结构图");
        concreteCompany.display(1);

        System.out.println("职责");
        concreteCompany.lineOfDuty();
    }
}

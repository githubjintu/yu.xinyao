package com.design.template7;

public class TemplateDemo {
    public static void main(String[] args) {
        System.out.println("A抄的试卷");
        TestPaper testPaper = new TestPaper();
        testPaper.TestQuestion1();
        testPaper.TestQuestion2();
        System.out.println("B抄的试卷");
        testPaper.TestQuestion1();
        testPaper.TestQuestion2();
    }
}

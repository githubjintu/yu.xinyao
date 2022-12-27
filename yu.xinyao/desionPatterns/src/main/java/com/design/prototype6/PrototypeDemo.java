package com.design.prototype6;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("abc", "男");
        resume.setWorkExperience("比亚迪","aaa");
        resume.display();
        Resume clone = (Resume) resume.clone();
        System.out.println(clone == resume);
        clone.setWorkExperience("比亚迪","bbb");
        clone.display();
    }
}

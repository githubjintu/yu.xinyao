package com.design.build9;

public class PersonDirector {
    private PersonBuilder personBuilder;
    public PersonDirector(PersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }
    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
    }
}

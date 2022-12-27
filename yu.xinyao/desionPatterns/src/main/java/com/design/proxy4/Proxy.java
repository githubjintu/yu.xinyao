package com.design.proxy4;

public class Proxy implements GiveGift{
    private SchoolGirl schoolGirl;
    private String name;
    private Pursuit pursuit;
    public Proxy(SchoolGirl schoolGirl,Pursuit pursuit,String name) {
        this.pursuit = pursuit;
        this.schoolGirl = schoolGirl;
        this.name = name;
    }

    public void giveDolls(){
        if (pursuit != null){
            System.out.println(this.name+"被代理"+pursuit.getName()+"送"+schoolGirl.getName()+"娃娃");
        }
    }
    public void giveChocolate(){
        if (pursuit != null) {
            System.out.println(this.name+"被代理"+pursuit.getName()+"送"+schoolGirl.getName()+"巧克力");
        }
    }

}

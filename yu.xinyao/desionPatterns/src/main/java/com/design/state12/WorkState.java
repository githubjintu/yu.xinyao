package com.design.state12;

import lombok.Data;

@Data
public class WorkState {
    private int hours;
    private boolean workFinished;
    public WorkState(int hours,Boolean workFinished){
        this.hours = hours;
        this.workFinished = workFinished;
    }
    public void WriteProgram(int hours,Boolean workFinished){
        if (hours <= 12){
            System.out.println("精神");
        }
        else if (hours <= 13){
            System.out.println("困了");
        }
        else if (hours <= 17){
            System.out.println("状态不错");
        }
        else {
            if (workFinished){
                System.out.println("当前时间，"+hours+",下班回家");
            }else {
                if (hours <= 21){
                    System.out.println("当前时间："+hours+",疲惫");
                }else {
                    System.out.println("当前时间:"+hours+",睡着了");
                }
            }
        }
    }
}

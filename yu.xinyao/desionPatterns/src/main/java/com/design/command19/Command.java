package com.design.command19;

abstract class Command {
    public abstract void Execute();

    protected Barbecue barbecue;

    public Command(Barbecue barbecue){
        this.barbecue = barbecue;
    }
}

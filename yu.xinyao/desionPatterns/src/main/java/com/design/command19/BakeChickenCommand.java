package com.design.command19;

public class BakeChickenCommand extends Command{
    public BakeChickenCommand(Barbecue barbecue) {
        super(barbecue);
    }

    @Override
    public void Execute() {
        barbecue.BakeChicken();
    }
}

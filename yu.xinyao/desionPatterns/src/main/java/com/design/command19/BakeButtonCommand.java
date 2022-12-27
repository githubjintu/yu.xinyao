package com.design.command19;

public class BakeButtonCommand extends Command{
    public BakeButtonCommand(Barbecue barbecue) {
        super(barbecue);
    }

    @Override
    public void Execute() {
        barbecue.BakeMutton();
    }
}

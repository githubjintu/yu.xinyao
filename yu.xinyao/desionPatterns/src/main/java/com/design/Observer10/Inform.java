package com.design.Observer10;

import lombok.Data;

@Data
abstract class Inform {
    private String name;
    private String message;
    abstract void Attach(Observer observer);
    abstract void Detach(Observer observer);
    abstract void Notify();
}

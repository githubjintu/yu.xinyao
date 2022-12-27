package com.design.abstractFactory;

abstract class SqlAbstractUser {
    abstract void insert(User user);
    abstract void getUser(int id);
}

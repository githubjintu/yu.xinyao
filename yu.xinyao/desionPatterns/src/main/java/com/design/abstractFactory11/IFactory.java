package com.design.abstractFactory11;

abstract class IFactory {
    abstract SqlAbstractUser getSql(String type);
    abstract SqlAbstractDepartment getSqlDP(String type);
}

package com.design.abstractFactory;

abstract class IFactory {
    abstract SqlAbstractUser getSql(String type);
    abstract SqlAbstractDepartment getSqlDP(String type);
}

package com.design.absSimpFactory11;

public class DataAccess {
    // 工厂
    public static  <R> R create(Class<R> type) throws InstantiationException, IllegalAccessException {
        return type.newInstance();
        // Class<? extends Class>
    }
}

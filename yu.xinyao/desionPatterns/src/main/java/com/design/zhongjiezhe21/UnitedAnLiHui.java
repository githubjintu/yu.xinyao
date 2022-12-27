package com.design.zhongjiezhe21;

import lombok.Data;

@Data
public class UnitedAnLiHui extends UnitedNations{
    private China china;
    private USA usa;

    @Override
    public void declare(String message, Country country) {
        if (country == china){
            china.getMessage(message);
        }else {
            usa.getMessage(message);
        }
    }
}

package com.setsail.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonData {

    //返回结果
    private Boolean ret;

    //异常信息
    private String msg;

    //返回数据
    private Object data;

    public JsonData(boolean ret){
        this.ret = ret;
    }

    public static JsonData success(Object object,String msg){
        JsonData jsonData = new JsonData(true);
        jsonData.data = object;
        jsonData.msg = msg;
        return jsonData;
    }

}

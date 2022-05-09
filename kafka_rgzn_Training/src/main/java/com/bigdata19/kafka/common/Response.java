package com.bigdata19.kafka.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: Response
 * @Description: 响应实体
 **/
@Getter
@Setter
public class Response {
    //响应码
    private int code;

    //消息
    private String message;

    public Response(int code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}

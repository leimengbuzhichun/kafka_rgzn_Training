package com.bigdata19.kafka.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *@desc: 消息实体
 */
@Getter
@Setter
@EqualsAndHashCode
public class MessageEntity {
    //消息标题
    private String title;

    //消息内容
    private String body;

    @Override
    public String toString() {
        return "MessageEntity{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

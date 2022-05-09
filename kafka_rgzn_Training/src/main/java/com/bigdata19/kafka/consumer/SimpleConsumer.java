package com.bigdata19.kafka.consumer;

import com.bigdata19.kafka.common.MessageEntity;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: SimpleConsumer
 * @Description: 消息消费者
 **/
@Slf4j
@Component
public class SimpleConsumer {

    private final Gson gson = new Gson();

    /**
     * 消费者监听消息
     * @param message
     */
    @KafkaListener(topics = "${kafka.topic.default}", containerFactory = "kafkaListenerContainerFactory")
    public void receive(MessageEntity message){
        log.info(gson.toJson(message));
    }
}

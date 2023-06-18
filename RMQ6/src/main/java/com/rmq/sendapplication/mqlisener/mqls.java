package com.rmq.sendapplication.mqlisener;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class mqls {
    @RabbitListener(bindings = @QueueBinding(value=@Queue("test.dong"),exchange = @Exchange(name = "dong.exchange",type = ExchangeTypes.DIRECT),key = {"c","h"}))
    public void getRMQ(String arg){
        System.out.println("RabbitMq getMessage:"+arg);

    }
    @RabbitListener(queues = {"queue.test"})
    public void getRMQtest(String arg){
        System.out.println("RabbitMq getMessage:"+arg);

    }
    @RabbitListener(bindings = @QueueBinding(value=@Queue("test.dong1"),exchange = @Exchange(name = "dong.exchange",type = ExchangeTypes.DIRECT),key = {"c"}))
    public void getRMQ1(String arg){
        System.out.println("RabbitMq getMessage1:"+arg);

    }
    @RabbitListener(bindings = @QueueBinding(value=@Queue("test.dong2"),exchange = @Exchange(name = "dong.exchange",type = ExchangeTypes.DIRECT),key = {"h"}))
    public void getRMQ2(String arg){
        System.out.println("RabbitMq getMessage2:"+arg);

    }@RabbitListener(bindings = @QueueBinding(value=@Queue("test.dong3"),exchange = @Exchange(name = "dong.exchange",type = ExchangeTypes.DIRECT),key={"c"}))
    public void getRMQ3(String arg){
        System.out.println("RabbitMq getMessage3:"+arg);

    }
}

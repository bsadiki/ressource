package com.sadiki.badreddine.ressource.jms;
import org.apache.activemq.broker.BrokerService;

import static com.sadiki.badreddine.ressource.configuration.Configuration.*;

public class ActiveMQBrocker {
    public static void main(String[] args) {
        try {
            BrokerService broker = new BrokerService();
            broker.setPersistent(false);
            broker.addConnector(BindAdress);
            broker.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

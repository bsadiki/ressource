package com.sadiki.badreddine.ressource.jms;

import com.sadiki.badreddine.ressource.dao.RessourceRepository;
import com.sadiki.badreddine.ressource.entities.Ressource;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.*;

import static com.sadiki.badreddine.ressource.configuration.Configuration.*;

public class JMSConsumer {
    @Autowired
     static RessourceRepository ressourceRepository;
    public static void main(String[] args) {
        try {
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory            (BROCKERURL);
            Connection connection = connectionFactory.createConnection();
            connection.start();
            Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
            //Destination destination = session.createQueue(QueueName);
            Destination destination = session.createQueue(TopicName);
            MessageConsumer consumer = session.createConsumer
                    (destination);
            consumer.setMessageListener(new MessageListener() {
                public void onMessage(Message message) {
                    if(message instanceof TextMessage){
                        try {
                            TextMessage textMessage = (TextMessage) message;
                            ressourceRepository.save(new Ressource(((TextMessage) message).getText(),null,0,0,null));
                        } catch (JMSException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}

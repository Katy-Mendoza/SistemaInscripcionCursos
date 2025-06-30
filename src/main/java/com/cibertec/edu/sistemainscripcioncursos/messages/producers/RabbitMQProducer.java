package com.cibertec.edu.sistemainscripcioncursos.producers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private static final String EXCHANGE = "inscripcionesExchange";
    private static final String ROUTING_KEY = "inscripcion.key";

    public void enviarMensaje(String mensaje) {
        System.out.println("📢 RabbitMQ: Enviando mensaje -> " + mensaje);
        // Simulación del envío
        // rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, mensaje);
    }
}


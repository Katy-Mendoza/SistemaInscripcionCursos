package com.cibertec.edu.sistemainscripcioncursos.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "inscripcionesTopic";

    public void enviarMensaje(String mensaje) {
        System.out.println("📢 Kafka: Enviando mensaje -> " + mensaje);
        // Simulación del envío
        // kafkaTemplate.send(TOPIC, mensaje);
    }
}


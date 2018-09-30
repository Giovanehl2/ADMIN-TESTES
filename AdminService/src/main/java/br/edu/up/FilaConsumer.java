package br.edu.up;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class FilaConsumer {
	@RabbitListener(queues = { "${fila.nome}" })
	public void receive(@Payload String pedido) {
		System.out.println("Mensagem recebida: " + pedido);
	}
}
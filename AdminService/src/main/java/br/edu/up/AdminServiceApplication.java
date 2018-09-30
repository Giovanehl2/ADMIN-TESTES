package br.edu.up;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/*@Configuration
@EnableAutoConfiguration*/

//@ComponentScan({ "br.edu.up"})
@SpringBootApplication
@EnableRabbit
@EnableEurekaClient
public class AdminServiceApplication {

	@Value("${fila.nome}")
    private String nomeDaFila;

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
	}
	
	@Bean
    public Queue fila() {
        return new Queue(nomeDaFila, true);
    }
}

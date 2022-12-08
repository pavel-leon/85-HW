package telran.java2022;

import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}

//	@Bean
//	public Function<String, String> uppercase() {
//	    return value -> value.toUpperCase();
//	}
	
//	@Bean
//	public void consumer(String value) {
//		
//		KafkaConsumer<String, String> consumer= new KafkaConsumer<>(configs);

	@Bean
	public Consumer<String> consumer() {
		Consumer<String> printer = v -> System.out.println(v);
//		printer.accept("topic1");
		printer.accept("lvjhyvvh-default");
		return printer;
	}

}

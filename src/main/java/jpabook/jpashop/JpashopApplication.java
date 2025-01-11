package jpabook.jpashop;

import jpabook.jpashop.command.UserCommand;
import jpabook.jpashop.entity.UserRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
	}


}

package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @SpringBootApplication: 메타 어노테이션, 아래의 어노테이션을 모두 합친 것
 * 	- @SpringBootConfiguration(@Configurtion)
 *  - @ComponentScan
 *  - @EnableAutoConfiguration
 *
 */

// 같은 패키지 이름의 test 클래스 실행 가능

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){	
		}
	}

}

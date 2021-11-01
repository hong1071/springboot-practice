package ex05;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import ex05.component.HelloWorldRunner;
import ex05.component.MyComponent;

/**
 * 
 * Application Context 구성 후, (Application Context 환경에서)실행할 코드가 있는 경우
 * ApplicationRunner 인터페이스를 구현하는 클래스의 Bean 생성하기
 *
 */

// 같은 패키지 이름의 test 클래스 실행 가능
@SpringBootApplication
public class MyApplication {

	@Bean
	public ApplicationRunner applicationRunner() {
		
		// 1. 작성된 구현 클래스를 사용하는 방법
		//return new HelloWorldRunner();
		
		// 2. Anonymouse Class을 사용하는 방법
		
		return new ApplicationRunner() {
			
			@Autowired
			private MyComponent myComponent;
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				
				myComponent.printHello();
			}
		};
		
		
		// 3. 함수형(람다 표현식)
		/*
		return (ApplicationArguments args) -> {
			MyComponent.printHello();
		};
		*/
	}
	
	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){	
		}
	}

}

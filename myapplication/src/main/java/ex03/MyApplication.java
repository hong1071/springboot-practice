package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// 같은 패키지 이름의 test 클래스 실행 가능

@SpringBootConfiguration
@ComponentScan
public class MyApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){	
		}
	}

}

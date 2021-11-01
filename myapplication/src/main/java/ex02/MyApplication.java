package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

// 같은 패키지 이름의 test 클래스 실행 가능

@SpringBootConfiguration
public class MyApplication {
	
	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){
			
		}
	}

}

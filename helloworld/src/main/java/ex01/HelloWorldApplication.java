package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * Bootstrapping Class
 *  하는 일
 *  1. 스프링 부트 애플리케이션의 부트스트래핑(Bootstrapping)
 *  2. 설정 class의 역할(Configuration Class)
 *
 */

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * 	Bootstrapping Class가 실행되면 일어나는 일
		 *  1. 애플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 *  2. 웹 애플리케이션 타입(Web Application인 경우, MVC or Reactice)
		 *  3. 어노테이션 스캐닝(auto) or Configuration 클래스(Explicit)를 통한 Bean 생성 및 등록
		 *  4. 웹 어플리케이션인 경우(MVC) 
		 *     - 내장(embedded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
		 *     - 서버 인스턴스에 웹 애플리케이션을 배포
		 *     - 서버 인스턴스 실행
		 *  5. ApplicationRunner 인터페이스를 구현하는 Bean의 run() 실행
		 */
		/* original 코드
		ConfigurableApplicationContext c = null;
		try {
			c = SpringApplication.run(HelloWorldApplication.class, args);
			
		} catch(Throwable ex) {
			ex.printStackTrace();
			
		} finally {
			c.close();
		}
		*/
		
		//try-with-resource 코드
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)){
						
		}
		
	}
}

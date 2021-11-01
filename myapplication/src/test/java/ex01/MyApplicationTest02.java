package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= {MyApplication.class})

/**
 * 
 * 스프링 부트 테스트: 스프링 부트 프로그램이 configuration을 포함함
 *
 */

@SpringBootTest
public class MyApplicationTest02 {
	
	@Test
	public void contextLoad() {
	}
}

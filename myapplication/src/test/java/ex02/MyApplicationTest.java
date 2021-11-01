package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//뒤에 자바클래스 이름 넣을 필요가 없음. 자바 클래스에 @SpringBootConfiguration 달고 있으면!
@SpringBootTest
public class MyApplicationTest {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void MyComponentNotNull() {
		assertNotNull(myComponent);
	}
}

package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ex02.MyApplication;
import ex02.MyComponent;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {MyApplication.class})
public class MyApplicationTest01 {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void MyComponentNotNull() {
		assertNotNull(myComponent);
	}
}

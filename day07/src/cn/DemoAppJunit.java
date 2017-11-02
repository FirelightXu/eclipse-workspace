package cn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoAppJunit {
	@Test
	public void demo01(){
		System.out.println("测试demo01");
	}
	@Before
	public void before() {
		System.out.println("测试方法前");
	}
	@After
	public void after() {
		System.out.println("测试方法后");
	}
}

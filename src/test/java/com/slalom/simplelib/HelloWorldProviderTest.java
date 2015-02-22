package com.slalom.simplelib;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldProviderTest {
	HelloWorldProvider provider;
	
	@Before
	public void setup() {
		provider = new HelloWorldProvider();
	}
	
	@Test
	public void shouldSayHelloToTheWorld() {
		assertTrue(provider.sayHelloWorld().contains("Hello, World!"));
	}

}

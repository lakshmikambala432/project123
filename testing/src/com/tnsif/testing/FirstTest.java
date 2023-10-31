package com.tnsif.testing;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
public class FirstTest {
	@RepeatedTest(3)
	@DisplayName("Testing")
	 @Test
	 void display() {
		 System.out.println("hello");
	 }
	 @Test
	 @Disabled
	 void display2() {
		 System.out.println("haii");
}
}
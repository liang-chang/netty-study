package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author min.huang
 *
 */
public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		LoggerTest test=new LoggerTest1();
		
		test.print("abc");
		
		test=new LoggerTest2();
		
		test.print("xyz");
	}

}

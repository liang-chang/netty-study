package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest2 implements LoggerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggerTest2.class);
	
	
	public void print(String s) {
		
		logger.info("{}",this.getClass().getSimpleName());
	}
}

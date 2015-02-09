package log4jIntro;

import org.apache.log4j.Logger;

public class Testlog4j {
	
	final static Logger logger = Logger.getLogger(Testlog4j.class);
	
	
	public static void main(String[] args) {
		 
		logger.info("log4jTest from solr");
	}

}

package logger;
import org.apache.log4j.Logger;

public class TestLog {

	static Logger log = Logger.getLogger(TestLog.class);

	public static void main(String[] args) {
		/*
		 * Console file.log Mail
		 */

		log.debug("Console log Debug Log");
		log.info("Console Info Log");
		log.error("Console error Log");

	}
}

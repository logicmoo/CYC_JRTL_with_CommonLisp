package eu.larkc.core.config;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class SimpleFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		Date date = new Date(record.getMillis());
		String timestamp = new SimpleDateFormat("HH:mm:ss").format(date);
		return String.format("[%s] %s %s: %s\n", record.getLevel(), timestamp, record.getSourceClassName(),  record.getMessage());
	}
	
}

package jasko.tim.lisp.wizards;

import jasko.tim.lisp.LispPlugin;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

import org.eclipse.core.runtime.Platform;

public class Templater {
	private static String[] inspirations = new String[] {
		"This is your lisp file. May it serve you well.",
		"This is your lisp file. There are many like it, but this one is yours.",
		"My lisp code, without me, is useless. Without my lisp code, I am useless. I must code my lisp true.",
		"Behold, the power of lisp!"
	};
	
	
	public static InputStream getTemplate(String fileName, String pkg, 
			boolean withTests, boolean withExample) {
		try {
			URL installURL = Platform.getBundle("jasko.tim.lisp").getEntry("/");
			URL url = new URL(installURL, "templates/" + fileName);
			BufferedReader template = new BufferedReader(new InputStreamReader(url.openStream()));
			
			StringBuilder sb = new StringBuilder();
			String line = template.readLine();
			
			while (line != null) {
				sb.append(line);
				sb.append('\n');
				line = template.readLine();
			}
			
			String contents = sb.toString();
			
			contents = contents.replace("${inspiration}", getInspiration());
			contents = contents.replace("${time}", getTime());
			contents = contents.replace("${package}", pkg);
			if(withTests){
				contents = contents.replace("${with-tests}", 
				    "(:file \"tests\" :depends-on (\"defpackage\" \"main\"))");
				contents = contents.replace("${lisp-unit}",":lisp-unit");
			} else {
				contents = contents.replace("${with-tests}","");				
				contents = contents.replace("${lisp-unit}","");
			}
			if(withExample){
				if(withTests){
					contents = contents.replace("${example-test}",
							"(define-test main-test\n" +
							"  (assert-equal 0 (main)) ;should pass\n" +
							"  (assert-equal 1 (main)) ;should fail\n" +
							")");					
				} else {
					contents = contents.replace("${example-test}","");					
				}
				contents = contents.replace("${example-export}","#:main");
				
				if(
					LispPlugin.getDefault().getCusp().implementation!=null&&
					LispPlugin.getDefault().getCusp().implementation.lispType().toLowerCase().contains("sbcl")){
					contents = contents.replace("${example-source}",
							"(defun main ()\n"+
							"  \"This function greets and returns 0.\n" +
							"If this function is used as top level in executable,\n" +
							"Prints 'Hello, World!' if no command line arguments are supplied\n" +
							"and 'Hello, User!' if the first command line argument is 'User'.\"\n" +
							"  (format t \"Hello, ~A!~%\"\n" +
							"      (if (second sb-ext:*posix-argv*)\n" +
							"          (second sb-ext:*posix-argv*)\n" +
							"          \"World\"))\n" +
							"  0)");					
				} else {
					contents = contents.replace("${example-source}",
							"(defun main ()\n"+
							"  \"This function greets and returns 0.\"\n" +
							"  (format t \"Hello, ~A!~%\" \"World\")\n" +
							"  0)");					
				}

			} else {
				contents = contents.replace("${example-test}","");
				contents = contents.replace("${example-export}","");
				contents = contents.replace("${example-source}","");
			}
			
			return new ByteArrayInputStream(contents.getBytes());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new ByteArrayInputStream("".getBytes());
	}
	
	private static String getTime() {
		Calendar cal = Calendar.getInstance(TimeZone.getDefault());
		String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
		java.text.SimpleDateFormat sdf =
			new java.text.SimpleDateFormat(DATE_FORMAT);
		sdf.setTimeZone(TimeZone.getDefault());
		
		return sdf.format(cal.getTime());
	}

	private static String getInspiration() {
		Random rand = new Random();
		return inspirations[rand.nextInt(inspirations.length)];
		//InputStream contents = new ByteArrayInputStream(header.getBytes());
	}
}

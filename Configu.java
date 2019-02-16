import java.io.Console;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Configu {
	
	public static void main(String a[]) {

		Console cnsl = null;
		String username = null, password = null, browser = null, environment = null;
		PrintWriter printWriter = null;
		try {
			cnsl = System.console();
			String filename = System.getProperty("user.dir") + "/config.properties";
			printWriter = new PrintWriter(new FileWriter(filename));
			if (cnsl != null) {
				username = cnsl.readLine("Enter username: ");
				System.out.println("username is: " + username);
				printWriter.println("username=" + username);
				char[] pwd = cnsl.readPassword("Enter password: ");
				password = String.valueOf(pwd);
				System.out.println("Password is: " + String.valueOf(pwd));
				printWriter.println("password=" + password);
				while (true) {
					browser = cnsl.readLine("Enter d browser name out of chrome, firefox and ie: ");
					if (browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("ie")) {
						System.out.println("Browser name is " + browser);
						
						break;
					}

				}
				printWriter.println("browser=" + browser);
				environment = cnsl.readLine("Enter Environment link: ");
				System.out.println("Environment is " + environment);
				printWriter.println("environment=" + environment);
			}

		} catch (Exception ex) {
			// if any error occurs
			System.out.println(ex);
		} finally {
			printWriter.close();
		}

	}
}

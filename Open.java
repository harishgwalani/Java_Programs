package java_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\htg\\Desktop\\Selenium_driverr\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
	}

}

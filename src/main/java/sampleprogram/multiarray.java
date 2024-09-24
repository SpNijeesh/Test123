package sampleprogram;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiarray {

	public static void main(String[] args) {
		ChromeDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		

	}

}

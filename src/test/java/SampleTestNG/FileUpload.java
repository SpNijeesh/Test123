package SampleTestNG;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

//AutoIT program

public class FileUpload {
	
	ChromeDriver driver;
	
	@Test
    public void setUp() throws InterruptedException, IOException {
		

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/pdf_to_word");
        driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\spnij\\Downloads\\fileupload.exe");
	}
	
	
	}



package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_city {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("http://127.0.0.1:5500/citybookingQA.html");
		//driver.findElement(By.id("selectcity")).click();
		//Keys thekeys= Keys.ARROW_DOWN;
		//driver.findElement(By.id("selectcity")).sendKeys(thekeys);
		//driver.findElement(By.id("selectcity")).sendKeys("C"+Keys.ENTER);

		
		
		driver.get("https://www.booking.com");
		driver.findElement(By.xpath("//input[@id='ss']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("Amman");
		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys(Keys.ENTER);
	}

}

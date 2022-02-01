package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'Allow']")).click();
driver.findElement(By.linkText("Create New Account")).click();
Thread.sleep(2000);
driver.findElement(By.name("firstname")).sendKeys("supriya");
driver.findElement(By.name("secondname")).sendKeys("dasaraju");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("949100020");
driver.findElement(By.xpath("input[@id='password_step_input']")).sendKeys("Bg@134#rhy");
WebElement day = driver.findElement(By.id("day"));
Select obj = new Select(day);
obj.selectByVisibleText("25");
WebElement month = (WebElement) driver.findElements(By.id("month"));
Select obj1 = new Select(month);
obj1.selectByValue("5");
WebElement year = driver.findElement(By.id("year"));
Select obj2 = new Select(year);
obj2.selectByVisibleText("1998");
driver.findElement(By.xpath("//input[@name='sex']/preceding::label")).click();




	}

}

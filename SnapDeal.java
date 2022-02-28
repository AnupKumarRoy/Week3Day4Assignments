package Week3Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//span[@class='catText']"));
		actions.moveToElement(men).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		List<WebElement> num = driver.findElements(By.tagName("p"));
		int size = num.size();
		Thread.sleep(5000);
		System.out.println("No. Of Shoes is "+size);
		String title = driver.getTitle();
		String title1 = "Sports Shoes For Men - Upto 70% OFF on Top Shoe Brands";
		if (title.equals(title1)) {
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
		
		
	}

}

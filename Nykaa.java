package Week3Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		actions.moveToElement(brands).perform();
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}

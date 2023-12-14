package week3.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioBags {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.xpath("(//*[contains(@class,'facet-linkname-Men')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@class,'Fashion Bags')]")).click();	
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println(text);
		List<WebElement> brand = driver.findElements(By.className("brand"));
		List<String> Brandname = new ArrayList<String>();
		//String Brand1= brand.toString();
		for(int i=0; i<brand.size();i++) {
			Brandname.add(brand.get(i).getText());
		}
		//System.out.println(Brand1);
		Set<String>Brandname1=new LinkedHashSet<String>(Brandname);
		//Brandname.add(Brand1);
		System.out.println("The list of brand names:");
		for(String Bname:Brandname1) {
			System.out.println(Bname);
		}
//		System.out.println("The list of brand names:");
//		for (int i=0;i<brand.size();i++) {
//			System.out.println(brand.get(i).getText());
//		}
		
		List<WebElement> bag = driver.findElements(By.className("nameCls"));
		List<String> bag1=new ArrayList<String>();
		for(int i=0;i<bag.size();i++) {
			bag1.add(bag.get(i).getText());
		}
		Set<String>Bagname=new LinkedHashSet<String>(bag1);
		
		System.out.println("---------------------------------");
		System.out.println("The list of bag names:");
		for(String b1:Bagname) {
			System.out.println(b1);
		}
//		for (int i=0;i<bag.size();i++) {
//			
//			System.out.println(bag.get(i).getText());
//		}
	}

}

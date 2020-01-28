package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderHandling {

	public static void main(String[] args) 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.cleartrip.com/flights");
		
		String Month_Year = "March 2021";
		String date="5";
		
		String date1;
		driver.findElement(By.xpath("(//div/a/i[@class='icon ir datePicker'])[1]")).click();
				
		while(true)
		{
			String month1=driver.findElement(By.className("ui-datepicker-month")).getText();
			String year1=driver.findElement(By.className("ui-datepicker-year")).getText();
			
			String Month_Year1=month1+" "+year1;
			
			if(Month_Year1.equals(Month_Year))
			{
				System.out.println("Month reached");
//				for (int i = 1; i < 32; i++) {
					driver.findElement(By.xpath("(//td/a[contains(text(),'"+date+"')])[1]")).click();
//				}
				break;
			}
			else {
				driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
			}
		}
		
//		driver.close();
	}

}

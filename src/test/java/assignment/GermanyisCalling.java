package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/******
 * Author-KhyatiShrivastava--Testing for login page(https://app.germanyiscalling.com/common/login/) 
 * using valid(Test1) and invalid credentials(Test2) for which I have passed both testcases and 
 * generated html reports.
 */

public class GermanyisCalling {
	@Test
	public void Test1() {
		//Test1-Login success with valid credentials
		System.setProperty("webdriver.chrome.driver", "F:\\workspace\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigating to url of application
		driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F%3Futm_source%3Dwebsite%26utm_medium%3Dwebsite%26utm_campaign%3Dnavbar_menu%26_gl%3D1%252A1fw96bj%252A_ga%252AMTU2NDU1Njg5OC4xNzI0MzE3NDgy%252A_ga_QYY0B8QQMB%252AMTcyNDMxNzQ4Mi4xLjEuMTcyNDMxOTczMy42MC4wLjA.%26_ga%3D2.201902610.2021621211.1724317483-1564556898.1724317482");
		
		//entering valid credentials and logging in
		driver.findElement(By.id("username")).sendKeys("khyshri281993@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		String header=driver.getTitle();
		System.out.println(header);
		
		System.out.println("Test1 Ends");
		driver.quit();
		
		
	}
	@Test
	public void Test2() {
		
		//Test2-Login failure with invalid credentials 
		System.setProperty("webdriver.chrome.driver", "F:\\workspace\\chromedriver_win32\\chromedriver.exe");
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigating to url of application
		driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F%3Futm_source%3Dwebsite%26utm_medium%3Dwebsite%26utm_campaign%3Dnavbar_menu%26_gl%3D1%252A1fw96bj%252A_ga%252AMTU2NDU1Njg5OC4xNzI0MzE3NDgy%252A_ga_QYY0B8QQMB%252AMTcyNDMxNzQ4Mi4xLjEuMTcyNDMxOTczMy42MC4wLjA.%26_ga%3D2.201902610.2021621211.1724317483-1564556898.1724317482");
		
		//entering valid credentials and logging in
		driver.findElement(By.id("username")).sendKeys("khyshri281993@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12");
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		String expectedErrorMsg="Please enter a correct username and password. Note that both fields may be case-sensitive.";
		String errorMsg=driver.findElement(By.xpath("//li[contains(text(),'Please enter')]")).getText();
		Assert.assertEquals(errorMsg,expectedErrorMsg );
		
		System.out.println("Test2 Ends");
		driver.quit();
	}
}

package ICU;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import atu.testng.reports.ATUReports;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;


@Listeners({ATUReportsListener.class, ConfigurationListener.class, MethodListener.class}) 

public class icu_test {
	
	// Define the path's for the chrome driver and atu-report.
	
		{
			System.setProperty("atu.report.config", "put here your ATUReport path");
		}
		
		{
			 System.setProperty("webdriver.chrome.driver", "put here your chrome driver path");
		}
		
	// 	Define the WebDriver.
		
	  static WebDriver wdDriver;
	  
	  @BeforeTest
	  public static void  beforeTest() {
		  
		  // Set the WebDriver as a chrome driver.
		  wdDriver = new ChromeDriver();
		  
		  // Set the wdDriver as a WebDriver for the atu-report.
	      ATUReports.setWebDriver(wdDriver);
	      
	      // Set the url of the website.
		  final String Path = "put here your website url";
		  
		  // Navigate to the website.
		  wdDriver.navigate().to(Path);
		  
		  // Maximize the window.
		  wdDriver.manage().window().maximize();
	  }
	  
	  @Test
	  public void f() throws InterruptedException {
		  
		  // Over the ADFS.
		  wdDriver.findElement(By.cssSelector("[type='submit']")).click();
		  
		  // Waiting.
		  Thread.sleep(7500);
		  
		  // Open the user menu.
		  wdDriver.findElement(By.className("user-menu")).click();
		  
		  // Click on the user profile.
		  wdDriver.findElement(By.cssSelector("[href='/profile']")).click();
		 
		  Thread.sleep(5500);
		  
		  /*// Upload a photo.
		  wdDriver.findElement(By.cssSelector("[ng-model='me.profile.avatar']")).click();
		  
		  Thread.sleep(50000);
		  */
		  // Saveing the new profile.
		  wdDriver.findElement(By.id("saveprofile")).click();
		  
		  Thread.sleep(1500);
		  
		  // Open the plus menu.
		  wdDriver.findElement(By.className("dropdown-toggle")).click();
		  
		  Thread.sleep(1500);
		  
		  // Open a new task.
		  wdDriver.findElement(By.cssSelector("[ng-click ='createTask()']")).click();
		
		  Thread.sleep(3000);
		  
		  // Make the mission be a favorite.
		  wdDriver.findElement(By.cssSelector("[ng-click='star(task)']")).click();
		  
		  Thread.sleep(7000);
		  
		  // Manage one friend to by task responsible.
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]")).click();
			
		  // Search a friend.
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/tooltip/tip-cont/div/div/input[1]")).sendKeys("×�×‘×™×¨×� ×�×©×›× ×–×™");
		  
		  // Select the friend.
		  wdDriver.findElement(By.xpath(".//*[@id='ui-select-choices-row-8-0']/a")).click();
		  
		  Thread.sleep(1000);
		  
		  // Add a date for the task.
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[3]/div")).click();
			  
		  // Change the status of the task
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[5]")).click();
			  
		  Thread.sleep(1000);
		  
		  // Change the states of the task.
		  wdDriver.findElement(By.xpath(".//*[@id='ui-select-choices-row-9-2']/a")).click();
		  
		  Thread.sleep(1500);
		 
		  // Write a title.
		  wdDriver.findElement(By.cssSelector("[ng-model='task.title']")).sendKeys("Try");
		  
		  Thread.sleep(1500);
		  
		  // Add a description.
		  wdDriver.findElement(By.cssSelector("[tabindex='2']")).sendKeys("Hello world!");
		  
		  Thread.sleep(1500);
		  
		  // Click on add a new tag.
		  wdDriver.findElement(By.className("new-tag-icon")).click();
		  
		  Thread.sleep(1000);
		  
		  /*wdDriver.findElement(By.className("new-tag-input")).click();
		  
		  Thread.sleep(9000);
		  
		  wdDriver.findElement(By.className("from-control ui-select-search ng-valid ng-touched ng-dirty")).sendKeys("Hi");
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.className("from-control ui-select-search ng-valid ng-touched ng-dirty")).submit();
	    */
		  
		  Thread.sleep(1000);
		  
		  // Add a subtask
		  wdDriver.findElement(By.cssSelector("[ng-click='addSubTasks = !addSubTasks']")).click();
		  
		  Thread.sleep(5000);
		  
		  // Open a new subtask
		  wdDriver.findElement(By.cssSelector("[colspan='6']")).click();
		  
		  Thread.sleep(7000);
		  
		  // Add a name to the subtask.
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[5]/div[2]/div/table/tbody/tr[1]/td[2]")).sendKeys("new");
		  
		  // Manage one friend to by subtask responsible.
		  wdDriver.findElement(By.cssSelector("[ng-model='data.task.assign']")).click();
		  
		  Thread.sleep(1500);
		  
		  // Pick one.
		  wdDriver.findElement(By.className("ui-select-choices-row-inner")).click();
		  
		  Thread.sleep(1000);
		  
		  // Click on update line.
		  wdDriver.findElement(By.cssSelector("[ng-focus='expandUpdate()']")).click();
		  
		  Thread.sleep(5000);
		  
		  // Add update.
		  wdDriver.findElement(By.cssSelector("[ng-focus='expandUpdate()']")).sendKeys("new update");
		  
		  Thread.sleep(1500);
		  
		  // Upload the update.
		  wdDriver.findElement(By.cssSelector("[type='submit']")).click();
		  
		  Thread.sleep(9000);
		  
		  // Click on document line.
		  wdDriver.findElement(By.cssSelector("[data-ui-sref='.documents']")).click();
		  
		  Thread.sleep(5000);
		  
		  // Add document.
		  wdDriver.findElement(By.className("attachment")).click();
		  
		  Thread.sleep(7000);
		  
		  // Upload the document.
		  wdDriver.findElement(By.cssSelector("[type='submit']")).click();
		  
		  Thread.sleep(7000);
		  
		  // Add member to the mission.
		  wdDriver.findElement(By.cssSelector("[tooltip-template='×”×•×¡×£ ×©×•×ª×£']")).click();
		  
		  Thread.sleep(5000);
		  
		  // Pick one friend.
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/span")).click();
		 
		  // Search for friend.
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/input[1]")).sendKeys("×™×•×¡×£ ×œ×™×™×‘×ž×Ÿ");
		  
		  // Choose him.
		  wdDriver.findElement(By.xpath("//*[@id='ui-select-choices-row-15-0']/a")).click();
	  
		  Thread.sleep(1100);
		  
		  // Open a new task.
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[1]/div/div/div/div[3]/div[1]/table/tbody/tr[3]")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[1]/div/div/div/div[2]/div[1]/button")).click();
		  
		  Thread.sleep(1000);
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[6]/div")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("/html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[6]/ul/li/a")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[1]/nav/ul/li[2]/div/div[2]/span")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[1]/div/div/div/div[2]/div[1]/table/tbody/tr")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.cssSelector("[ng-model='project.title']")).sendKeys("prog");
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.className("color")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div[2]/div[11]")).click();
	  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.cssSelector("[ng-click='star(project)']")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.className("in-progress")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")).sendKeys("niceee");
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.cssSelector("[ng-focus='expandUpdate()']")).sendKeys("new update");
		  
		  // Upload the update.
		  wdDriver.findElement(By.cssSelector("[type='submit']")).click();
		  
		  // Add document.
		  wdDriver.findElement(By.className("attachment")).click();
		  
		  Thread.sleep(7000);
		  
		  // Upload the document.
		  wdDriver.findElement(By.cssSelector("[type='submit']")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/div/button[3]")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[4]/div/div[1]/button")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[1]/div/div/div/div[3]/div[1]/table/tbody/tr")).click();
	  
		  Thread.sleep(1000);
		  
		  // Write a title.
		  wdDriver.findElement(By.cssSelector("[ng-model='task.title']")).sendKeys("Open the prog");
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]")).click();
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("/html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/tooltip/tip-cont/div/div/input[1]")).sendKeys("×™×¨×•×Ÿ ×ž×™×¨×•×œ×•×–");
		  
		  Thread.sleep(1000);
		  
		  wdDriver.findElement(By.xpath("./html/body/section/section/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/tooltip/tip-cont/div/div/ul")).click();
		  
		  Thread.sleep(1000);
		  
		  // Open the plus menu.
		  wdDriver.findElement(By.className("dropdown-toggle")).click();
		  
		// Open a new project.
		  wdDriver.findElement(By.cssSelector("[ng-click ='createProject()']")).click();
		  
		// Make the project be a favorite.
		  wdDriver.findElement(By.cssSelector("[ng-click='star(task)']")).click();
		  
		  wdDriver.findElement(By.xpath("/html/body/section/section/div[1]/div[2]/div[1]/div/div/div/div[3]/div[1]/table/tbody/tr[2]")).click();
	  }
}



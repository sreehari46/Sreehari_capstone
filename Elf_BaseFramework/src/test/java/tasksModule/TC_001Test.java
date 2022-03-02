package tasksModule;

import genericLibrary.Base_Class;
import pomRepository.MyPomPage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

/***
 * 
 * @author Sreehari
 *
 */


public class TC_001Test extends Base_Class {
	 MyPomPage pompage;
	
	@Test
	public void GenSettings()  {
		pompage=new MyPomPage(driver);
		
		pompage.getClickingOnSettings().click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		pompage.getClickingOnGeneralSettings().click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollTo(328,2500);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pompage.getClickingOnCheckbox().click();
		
		pompage.getClickingOnSaveButton().click();
		
		
	}
	

}

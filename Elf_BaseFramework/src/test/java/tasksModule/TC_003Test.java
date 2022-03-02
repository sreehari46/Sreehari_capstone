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


public class TC_003Test extends Base_Class {
@Test
public void Delting() {
	MyPomPage pompage;
	pompage=new MyPomPage(driver);
	

	
	pompage.getClickingOnIcon().click();
	
	pompage.getClickingOnCreateAcc().click();
	
	pompage.getClickingOnFN().click();
	pompage.getClickingOnFN().sendKeys("sree");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	pompage.getClickingOnLN().click();
	pompage.getClickingOnLN().sendKeys("hari");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	pompage.getClickingOnEmail().click();
	pompage.getClickingOnEmail().sendKeys("abcd@gmail.com");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	pompage.getClickingonSendInvi().click();
}
}

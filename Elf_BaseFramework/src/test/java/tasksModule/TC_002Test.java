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

public class TC_002Test extends Base_Class {
	
	@Test
	public void CopyPro() {
		MyPomPage pompage;
		pompage=new MyPomPage(driver);
		
		pompage.getClickingOnTasks().click();
		
		pompage.getClickingOnAddNew().click();
		
		pompage.getClickingOnNewCust().click();
		
		pompage.getClickingOnCustName().click();
		pompage.getClickingOnCustName().sendKeys("rakesh");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pompage.getClickingOnCustDesc().click();
		pompage.getClickingOnCustDesc().sendKeys("project");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pompage.getClickingOnCustDropdown().click();
		
		pompage.getClickingOnBigBang().click();
		
		pompage.getClickingOnCreate().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package tasksModule;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.MyPomPage;

public class SampleTestCase extends Base_Class{
	
	@Test
	public void sample() {
		
			MyPomPage pompage;
			pompage=new MyPomPage(driver);	
			
//			pompage.getClickingonUsers().click();
//			
//			pompage.getClickinonDept().click();
	}

}

package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPomPage {
	public MyPomPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Data members or properties of FirstTC
	@FindBy(xpath="(//div[@class='popup_menu_container'])[2]") private WebElement ClickingOnSettings;

	@FindBy(id="popup_menu_item_6") private WebElement ClickingOnGeneralSettings;
	
	@FindBy(xpath="(//input[@tabindex='0'])[2]") private WebElement ClickingOnCheckbox;
	
    @FindBy(id="FormModifiedDivButton") private WebElement ClickingOnSaveButton;
	
	//second TC
	@FindBy(id="container_tasks") private WebElement ClickingOnTasks;
	
	@FindBy(xpath="//div[text()='Add New']") private WebElement ClickingOnAddNew;
	
	@FindBy(css="div[class='item createNewCustomer']") private WebElement ClickingOnNewCust;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") private WebElement ClickingOnCustName;
	
	@FindBy(css="textarea[placeholder='Enter Customer Description']") private WebElement ClickingOnCustDesc;
	
	@FindBy(css="div[class='emptySelection']") private WebElement ClickingOnCustDropdown; 
	
	@FindBy(xpath="(//div[@class='itemRow cpItemRow '])[1]") private WebElement ClickingOnBigBang;
	
	@FindBy(xpath="(//div[@class='components_button_label'])[17]") private WebElement ClickingOnCreate;
	
	//third TC

	@FindBy(xpath="(//div[@class='menu_icon'])[4]") private WebElement ClickingOnIcon;

	@FindBy(id="popup_menu_support_createAccountColleague") private WebElement ClickingOnCreateAcc;

    @FindBy(id="popup_menu_support_firstNameInviteMenu") private WebElement ClickingOnFN;
    
   
	@FindBy(id="popup_menu_support_lastNameInviteMenu") private WebElement ClickingOnLN;
    
    @FindBy(id="popup_menu_support_emailInviteMenu") private WebElement ClickingOnEmail;
    
    @FindBy(id="popup_menu_support_sendInvitationButton") private WebElement ClickingonSendInvi;


	

	

//FirstMethods
	public WebElement getClickingOnSettings() {
		return ClickingOnSettings;
	}

	public WebElement getClickingOnGeneralSettings() {
		return ClickingOnGeneralSettings;
	}

	
	public WebElement getClickingOnCheckbox() {
		return ClickingOnCheckbox;
	}
	

	public WebElement getClickingOnSaveButton() {
		return ClickingOnSaveButton;
	}
	
	//second TC
	public WebElement getClickingOnTasks() {
		return ClickingOnTasks;
	}
	
	public WebElement getClickingOnAddNew() {
		return ClickingOnAddNew;
	}
	
	public WebElement getClickingOnNewCust() {
		return ClickingOnNewCust;
	}
	
	public WebElement getClickingOnCustName() {
		return ClickingOnCustName;
	}
	
	public WebElement getClickingOnCustDesc() {
		return ClickingOnCustDesc;
	}
	
	public WebElement getClickingOnCustDropdown() {
		return ClickingOnCustDropdown;
	}
	
	public WebElement getClickingOnBigBang() {
		return ClickingOnBigBang;
	}
	
	public WebElement getClickingOnCreate() {
		return ClickingOnCreate;
	}
	
	//third TC

	public WebElement getClickingOnIcon() {
		return ClickingOnIcon;
	}
	public WebElement getClickingOnCreateAcc() {
		return ClickingOnCreateAcc;
	}
	
	 public WebElement getClickingOnFN() {
			return ClickingOnFN;
		}
		public WebElement getClickingOnLN() {
			return ClickingOnLN;
		}
	public WebElement getClickingOnEmail() {
			return ClickingOnEmail;
		}

		public WebElement getClickingonSendInvi() {
			return ClickingonSendInvi;
		}









	
	
	
	
}

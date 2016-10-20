package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVOrderPage extends OmniVuePage {

	OVCreateDevicePage devcreatepage;
	UserSteps enduser;
	OVLoginPage loginPage;
	
	@FindBy(id="OrderNo")
	public WebElementFacade tbx_orderno;
	
	@FindBy(id="customerFirstName")
	public WebElementFacade tbx_customername;
	
	@FindBy(id="customerLastname")
	public WebElementFacade tbx_customerlastname;
	
	@FindBy(id="customerType")
	public WebElementFacade ddl_customerType;
	
	@FindBy(id="customerSubtype")
	public WebElementFacade ddl_customerSubtype;
	
	@FindBy(id="accountType")
	public WebElementFacade ddl_accountType;
	
	@FindBy(xpath=".//*[@ng-click='openServAddrLocLookUp(field.name)']/img")
	public WebElementFacade btn_serviceaddress;
	
	@FindBy(id="remark")
	public WebElementFacade tbx_General_remark;
	
	@FindBy(id="DTN")
	public WebElementFacade tbx_dtn;
	
	@FindBy(id="serviceType")
	public WebElementFacade ddl_serviceType;
	
	@FindBy(id="hdStreams")
	public WebElementFacade ddl_hdStreams;
	
	@FindBy(id="hdStreams")
	public List<WebElementFacade> ddl_hdStreams1;
	
	
	@FindBy(id="downSpeed")
	public WebElementFacade ddl_downSpeed;
	
	@FindBy(id="upSpeed")
	public WebElementFacade ddl_upSpeed;
	
	@FindBy(id="featureCodeCollection")
	public List<WebElementFacade> lbl_featureCodeCollection;
	
	
	@FindBy(id="featureCodeRemark")
	public WebElementFacade tbx_featureCodeRemark;
	
	@FindBy(id="appointmentStartDate_0")
	public WebElementFacade tbx_appointmentStartDate;
	
	@FindBy(id="appointmentEndDate_0")
	public WebElementFacade tbx_appointmentEndDate;
	
	@FindBy(id="requestedDueDate_0")
	public WebElementFacade tbx_requestedDueDate;
	
	@FindBy(id="dispatchRemark")
	public WebElementFacade tbx_dispatchRemark;
	
	//				Need to compare with Device Location search & remove if it's already available
	
	@FindBy(id="address")
	public WebElementFacade tbx_addressno;
	
	@FindBy(id="streetName")
	public WebElementFacade tbx_streetName;
	
	@FindBy(id="city")
	public WebElementFacade tbx_city;
	
	@FindBy(id="state")
	public WebElementFacade ddl_state;
	
	@FindBy(xpath=".//*[@ng-click='lookUpCall()']")
	public WebElementFacade btn_lookup;
	
	// End of it
	
	//@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/a")
	@FindBy(xpath=".//*[@ng-click='lookupGridSettings.selLukupValue(0)']")
	public WebElementFacade lnk_addlcn;
	
	@FindBy(xpath=".//*[@class='order-detail-group ng-scope']/div/div")	
	public List<WebElementFacade> lbl_SearchpageOrderxpath;
	
	//@FindBy(xpath=".//*[@class='control-label ng-binding']")	
	@FindBy(xpath=".//*[@class='order-detail-group']/div[@ng-repeat='row in editRows']")
	public List<WebElementFacade> lbl_EditpageOrderxpath;
	
	//Action Button check
	
	@FindBy(xpath=".//*[@value='Edit Order']")
	public WebElementFacade btn_editmltoorder;
	
	@FindBy(xpath=".//*[@value='Cancel Order']")
	public WebElementFacade btn_cancelmltoorder;
	
	
	//Service Area check
	
	@FindBy(xpath=".//*[text()='Service Address:']/following-sibling::label[1]")
	public WebElementFacade lbl_orderserviceaddress;
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tbx_orderno;
	}
	
	public String create_order_successfull_msg() {
		String message=devcreatepage.success_alert.getText();
		String msg = message.substring(1, message.length());
		 System.out.println(msg);
		return msg;
		}
	
	public void action_button_MLTO_Search(String action) throws InterruptedException{
		if(action.equals("Edit")){
			btn_editmltoorder.click();
		}
		Thread.sleep(5000);
	}
	
	public void buttonvisibilitycheck(String button){
		if(button.equals("EDIT")){
			btn_editmltoorder.isEnabled();
		} else if(button.equals("CANCEL")){
			btn_cancelmltoorder.isEnabled();
		} else throw new Error("Buttons are disabled");
	}
}

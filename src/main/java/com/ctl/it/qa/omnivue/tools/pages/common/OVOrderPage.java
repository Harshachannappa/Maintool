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
	public WebElementFacade tbx_serviceType;
	
	@FindBy(id="downSpeed")
	public WebElementFacade tbx_downSpeed;
	
	@FindBy(id="upSpeed")
	public WebElementFacade tbx_upSpeed;
	
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
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tbx_orderno;
	}
	
	
}

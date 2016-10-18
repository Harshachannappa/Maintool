package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVLoginPage extends OmniVuePage {
	
	@FindBy(id = "user")
	public WebElementFacade tbx_userName;
	
	@FindBy(id = "password")
	public WebElementFacade tbx_pwd;
	
	@FindBy(xpath=".//*[text()='Sign in']") //Test3 login button
	//@FindBy(id = "loginButton")  //Test1 login button
	public WebElementFacade btn_login;	
	

	@Override
	public WebElementFacade getUniqueElementInPage() {		
		return tbx_userName;
	}
	
	public void EnterDetails(String userType) {
		IntDataContainer datacontainer = envData.getContainer(
				this.getClass().getSimpleName()).getContainer(userType);
		tbx_userName.type(datacontainer.getFieldValue("username_tbx"));
		tbx_pwd.type(datacontainer.getFieldValue("pwd_tbx"));
		
	}
	
	public void clickLogin() {
		btn_login.click();
	}

}

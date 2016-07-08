package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVDeviceLookupPage extends OmniVuePage {
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[15]/div[1]/div/span/input[@value='Edit']")
	public WebElementFacade btn_editInDeviceLookup;
	
	@FindBy(xpath=".//accordion[5]/div/div/div/h4/a/span")
	public WebElementFacade lnk_circuitparameter;

	@FindBy(xpath=".//*[@ng-click='searchOrders()']")
	public WebElementFacade btn_adsearchorder;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return btn_editInDeviceLookup;
		//return null;
	}
	
	public void click_devicelookupeditbtn() throws Exception {
		btn_editInDeviceLookup.click();
		Thread.sleep(5000);
	}
	
	public void click_circuitparameter() throws Exception {
		System.out.println(lnk_circuitparameter.getText());
		lnk_circuitparameter.click();
		Thread.sleep(5000);
	}

}

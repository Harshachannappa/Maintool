package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVModDeviceLookupPage extends OmniVuePage {
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[15]/div[1]/div/span/input[@value='Edit']")
	public WebElementFacade btn_editInDeviceLookup;
	

	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return btn_editInDeviceLookup;
		//return null;
	}
	
	public void click_devicelookupeditbtn() throws Exception {
		btn_editInDeviceLookup.click();
		Thread.sleep(5000);
	}

}

package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVModServiceDetailsPage extends OmniVuePage{
	
	@FindBy(id="NAME")
	public WebElementFacade tbx_editDeviceName;

	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[14]/div[1]/div/span/input[@value='Save']")
	public WebElementFacade btn_ModSave;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_ModDevice;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return null;
	}
	
	public void click_savebtn() throws Exception {
		btn_ModSave.click();
		Thread.sleep(5000);
	}
	
	public void click_devicetab() {
		tab_ModDevice.click();
	}
	
}

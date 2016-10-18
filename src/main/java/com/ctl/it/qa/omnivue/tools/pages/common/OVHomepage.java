package com.ctl.it.qa.omnivue.tools.pages.common;


import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVHomepage extends OmniVuePage {
	
	@FindBy(xpath=".//*[@id='logoutUrlForm']/a[1]")
	public WebElementFacade lnk_logout;
	
	@FindBy(xpath="html/body/div[3]/form/table/tbody/tr/td[17]/table/tbody/tr/td[2]/table/tbody/tr/td")
	public WebElementFacade tab_activation;	
	
	@FindBy(xpath=".//*[@id='pwd-container']/div[2]/section/img")
	public WebElementFacade lbl_welcomeomnivue;	
	
	@FindBy(xpath=".//*[@ng-class='status.MSGSEV']")
	public List<WebElementFacade> lbl_systemstatus;
	
	@FindBy(xpath = "html/body/div[3]/div[3]/span[1]")
	public WebElementFacade lbl_OV_version;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		return lnk_logout;
	}
	
	public void click_activation_tab() throws Exception {
		tab_activation.click();
		Thread.sleep(7000);
	}
	
	public void click_logout() throws Exception {
		lnk_logout.click();
		Thread.sleep(5000);
	}
	

}

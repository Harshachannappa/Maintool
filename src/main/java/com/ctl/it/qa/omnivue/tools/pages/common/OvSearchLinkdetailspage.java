package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OvSearchLinkdetailspage extends OmniVuePage {

	@FindBy(xpath="//input[@value='Edit']")
	public WebElementFacade btn_Edit;
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return btn_Edit;
	}
	
	public void clickonEdit()

	{
		btn_Edit.click();
	}
	
	@FindBy(xpath="//select[@id='LINK2PROVISIONSTATUS']")
	public WebElementFacade ddl_provisonstatus;
	
	@FindBy(xpath="//select[@id='LINK2FUNCTIONALSTATUS']")
	public WebElementFacade ddl_functionalstatus;
	
	@FindBy(id="ALIAS1")
	public WebElementFacade tbx_Alias1;
	@FindBy(id="AERIALORBURIED")
	public WebElementFacade ddl_aeriallorburied;
	
	@FindBy(xpath="(//input[@class='cmdButton'])[1]")
	public WebElementFacade btn_save;
	public void clicksave()
	{
		btn_save.click();
	}
	@FindBy(xpath="//label[contains(text(),'Pending Disconnect')]")
	public WebElementFacade field_pendingdisconnect;
	
	@FindBy(xpath="//label[contains(text(),'Defective')]")
	public WebElementFacade field_defective;
	
	@FindBy(xpath="//label[contains(text(),'alias14')]")
	public WebElementFacade field_alias14;
	
	@FindBy(xpath="(//label[contains(text(),'Aerial')])[2]")
	public WebElementFacade field_aerial;
		
	public void validate()
	{
		Assert.assertEquals(field_pendingdisconnect.getText(), "Pending Disconnect");
		Assert.assertEquals(field_defective.getText(), "Defective");
		Assert.assertEquals(field_alias14.getText(), "alias14");
		Assert.assertEquals(field_aerial.getText(), "Aerial");
	}
	

	
	
	
}

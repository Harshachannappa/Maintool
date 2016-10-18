package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVLocationDetailsPage extends OmniVuePage {

	@FindBy(xpath="//a[text()='Subscribers']")
	public WebElementFacade btn_subscriber;
	
@FindBy(xpath="(//input[@value='Add Subscriber Association'])[2]")	
public WebElementFacade btn_AddSubScriber;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return btn_subscriber;
	}
	
public void  Addsubbtnverify()
{
	Assert.assertTrue(btn_AddSubScriber.isPresent());
	btn_AddSubScriber.click();
}
  
  
}

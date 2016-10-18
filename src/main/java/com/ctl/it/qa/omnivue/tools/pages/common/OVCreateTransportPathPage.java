package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateTransportPathPage extends OmniVuePage {
	
	@FindBy(xpath="(//label[@class='col-lg-4 col-md-4 col-sm-6 col-xs-12 ng-binding'])[1]")
	public WebElementFacade lbl_startDeviceName;
	
	@FindBy(xpath=".//*[@id='parentSelectId_0']")
	public WebElementFacade ddl_circuit;
	
	@FindBy(xpath="(//label[@class='col-lg-4 col-md-4 col-sm-6 col-xs-12 marLP15'])[1]")
	public WebElementFacade lbl_endDeviceName;
	
	@FindBy(xpath="//input[@value='Submit']")
	public WebElementFacade btn_submit;
	
	
	//----------------------------------------------------------------------------
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return btn_submit;
	}

	
	public void validate_TransportDeviceName(String devName) throws InterruptedException {
		System.out.println("expectedstartDeviceName ="+devName);
		Thread.sleep(5000);
		String startDeviceName = lbl_startDeviceName.getText();
		System.out.println("startDeviceName "+startDeviceName);
		
		String FielsString[] = startDeviceName.split(":");
		String actualstartDeviceName = FielsString[1].trim();
		System.out.println("actualstartDeviceName= "+actualstartDeviceName);
		Assert.assertEquals("Start Device Name is not same", devName, actualstartDeviceName);
		
	}
	
	public void validate_endDeviceName(String devName) throws InterruptedException {
		System.out.println("expectedsCircuitName ="+devName);
		Thread.sleep(5000);
		String endDeviceName = lbl_endDeviceName.getText();
		System.out.println("endDeviceName "+endDeviceName);
		
		String FielsString[] = devName.split("/");
		String actualCircuitName = FielsString[2];
		System.out.println("actualCircuitName= "+actualCircuitName);
//		Assert.assertEquals("Start Device Name is not same", devName, actualstartDeviceName);
		
		Boolean flag1 = endDeviceName.contains(actualCircuitName);
		Assert.assertTrue("End device name is not same", flag1);
//		Assert.assertEquals("Subscriber Name is not same", sSubscriberName, actualSubscriberNameFieldvalue);
		System.out.println("End device name is same");
		
	}
	
	public void verifySubmitButtonAndClick() throws InterruptedException{
		Boolean flag = btn_submit.isEnabled();
		System.out.println("verifying Submit Button");
		if(flag){
			System.out.println("Submit Button is Enabled");
			btn_submit.click();
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("Submit Button is not Enabled");
		}
	}
}

package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVSearchDevicePage extends OmniVuePage {
	UserSteps enduser;
	@FindBy(xpath="//a[text()='Services']")
	public WebElementFacade tab_services;
	
	@FindBy(xpath=".//a[text()='CTag Pool']")
	public WebElementFacade tab_ctag;

	@FindBy(xpath=".//a[text()='Orders']")
	public WebElementFacade tab_orders;

	@FindBy(xpath=".//a[text()='Contacts']")
	public WebElementFacade tab_contact;
	
	@FindBy(xpath=".//a[text()='BAM Report']")
	public WebElementFacade tab_bamreport;
	
	@FindBy(xpath = "//a[text()='Activations']")
	public WebElementFacade tab_Activations;
	
	//olt
	//ont
	//mst
	//mdu
	//splitter
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[2]/table/thead/tr/th[@class='header-label']")
	public By lbl_attributes;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[4]/table/tbody[1]/tr/td[2]")
	public WebElementFacade tbx_deviceName;
	
	public static String allsearchXapath="header-label"; // Have to find alternate to findelements
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tab_services;
	}
	
	public void click_servicetab(String tab) throws Exception {
		//tab_ctag.click();
		Thread.sleep(5000);
		System.out.println("Executed the line"+tab);
		
		if(tab=="Services"){
			tab_services.click();
			Thread.sleep(35000);
		}
		else if(tab=="CTag"){
			tab_ctag.click();
			
		}
		else if(tab=="Orders"){
			tab_orders.click();
			
		}
		else if(tab=="Contacts"){
			 tab_contact.click();
			
		}
		else if(tab=="BAM Report"){
			tab_bamreport.click();
			
		}
		else if(tab=="Activations"){
			tab_Activations.click();
			
		}
		Thread.sleep(35000);
						
	}
	
	public void attribute_field() throws Exception {
		Thread.sleep(3000);
		//String txtfields=enduser.getDriver().findElements(By.xpath(".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[2]/table/thead/tr/th[@class='header-label']"));
		//System.out.println(lbl_attributes.getText());
		
	}
}

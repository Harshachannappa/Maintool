package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;

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
	
	//23/9/2016
	@FindBy(xpath="//input[@value='Edit Device Details']")
	public WebElementFacade btn_EditDeviceDetailbtn;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_mainTab;
	
	@FindBy(xpath="//input[@value='Edit']")
	public WebElementFacade btn_Editbtn;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[3]/ng-include/div[1]/div/div[2]/input[1]")
	public WebElementFacade btn_save;
	
	//MOHIT
	@FindBy(xpath="//input[@class='cmdButton' and @value='Save']")
	public WebElementFacade btn_TDSave;
	//End of 9/23
	
	
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
	
	public void click_EditbtnForTopology(String button) throws InterruptedException {
		tab_mainTab.click();
		Thread.sleep(3000);
		if(button.equals("Edit")){
		btn_Editbtn.click();
		}
		else if(button.equals("Save")){
			btn_TDSave.click();
			}
		Thread.sleep(5000);
	}
	//-------------------------------------MOHIT--------------------------------------------------
	
		//TC55484 AND TC55509 (METHOD IS ALREADY PRESENT, WE CHANGED THE IMPLEMENTATION)
		
		public void click_Editbtn(String button) throws InterruptedException {
			tab_mainTab.click();
			Thread.sleep(3000);
			if(button.equals("Edit")){
			btn_Editbtn.click();
			}
			else if(button.equals("Save")){
				JavascriptExecutor jse = (JavascriptExecutor)getDriver();
				try{
				jse.executeScript("window.scrollBy(0,250)", "");
				btn_save.click();
				System.out.println("try");
				}catch(Exception e){
				jse.executeScript("arguments[0].click();", btn_save);
				System.out.println("catch");
				}
				}
			Thread.sleep(5000);
		}

}

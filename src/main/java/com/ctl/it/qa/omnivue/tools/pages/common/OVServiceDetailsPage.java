package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVServiceDetailsPage extends OmniVuePage {

	OVCreateDevicePage devcreatepage;
	
	@FindBy(id="NAME")
	public WebElementFacade tbx_editDeviceName;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[14]/div[1]/div/span/input[@value='Save']")
	public WebElementFacade btn_save;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_device;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading/a[@ng-click='removeTab(tab.id,$index)']/img[1]")
	public WebElementFacade tab_close;
	// close tab of service page []
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading/a[@ng-click='removeTab(tab.id,$index)']/img[2]")
	public WebElementFacade tab1_close;
	//close tab of service page [*]
	
	@FindBy(xpath=".//*[@id='dropdownMenu1']/img")
	public WebElementFacade img_settings;
	
	@FindBy(xpath=".//div[2]/div/label[3]/img[@ng-click='deletePoolRange(ind)']")
	public WebElementFacade btn_Ctagdelete;
		
	@FindBy(xpath="//a[text()='Logout']")
	public WebElementFacade lnk_logoutInSettings;
	
	//Order Validation
	
	@FindBy(xpath=".//label[text()='CSOF Order Number:']/following-sibling::label[1]")
	public WebElementFacade lbl_csof_id;
	
	@FindBy(xpath=".//label[text()='Subscriber:']/following-sibling::label[1]")
	public WebElementFacade lbl_subscriber;
	
	@FindBy(xpath=".//label[text()='DTN:']/following-sibling::label[1]")
	public WebElementFacade lbl_dtn;
	
	@FindBy(xpath=".//label[text()='EnsembleOrderNumber']/following-sibling::label[1]")
	public WebElementFacade lbl_EnsembleOrderNumber;
	
	// End of Order Validation
	
	//Contact validation
	
	@FindBy(xpath=".//*[@value='Add Contact']")
	public WebElementFacade btn_addcontact;
		
	@FindBy(xpath="//*[contains(text(),'Create Contact')]")
	public WebElementFacade createcontacttab;
	
	//End of Contact validation
		
		
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return null;
	}
	
		
	public void click_savebtn() throws Exception {
		btn_save.click();
		Thread.sleep(5000);
	}
	
	
	public void click_devicetab() throws Exception {
		//close_tab.click();
		//Thread.sleep(5000);
		tab_device.click();
	}
	
	
	public void click_closetab(){
	
		// trying to click on close button .As it have 2image of close , we kept it in nested try.
		try {
			tab_close.click();
			Thread.sleep(2000);
		}
			catch (Exception  e) {
				e.printStackTrace();
		try { 
			tab1_close.click();
			//Thread.sleep(2000);
		}
		catch (Exception e1) {	
		// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
			}
	
	}
	public void Revertname(){
		tbx_editDeviceName.sendKeys("77/L1XX/785391//CTQF");	
	}
	
	public void click_logoutinsettings() throws Exception {
		img_settings.click();
		Thread.sleep(2000);
		lnk_logoutInSettings.click();
		Thread.sleep(15000);
	}

	public void click_Ctagdelete() {
		btn_Ctagdelete.click();
	}
	
	//Validating the Add contact present in location search
		public void validateaddcontactbutton(){
			try {
			if(btn_addcontact.isVisible()){
				btn_addcontact.click();
				Thread.sleep(3000);
				if(createcontacttab.isVisible()){
					System.out.println("Valiadted Add contact button successfully");
					Thread.sleep(3000);
				}
				
			}				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		public boolean Validation_Usabilites(String serviceType,String serviceCapabilityType1,String serviceCapabilityType2) throws InterruptedException {
			int validation=0;
			List<WebElementFacade> serviceList = devcreatepage.lbl_allServiceXapath;
			ArrayList<String> services=new ArrayList<String>();
			for(int j=0;j<serviceList.size();j++){
				services.add(j, serviceList.get(j).getText());
						
			}
			for(int i=0;i<services.size();i++){
				
				 if(services.get(i).equals(serviceType))
				 {				
					String actualServiceCapabilityTypeXpath="//div[contains(@id,'row"+i+"serviceGrid_')]/div[4]/div";
					 
					 String actualServiceCapabilityType=find(By.xpath(actualServiceCapabilityTypeXpath)).getText();
					 System.out.println("check wat is this next"+actualServiceCapabilityType);
					 if(actualServiceCapabilityType.equals(serviceCapabilityType1)||actualServiceCapabilityType.equals(serviceCapabilityType2))
					 {
						 System.out.println("Successfully validated");						 
						 System.out.println(services.get(i));
						 System.out.println(actualServiceCapabilityType);
						 validation=1;
					}
					 
				}
			}
			if(validation==1){
				return true;
				}
				else {				
				return false;
				}
		}
}

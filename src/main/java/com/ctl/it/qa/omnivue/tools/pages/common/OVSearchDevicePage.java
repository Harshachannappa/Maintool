package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;


public class OVSearchDevicePage extends OmniVuePage {
	UserSteps enduser;
	OVCreateDevicePage devcreatepage;
	OVActivationPage actvtnpage;
	
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
	
	//Newly Added By MOHIT
	@FindBy(xpath="//a[text()='Subscribers']")
	public WebElementFacade tab_Subscriber;
	
	@FindBy(xpath="//a[text()='Circuits']")
	public WebElementFacade tab_Circuits;
	
	@FindBy(xpath="//a[text()='Tasks']")
	public WebElementFacade tab_Tasks;
	
	@FindBy(xpath="//a[text()='Locations']")
	public WebElementFacade tab_Locations;
	
	@FindBy(xpath="//a[text()='Devices']")
	public WebElementFacade tab_Devices;
	
	//olt
	//ont
	//mst
	//mdu
	//splitter
	
	//New changes--9/23
	
	
		
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[2]/table/thead/tr/th[@class='header-label']")
	public By lbl_attributes;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[4]/table/tbody[1]/tr/td[2]")
	public WebElementFacade tbx_deviceName;
	
	//New updates--9/23
	
	@FindBy(xpath="//thead[tr[th[text()='Subscriber Type']]]/following-sibling::tbody[1]/tr/td[2]")
	public WebElementFacade lbl_SubscriberType;
	
	@FindBy(xpath="//thead[tr[th[text()='Subscriber Name']]]/following-sibling::tbody[1]/tr/td[3]")
	public WebElementFacade lbl_SubscriberName;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_NetworkDetail;
	
	@FindBy(xpath="//input[@value='Edit Device Details']")
	public WebElementFacade btn_EditDeviceDetailbtn;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	public WebElementFacade btn_saveDeviceDetail;
	
	@FindBy(xpath="//thead[tr[th[text()='Serial Number']]]/following-sibling::tbody[1]/tr/td[2]")
	public WebElementFacade lbl_SerialName;
	
	@FindBy(xpath="//thead[tr[th[text()='Serial Number']]]/following-sibling::tbody[1]/tr/td[3]")
	public WebElementFacade lbl_VendorPartName;
	
	@FindBy(xpath="(//div[@class='container']/div[4]//tbody/tr[1]/td[2])[3]")
	public WebElementFacade lbl_DeviceName;
	
	@FindBy(xpath="//div[@class='device-detail-group'][7]/div[2]/span/label[1]")
	public WebElementFacade lbl_ServiceDeviceName;
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElementFacade btn_NDSaveButton;
	
	@FindBy(xpath="//a[text()='Task Details']")
	public WebElementFacade tag_taskDetails;
	
	@FindBy(xpath="//a[text()='Associated Circuits']")
	public WebElementFacade tag_circuitDetails;
	
	@FindBy(xpath="//a[text()='Associated Locations']")
	public WebElementFacade tag_LocationDetails;
	
	@FindBy(xpath="//a[text()='Device Details']")
	public WebElementFacade tag_deviceDetails;
	//end of new updates
	
	public static String allsearchXapath="header-label"; // Have to find alternate to findelements
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tab_services;
	}
	
	public void click_servicetab(String tab) throws Exception {
		//tab_ctag.click();
		Thread.sleep(5000);
		System.out.println("Executed the line"+tab);
		
		if(tab.equals("Services")){
			tab_services.click();
			Thread.sleep(35000);
		}
		else if(tab.equals("CTag")){
			tab_ctag.click();
			
		}
		else if(tab.equals("Orders")){
			tab_orders.click();
			
		}
		else if(tab.equals("Contacts")){
			 tab_contact.click();
			
		}
		else if(tab.equals("BAM Report")){
			tab_bamreport.click();
			
		}
		else if(tab.equals("Activations")){
			tab_Activations.click();
			
		}
		//newly added by MOHIT
		else if(tab.equals("Devices")){
			tab_Devices.click();
			
		}
		else if(tab.equals("Tasks")){
			tab_Tasks.click();
			
		}
		else if(tab.equals("Locations")){
			tab_Locations.click();
			
		}
		else if(tab.equals("Circuits")){
			tab_Circuits.click();
			
		}
		else if(tab.equals("Subscribers")){
			tab_Subscriber.click();
			
		}
		Thread.sleep(35000);
						
	}
	
	public void attribute_field() throws Exception {
		Thread.sleep(3000);
		//String txtfields=enduser.getDriver().findElements(By.xpath(".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[2]/table/thead/tr/th[@class='header-label']"));
		//System.out.println(lbl_attributes.getText());
		
	}
	
	//New updates-9/23
	public void validateDeviceDetail(String template){
		try {
			String sSubscriberType = lbl_SubscriberType.getText();
			String sSubscriberName = lbl_SubscriberName.getText();
			
			System.out.println("sSubscriberType ="+sSubscriberType);
			System.out.println("sSubscriberName ="+sSubscriberName);
			UserSteps enduser = new UserSteps();
			
			IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template).getContainer("SubscriberName");
			String fieldValue = datacontainer.getFieldValue("ddl_SubscriberType");
			String fieldValue1 = datacontainer.getFieldValue("tbx_Subscribername");
			
			System.out.println("fieldValue ="+fieldValue);
			System.out.println("fieldValue1 ="+fieldValue1);
			
			String FielsString[] = fieldValue.split(":");
			String actualSubscriberTypeFieldvalue = FielsString[1];
			System.out.println("actualSubscriberTypeFieldvalue= "+actualSubscriberTypeFieldvalue);
			
			
			String FielsString1[] = fieldValue1.split(":");
			String actualSubscriberNameFieldvalue = FielsString1[1];
			System.out.println("actualSubscriberNameFieldvalue= "+actualSubscriberNameFieldvalue);
			
			Boolean flag = sSubscriberType.equalsIgnoreCase(actualSubscriberTypeFieldvalue);
			Assert.assertTrue("Subscriber Type is not same", flag);
//			Assert.assertEquals("Subscriber Type is not same", sSubscriberType, actualSubscriberTypeFieldvalue);
			System.out.println("Subscriber Type is same");
			
			
			Boolean flag1 = sSubscriberName.equalsIgnoreCase(actualSubscriberNameFieldvalue);
			Assert.assertTrue("Subscriber Name is not same", flag1);
//			Assert.assertEquals("Subscriber Name is not same", sSubscriberName, actualSubscriberNameFieldvalue);
			System.out.println("Subscriber Name is same");
			
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void tabNetworkDetail(){
		tab_NetworkDetail.click();
	}
	
	public void click_EditDeviceDetailbtn(String button) throws InterruptedException {
		if(button.equals("Edit")){
		btn_EditDeviceDetailbtn.click();
		}
		else if(button.equals("Save")){
			btn_NDSaveButton.click();
			}
		Thread.sleep(5000);
	}
	
	public void saveNetworkingDetails() throws InterruptedException{
		btn_saveDeviceDetail.click();//Rework
		Thread.sleep(5000);
	}
	
	public void validateNetworkDetail(String template){
		try {
			String sSerialName = lbl_SerialName.getText();
			String actualSerialName = sSerialName.trim();
			System.out.println("actualSerialName= "+actualSerialName);
			
			String sVendorPartName = lbl_VendorPartName.getText();
			String actualVendorPartName = sVendorPartName.trim();
			System.out.println("actualVendorPartName= "+actualVendorPartName);
			
			System.out.println("sSerialName ="+sSerialName);
			System.out.println("sVendorPartName ="+sVendorPartName);
			UserSteps enduser = new UserSteps();
			
			IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template);
			String fieldValue = datacontainer.getFieldValue("tbx_serialNumber");
			String fieldValue1 = datacontainer.getFieldValue("tbx_vendorPartNumber");
			
			System.out.println("fieldValue ="+fieldValue);
			System.out.println("fieldValue1 ="+fieldValue1);
			
			String FielsString[] = fieldValue.split(":");
			String expectSerialNameFieldvalue = FielsString[1];
			System.out.println("actualSerialNameFieldvalue= "+expectSerialNameFieldvalue);
			
			
			String FielsString1[] = fieldValue1.split(":");
			String expectVendorPartNameFieldvalue = FielsString1[1];
			System.out.println("actualVendorPartNameFieldvalue= "+expectVendorPartNameFieldvalue);
			
			Assert.assertEquals("Serial Name is not same", expectSerialNameFieldvalue, actualSerialName);
			System.out.println("Serial Name is same");
			
			Assert.assertEquals("Vendor Part Name is not same", expectVendorPartNameFieldvalue, actualVendorPartName);
			System.out.println("Vendor Part Name is same");
			
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	
	public void validate_DeviceNameValue() throws InterruptedException {
		Thread.sleep(15000);
		String deviceName = lbl_DeviceName.getText();
		System.out.println(deviceName);
		String serviceDeviceName = lbl_ServiceDeviceName.getText();
		System.out.println(serviceDeviceName);
		Assert.assertEquals("device name is not same", serviceDeviceName, deviceName);
		System.out.println("device name is same");
}
	
	public void verfiy_relatedTabPage(String Tab) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(getDriver(), 180);
		if(Tab.equals("Tasks")){
			wait.until(ExpectedConditions.visibilityOf(tag_taskDetails));
			Assert.assertTrue(tag_taskDetails.isDisplayed());
		}
		
		else if(Tab.equals("Locations")){
			wait.until(ExpectedConditions.visibilityOf(tag_LocationDetails));
			System.out.println("location wait done");
			Assert.assertTrue(tag_LocationDetails.isDisplayed());
		}
		
		else if(Tab.equals("Circuits")){
			wait.until(ExpectedConditions.visibilityOf(tag_circuitDetails));
			System.out.println("Circuit wait done");
			Assert.assertTrue(tag_circuitDetails.isDisplayed());
		}
		
		else if(Tab.equals("Devices")){
			wait.until(ExpectedConditions.visibilityOf(tag_deviceDetails));
			System.out.println("Device wait done");
			Assert.assertTrue(tag_deviceDetails.isDisplayed());
		}
		
		Thread.sleep(3000);		
		
	}

	
}

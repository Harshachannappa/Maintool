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

public class OVCreateTopologyPage extends OmniVuePage {
	
//	OVCreateTopologyPage createtopologypage;
	
	@FindBy(xpath="//input[@value='Create']/following-sibling::input[@value='AddDevice']")
	public WebElementFacade btn_addDevice;
	
	
	
	@FindBy(xpath="//span[span[label[text()='Full Name']]]/following-sibling::span//input")
	public WebElementFacade tbx_fullName;
	
	
	@FindBy(xpath="//span[span[label[text()='Alias1']]]/following-sibling::span//input")
	public WebElementFacade tbx_alias1;
	
	
	@FindBy(id="NETWORK_ROLE")
	public WebElementFacade ddl_topologyRole;
	
	
	@FindBy(id="NETWORK_TECHNOLOGY")
	public WebElementFacade ddl_topologyTechType;
	
	@FindBy(id="NOTES")
	public WebElementFacade tbx_topologyNote;
	
	
	@FindBy(xpath="//input[@value='Create']")
	public WebElementFacade btn_create;
	
	@FindBy(xpath="//input[@value='Create']/following-sibling::input[@value='Reset']")
	public WebElementFacade btn_reset;
	
	@FindBy(xpath="//input[@value='Create']/following-sibling::input[@value='AddCircuit']")
	public WebElementFacade btn_addCircuit;
	
	
	@FindBy(xpath="//label[text()='Device CLLI %']/following-sibling::input")
	public WebElementFacade tbx_deviceCLLI;
	
	@FindBy(xpath="(//label[text()='Device Name %'])[1]/following-sibling::input")
	public WebElementFacade tbx_deviceName;
	
	@FindBy(xpath="(//label[text()='Device Type'])[2]/following-sibling::select")
	public WebElementFacade ddl_deviceType;
	
	@FindBy(xpath="//label[text()='Device SubType']/following-sibling::select")
	public WebElementFacade ddl_deviceSubType;
	
	
	
	
	@FindBy(id="locationAddress")
	public WebElementFacade tbx_locnAddress;
	
	@FindBy(xpath="//input[@value='Search Device']")
	public WebElementFacade btn_searchDevice;
	
	@FindBy(xpath="//input[@value='Search Device']/following-sibling::input[@value='Cancel']")
	public WebElementFacade btn_cancel;
	
	@FindBy(xpath="//input[@value='Search Device']/following-sibling::input[@value='Reset']")
	public WebElementFacade btn_resetInPlaceDevices;
	
	
	@FindBy(xpath="//table[@id='Device_Data_0']/tbody/tr[1]/td[1]/input")
	public WebElementFacade chk_deviceName;
	
	
	@FindBy(xpath="//input[@value='Associate Devcies']")
	public WebElementFacade btn_AssociateDevices;
	
	
	@FindBy(xpath=".//*[@ng-model='searchCircuitDetail.CIRCUIT_NAME']")
	public WebElementFacade tbx_circuitname;
	
	@FindBy(xpath=".//*[@ng-model='searchCircuitDetail.CIRCUIT_TYPE']")
	public WebElementFacade ddl_circuittype;
	
	//-----------------------------Topology Detail Page-----------------------------------------------------//
	
	@FindBy(xpath="(//span[span[label[text()='Name']]])[2]/following-sibling::span/div/label")
	public WebElementFacade lbl_Name;
	
	@FindBy(xpath="(//span[span[label[text()='Full Name']]])[2]/following-sibling::span/div/label")
	public WebElementFacade lbl_FullName;
	
	@FindBy(xpath="(//span[span[label[text()='Topology Role']]])[2]/following-sibling::span/div/label")
	public WebElementFacade lbl_TopologyRole;
	
	@FindBy(xpath="(//span[span[label[text()='Topology Technology Type']]])[2]/following-sibling::span/div/label")
	public WebElementFacade lbl_TopologyTechType;
	
	
	//----------------------------------------------------------------------------
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return btn_addDevice;
	}
	
	public void clickAdddevicecircuit(String button) throws InterruptedException{
		
		if(button.equals("AddDevice")){
		btn_addDevice.click();
		}
		else if(button.equals("AddCircuit")){
			btn_addCircuit.click();
			}
		Thread.sleep(6000);
	}
	
	public void Topologyaction(String action) throws InterruptedException{
		Thread.sleep(3000);
		btn_searchDevice.click();
		Thread.sleep(60000);
		
		chk_deviceName.click();
		btn_AssociateDevices.click();
		Thread.sleep(5000);
		btn_create.click();
		Thread.sleep(5000);
	}

	/*public void clickAddDevice() throws InterruptedException{
		btn_addDevice.click();
		Thread.sleep(5000);
	}*/ // 10/13/2016	Need to check if the it's impacting other region
	
	public void verifyAttributes() throws InterruptedException{
		
		Boolean deviceCLLI = tbx_deviceCLLI.isDisplayed();
		Assert.assertTrue(deviceCLLI);
		
		Boolean deviceName = tbx_deviceName.isDisplayed();
		Assert.assertTrue(deviceName);
		
		Boolean deviceType = ddl_deviceType.isPresent();
		Assert.assertTrue(deviceType);
		
		Boolean deviceSubType = ddl_deviceSubType.isPresent();
		Assert.assertTrue(deviceSubType);
		
		Boolean locnAddress = tbx_locnAddress.isDisplayed();
		Assert.assertTrue(locnAddress);

	}
	
	public void searchDevice(String devType , String devSubType) throws InterruptedException{
		
		ddl_deviceType.selectByVisibleText(devType);
		Thread.sleep(3000);
		
		ddl_deviceSubType.selectByVisibleText(devSubType);
		Thread.sleep(3000);
		
		btn_searchDevice.click();
		Thread.sleep(60000);
		
		chk_deviceName.click();
		btn_AssociateDevices.click();
		Thread.sleep(5000);
		
		btn_create.click();
		Thread.sleep(5000);
		
	}
	
/*	public void validateTopologyDetail(String template){
		try {
			
			
			UserSteps enduser = new UserSteps();
			
			
			String sName = lbl_Name.getText();
			String actualSerialName = sName.trim();
			System.out.println("actualSerialName= "+actualSerialName);
			
			String sFullName = lbl_FullName.getText();
			String actualFullName = sFullName.trim();
			System.out.println("actualFullName= "+actualFullName);
			
			String sTopologyRole = lbl_TopologyRole.getText();
			String actualTopologyRole = sTopologyRole.trim();
			System.out.println("actualTopologyRole= "+actualTopologyRole);
			
			
			String sTopologyTechType = lbl_TopologyTechType.getText();
			String actualTopologyTechType = sTopologyTechType.trim();
			System.out.println("actualTopologyTechType= "+actualTopologyTechType);
			
			IntDataContainer datacontainer = enduser.get_data_for_page(createtopologypage).getContainer(template);
			
			String fullNamefieldValue1 = datacontainer.getFieldValue("tbx_fullName");
			String topologyRolefieldValue = datacontainer.getFieldValue("ddl_topologyRole");
			String topologyTypefieldValue = datacontainer.getFieldValue("ddl_topologyTechType");
			
			System.out.println("fullNamefieldValue1 ="+fullNamefieldValue1);
			System.out.println("topologyRolefieldValue ="+topologyRolefieldValue);
			System.out.println("topologyTypefieldValue ="+topologyTypefieldValue);
			
			String FielsString[] = fullNamefieldValue1.split(":");
			String expectFullName = FielsString[1];
			System.out.println("expectFullName= "+expectFullName);
			
			
			String FielsString1[] = topologyRolefieldValue.split(":");
			String expecttopologyRolefieldValue = FielsString1[1];
			System.out.println("expecttopologyRolefieldValue= "+expecttopologyRolefieldValue);
			
			String FielsString2[] = topologyTypefieldValue.split(":");
			String expecttopologyTypefieldValue = FielsString2[1];
			System.out.println("expecttopologyTypefieldValue= "+expecttopologyTypefieldValue);
			
			
			Assert.assertEquals("Topology Full Name is not same", expectFullName, actualFullName);
//			System.out.println("Serial Name is same");
			
			Assert.assertEquals("Topology Role is not same", expecttopologyRolefieldValue, actualTopologyRole);
//			System.out.println("Vendor Part Name is same");
			
			Assert.assertEquals("Topology Technology Type is not same", expecttopologyTypefieldValue, actualTopologyTechType);
//			System.out.println("Vendor Part Name is same");
			
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}*/

}

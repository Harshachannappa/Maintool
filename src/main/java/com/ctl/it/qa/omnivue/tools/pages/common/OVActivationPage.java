package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVActivationPage extends OmniVuePage {
	
	OVCreateDevicePage devcreatepage;
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/a")
	public WebElementFacade tab_search;
	
	@FindBy(xpath=".//*[@id='createMenu-out-div']/a")
	public WebElementFacade tab_create;
	
	//Subcriber create launch form button
	@FindBy(xpath=".//button[text()='Launch Create Form' and @ng-click='create();']")
	public WebElementFacade btn_create_subcform;
	
	//Location Search
	
	@FindBy(xpath=".//*[text()='Street Name %']/following-sibling::input")
	public WebElementFacade tbx_searchstrtName;
	
	//Network create button--Sairam--Move to Create form
	@FindBy(xpath="//button[@ng-click='initiateNetworkCreation();']")
	public WebElementFacade btn_NB_create;
	
	@FindBy(xpath="//label[text()='Search Type']/following-sibling::select")
	public WebElementFacade ddl_searchType;
	
	@FindBy(xpath="//label[text()='Create Type']/following-sibling::select")
	public WebElementFacade ddl_createType;
	
	@FindBy(xpath="//label[text()='Inventory Type']/following-sibling::select")
	public WebElementFacade ddl_invntryType;
	
	
	
	@FindBy(xpath=".//label[text()='Port Type' and @class='control-label']/following-sibling::select")
	public WebElementFacade ddl_portType;
	
	@FindBy(xpath=".//*[@ng-show='showInventoryType']/select")
	public WebElementFacade ddl_CreateinvntryType;
	
	@FindBy(xpath="//div[@ng-show='showNetworkType']/select")
	public WebElementFacade ddl_CreateNetworkType;
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include/div/div/div[2]/div[3]/ng-include/div/ng-include/div/div[1]/input")
	public WebElementFacade tbx_deviceName;
	
	@FindBy(xpath=".//*[@id='servicesrchname1']")
	public WebElementFacade tbx_serviceName;
	
	//Order search Tabs
		
	@FindBy(xpath=".//*[@id='orderId']")
	public WebElementFacade tbx_orderId;
	
	@FindBy(xpath=".//*[@id='productType']")
	public WebElementFacade ddl_productType;
	
	@FindBy(id = "orderadvanceSearch")
	public WebElementFacade lnk_orderadvanceSearch;
	
	@FindBy(id = "customerName")
	public WebElementFacade tbx_customerName;
	
	@FindBy(id = "DTN")
	public WebElementFacade tbx_DTN;
	
	@FindBy(id = "ensembleOrderNumber")
	public WebElementFacade tbx_ensembleOrderNumber;
	
	@FindBy(xpath=".//*[@id='DTN ']")
	public WebElementFacade tbx_dtnorder;
	
	@FindBy(xpath=".//*[@ng-show='showForGPON']/label[text()='Order Type']/following-sibling::select")
	public WebElementFacade ddl_gponordertype;			//ONly for GPON order type
	
	//End of order search Tab
	
	//@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include/div/div/div[2]/div[3]/ng-include/div/ng-include/div/div[1]/input")
	//public WebElementFacade ddl_Service;
	
	// Search button--6/21/16
		@FindBy(xpath=".//*[@ng-click='searchInventory();']")
		public WebElementFacade btn_inventorysearch;
		
		@FindBy(xpath=".//*[@ng-click='searchOrders();']")
		public WebElementFacade btn_ordersearch;
		
		@FindBy(xpath=".//*[@ng-click='searchNetwork();']")
		public WebElementFacade btn_networksearch;
		
		@FindBy(xpath=".//*[@ng-click='searchTask();']")
		public WebElementFacade btn_tasksearch;
		
		//End of Search button
	
	// Start of Location - Search Tab details		

		@FindBy(xpath="//div[@ng-show='showLocationType']/select")
		public WebElementFacade ddl_Locationtype;
		
		@FindBy(xpath="//button[@ng-click='create();']")
		public WebElementFacade btn_Location_create;
		
	//End of Location Search Tab button
	
	@FindBy(xpath=".//*[@id='basicearch']/div[11]/ng-include/div/div[2]/div/div[2]/button")
	public WebElementFacade btn_create;
	
	@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")				//change the row to 0
	public WebElementFacade btn_view;
	
	@FindBy(xpath=".//*[@id='filtByRole']")
	public WebElementFacade rdbtn_role;
	
	@FindBy(xpath=".//*[@id='filtByTech']")
	public WebElementFacade rdbtn_tech;
	
	@FindBy(xpath=".//*[@id='filtByAll']")
	public WebElementFacade rdbtn_all;
	
	@FindBy(xpath="//label[text()='Technology']/following-sibling::select")
	public WebElementFacade ddl_techType;
	
	@FindBy(xpath="//label[text()='Device Type']/following-sibling::select")
	public WebElementFacade ddl_devType;
	
	@FindBy(xpath="//label[text()='Device Sub-Type']/following-sibling::select")
	public WebElementFacade ddl_devsubType;
	
	@FindBy(xpath=".//*[@id='address']")
	public WebElementFacade ddl_addNo;
	
	@FindBy(xpath=".//*[@id='streetName']")
	public WebElementFacade ddl_streetName;
	
	@FindBy(xpath=".//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield1;
	
	@FindBy(xpath=".//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield2;
	
	@FindBy(xpath=".//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield3;
	
	@FindBy(xpath=".//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield4;
	
	@FindBy(xpath=".//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield5;
	
	@FindBy(xpath=".//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield6;
		
	@FindBy(xpath=".//*[@id='start_0']")
	public WebElementFacade tbx_ctageditfield1;
	
	@FindBy(xpath=".//*[@id='end_0']")
	public WebElementFacade tbx_ctageditfield2;
	
	@FindBy(xpath=".//*[@id='invDevCreate']/div[2]/select")
	public WebElementFacade ddl_role;
	
	//Have to find way to place this create path different path
	//Location fields
	@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[1]/input")
	public WebElementFacade tbx_addNo;
	
	@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[2]/input")
	public WebElementFacade tbx_streetName;
	
	@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]/div[4]/div/input")
	public WebElementFacade tbx_buildingclli;
	
	//Topology fields
	
	@FindBy(id="port")
	public WebElementFacade ddl_TopologyType;
	
	@FindBy(xpath=".//*[@id='topologylookup']/div[3]/div[1]/input")
	public WebElementFacade tbx_Topologyname;
	
	//Wired Clli details
	@FindBy(xpath=".//*[@ng-controller='wireCentClliLookUpCtrl']/div[1]/div[2]/div[@id='cllilookup']/div[3]/div[1]/input")
	public WebElementFacade tbx_wiredaddNo;
	
	@FindBy(xpath=".//*[@ng-controller='wireCentClliLookUpCtrl']/div[1]/div[2]/div[@id='cllilookup']/div[3]/div[2]/input")
	public WebElementFacade tbx_wiredstreetName;
	
	@FindBy(xpath=".//*[@ng-controller='wireCentClliLookUpCtrl']/div[1]/div[2]/div[@id='cllilookup']/div[4]/div[4]/div/input")
	public WebElementFacade tbx_wiredbuildingclli;
	
	//Device form fields
	
	@FindBy(id="CLLI")
	public WebElementFacade tbx_DeviceCLLI;
	
	@FindBy(id="DEVICE_DESIGNATOR")
	public WebElementFacade tbx_Devicedesignator;
	
	@FindBy(xpath=".//*[@id='RELAYRACKID']")
	public WebElementFacade tbx_relayID;
	
	@FindBy(xpath=".//*[@id='AerialOrBuried']")
	public WebElementFacade ddl_Aerialrburied;
	
	@FindBy(id="isDiversed")
	public WebElementFacade ddl_IsDiversed;
	
	@FindBy(id="AFFILIATE_OWNER")
	public WebElementFacade ddl_affiliate_owner;
	
	@FindBy(id="AerialOrBuried")
	public WebElementFacade ddl_AerialOrBuried;
	
	@FindBy(id="INDOOR")
	public WebElementFacade ddl_Indooroutdoor;
	
	@FindBy(id="RONTAID")
	public WebElementFacade tbx_rid;
	
	@FindBy(id="InstallationIndicator")
	public WebElementFacade ddl_InstallationIndicator;
	
	@FindBy(id="FiberProvisioning")
	public WebElementFacade ddl_FiberProvisioning;
	
	@FindBy(id="NOSACertification")
	public WebElementFacade ddl_nosacer;
	
	@FindBy(id="1GbpsIndicator")
	public WebElementFacade ddl_gbpsind;
	
	// End of Device create form
	
	//Splitter details in Create form
	
	@FindBy(id="SplitterGroupNumber")
	public WebElementFacade tbx_Splitter_no;
	
	@FindBy(id="StartPortNumber")
	public WebElementFacade tbx_Splitter_port;
	
	// End of splitter update
	
	//Subscriber field data
	@FindBy(id="subscriberName")
	public WebElementFacade tbx_subcsname;
	
	@FindBy(id="accountIdentifier")
	public WebElementFacade ddl_subcaccidentifier;
	
	@FindBy(id="subscriberId")
	public WebElementFacade tbx_subscid;
	
	@FindBy(id="subscriberType")
	public WebElementFacade ddl_subctype;
	
	@FindBy(id="subscriberSubType")
	public WebElementFacade ddl_subcsubtype;
	
	//End of subscriber
	
	//Network Build for create Tab
	
	@FindBy(xpath="//input[@id='serviceCLLI']")
	public WebElementFacade tbx_SWCCLLI;
			
	@FindBy(xpath="//input[@id='engOrdId']")
	public WebElementFacade tbx_EngOrdId;
	
	//End of Network build
	
	
	// Subscriber Data field
	
	@FindBy(xpath="//*[not(contains(@style,'height: 0px;'))]/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[2]/div[1]/label[text()='Subscriber Name %']/following-sibling::input")
	//@FindBy(xpath=".//*[@style='height: 524px;']/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[2]/div[1]/label[text()='Subscriber Name %']/following-sibling::input")
	public WebElementFacade tbx_subscriber;
	
	@FindBy(xpath=".//*[not(contains(@style,'height: 0px;'))]/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[2]/div[2]/label[text()='Subscriber Type']/following-sibling::select")
	public WebElementFacade ddl_subtype;
	
	@FindBy(xpath=".//*[not(contains(@style,'height: 0px;'))]/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[2]/div[3]/label[text()='Subscriber ID %']/following-sibling::input")
	public WebElementFacade tbx_subid;
	
	// End of Subscriber Data field
	
	// Divya Logical Port Data
	
	@FindBy(xpath=".//*[@id='devicelookup']/div[4]/div[4]/input")
	public WebElementFacade tbx_devicelookup;
	
	@FindBy(id="logicalPortName")
	public WebElementFacade tbx_logportname;
	
	//Location Create form attributes--21/7/2016--US48525-TC53733
	
	@FindBy(xpath="//input[@id='addressNumber']") 
	public WebElementFacade tbx_addressNumber;
	
	@FindBy(xpath="//input[@id='street']") 
	public WebElementFacade tbx_street;
	
	@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='state')]") 
	public WebElementFacade ddl_state;
	
	@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='city')]") 
	public WebElementFacade ddl_city;
	
	@FindBy(xpath="//select[@id='NewConstructionIndicator']") 
	public WebElementFacade ddl_NewConstructionIndicator;
	
	@FindBy(xpath="//input[@id='sWCCLLI']") 
	public WebElementFacade tbx_sWCCLLI;

	//End of Location Create form
	
	//Start QOS Template
	
	@FindBy(id="templateName")
	public WebElementFacade tbx_Template_name;
	
	@FindBy(xpath=".//*[@id='p2']")
	public WebElementFacade tbx_p2;
	
	@FindBy(xpath=".//*[@id='p3']")
	public WebElementFacade tbx_p3;
	
	@FindBy(xpath=".//*[@id='p4']")
	public WebElementFacade tbx_p4;
	
	//End of QOS Template
	
	
	@FindBy(xpath=".//*[text()='Launch Create Form' and @ng-click='createDevice();']")						//Shiva
	public WebElementFacade btn_createdevice;
	

	@FindBy(xpath=".//*[text()='Launch Create Form' and @ng-click='create();']")
	public WebElementFacade btn_createservice;
	
	@FindBy(xpath="//select[@id='typeSelection' and @ng-model='resServiceType']")
	public WebElementFacade ddl_createServicetype;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tab_search;
	}
	
	public void click_actscreentab(String Acttab) {
		if(Acttab.startsWith("Create")){
			System.out.println(Acttab);
			tab_create.click();
		}
		else
		{
			tab_search.click();
		}
	}
	
	public void selectCreateType(String type, String subtype) {
	//Remove if it workds
		
	}
	
	public void click_searchbtn(String search_button) throws InterruptedException {
		switch(search_button){
		case "Orders":btn_ordersearch.click();						
						break;
		case "Inventory": btn_inventorysearch.click();						
						break;
		case "Network": btn_networksearch.click();
						break;
		case "Task": btn_tasksearch.click();
						break;		
		}
		Thread.sleep(15000);
		//btn_search.click();
	}
	
	public void click_viewbtn() {
		btn_view.click();		
	}
	
	public void clickcreatelaunchform() throws InterruptedException{
		btn_create_subcform.click();
		Thread.sleep(5000);
	}
	
	public boolean Validation_Usability(String serviceType,String serviceCapabilityType) throws InterruptedException {
		 int i=0,j=10;
		    while(i!=j) 
			{
		    	String actualServiceTypeXpath="//div[contains(@id,'row"+i+"serviceGrid_')]/div[3]/div";
		 		 
				 String actualServiceType=find(By.xpath(actualServiceTypeXpath)).getText();
				 if(actualServiceType.equals(serviceType))
				 {
					 String actualServiceCapabilityTypeXpath="//div[contains(@id,'row"+i+"serviceGrid_')]/div[4]/div";
					 
					 String actualServiceCapabilityType=find(By.xpath(actualServiceCapabilityTypeXpath)).getText();
					 if(actualServiceCapabilityType.equals(serviceCapabilityType))
					 {
						 System.out.println("Successfully validated");
						 i=j;
						 System.out.println(actualServiceType);
						 System.out.println(actualServiceCapabilityType);
						 
						 return true;
					 }
				 }
				 
				 i++;
			}
			return true;
				 
			}

	
	public void click_Technologytype(String tech){       //Selecting Radio Button in Create Form for Inventory Type
		switch(tech){
					case "Role": rdbtn_role.click();
									break;
					case "Technology": rdbtn_tech.click();
									break;
					case "All": rdbtn_all.click();
								break;
					}		
				}
	
	public void selecttech(String techType){   // Selecting the Technology in Create Form for Inventory Type
		ddl_techType.selectByVisibleText(techType);
		}
	
	public void device_select_create(String devtype,String devsubtype){		//Selecting device type while creating
		try {
			Thread.sleep(1000);
			ddl_devType.selectByVisibleText(devtype);
			Thread.sleep(1000);
			ddl_devsubType.selectByVisibleText(devsubtype);
			Thread.sleep(1000);
			btn_create.click();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void click_launch_create_form(String create_button) throws InterruptedException {							//Shiva
		switch(create_button){
		
		case "DeviceCreate":WebDriverWait wait = new WebDriverWait(getDriver(),30);
							wait.until(ExpectedConditions.elementToBeClickable(btn_createdevice));
							btn_createdevice.click();							
						break;
		case "ServiveCreate":WebDriverWait waita = new WebDriverWait(getDriver(),30);
							 waita.until(ExpectedConditions.elementToBeClickable(btn_createservice));
							 btn_createservice.click();							 
						break;
		}
		Thread.sleep(5000);
		//btn_search.click();
	}
	
	public void i_Select_for_the_drop_down_Service_Type_actvtnpage(String service_type) throws InterruptedException {											//shiva
		
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
		
		wait.until(ExpectedConditions.elementToBeClickable(ddl_createServicetype));
		
		//Thread.sleep(3000);
		
		ddl_createServicetype.selectByVisibleText(service_type);
		
	}
	
	
	//Network Build steps
	
	public void btn_Netwrkbuildcreate(){
		btn_NB_create.click();
	}
	
	public void locntype(String lcntype){		//Sairam code merge---21/7/2016--@US48525 @TC53733
		try {
			ddl_Locationtype.selectByVisibleText(lcntype);
			Thread.sleep(1000);
			btn_Location_create.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	public void sel_devicesubtype(String splitter_option) {											//shiva
		
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
		
		wait.until(ExpectedConditions.elementToBeClickable(ddl_devsubType));
		
		ddl_devsubType.selectByVisibleText(splitter_option);
		
	}

}

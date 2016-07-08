package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

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
	
	@FindBy(xpath=".//*[@id='basicearch']/div[11]/ng-include/div/div[2]/div/div[2]/button")
	public WebElementFacade btn_create;
	
	@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")
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
	
	// End of Device create form
	
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
		Thread.sleep(5000);
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
	
	//

	
	public void ddl_createinventType(String subtype){
		
	}
	
	public void click_Technologytype(String tech){
		switch(tech){
		case "Role": rdbtn_role.click();
						break;
		case "Technology": rdbtn_tech.click();
						break;
		case "All": rdbtn_all.click();
					break;
		}
		
	}
}

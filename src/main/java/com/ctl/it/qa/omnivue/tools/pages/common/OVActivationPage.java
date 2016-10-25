package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVActivationPage extends OmniVuePage {
	
	OVCreateDevicePage devcreatepage;
	OVLoginPage loginPage;
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/a")
	public WebElementFacade tab_search;
	
	@FindBy(xpath=".//*[@id='createMenu-out-div']/a")
	public WebElementFacade tab_create;
	
	@FindBy(id="state")
	public WebElementFacade ddl_createState;
	
	//Subcriber create launch form button
	@FindBy(xpath=".//button[text()='Launch Create Form' and @ng-click='create();']")
	public WebElementFacade btn_create_subcform;
	
	/**
	 *@author Dolly
	 *@description Subscriber type in subscriber look up page
	 */
	@FindBy(xpath="(.//*[@id='shelfType'])[2]")
	public WebElementFacade ddl_SubscriberType;
	
	
	/**
	 * @author Dolly
	 * @description Subscriber Name Webelement in Subscriber LookUp PAge
	 */
	@FindBy(xpath="(.//*[@id='addShelf']/div[3]/div[1]/input)[1]")
	public WebElementFacade tbx_Subscribername;
	
	//Created By Dolly
	//xpath="//div[label[text()='Serial Number']]/following-sibling::div[1]/div[2]/input"
	@FindBy(xpath="(//div[@class='row form-group-device'][2])[2]/div[2]/input")
	public WebElementFacade tbx_serialNumber;
	
	//Created By Dolly
	//div[label[text()='Serial Number']]/following-sibling::div[1]/div[3]/input
	@FindBy(xpath="(//div[@class='row form-group-device'][2])[2]/div[3]/input")
	public WebElementFacade tbx_vendorPartNumber;
	
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
	
	@FindBy(xpath="//label[text()='Device Type']/following-sibling::select")
	public WebElementFacade ddl_deviceType;
	
	@FindBy(id="servicetype")
	public WebElementFacade ddl_serviceType;
	
	@FindBy(id="circuitToCircuitType")
	public WebElementFacade ddl_circuitType;
	
	@FindBy(xpath="//label[text()='Topology Type' and @for='topologyType']/following-sibling::select")
	public WebElementFacade ddl_topolgyType;
	
	@FindBy(xpath="//label[text()='Technology Type']/following-sibling::select")
	public WebElementFacade ddl_topolgydeviceType;	


	@FindBy(xpath="//label[text()='Order Type']/following-sibling::select")
	public WebElementFacade ddl_orderTypeSearchTab;
	
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
	@FindBy(xpath="(//div[label[normalize-space(text()) = 'Device CLLI']])[2]/following-sibling::div[1]/div[1]/input")
	public WebElementFacade tbx_deviceCLLI;
	
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
	
	
	//New changes--9/23
	
	@FindBy(xpath="(//div[@class='row form-group-device'])[2]/div[2]/select")
	public WebElementFacade ddl_FunctionalStatus;
	
	@FindBy(xpath="//div[label[contains(text(),'Element Note')]]/following-sibling::div//input[@ng-model='deviceDetail.DESCRIPTION']")
	public WebElementFacade tbx_networkElementNode;
	
	@FindBy(xpath="//div[label[text()='Alias1']]/following-sibling::div//input[@ng-model='deviceDetail.ALIAS1']")
	public WebElementFacade tbx_Alias1;
	
	@FindBy(xpath="//div[label[text()='Alias2']]/following-sibling::div//input[@ng-model='deviceDetail.ALIAS2']")
	public WebElementFacade tbx_Alias2;
	
	@FindBy(xpath="(//div[@class='row form-group-device'])[10]/div[2]/input")
	public WebElementFacade tbx_vedorPartNum;
	
	@FindBy(xpath="(//div[@class='row form-group-device'])[10]/div[3]/input")
	public WebElementFacade tbx_partType;
	
	@FindBy(xpath="(//div[@class='row form-group-device'])[10]/div[4]/input")
	public WebElementFacade tbx_manufacturerPartNum;
	
	@FindBy(xpath="//div[label[text()='Management VLAN']]/following-sibling::div//input[@ng-model='deviceDetail.MGMTVLAN']")
	public WebElementFacade tbx_manufacturerVLAN;
	
	
	@FindBy(xpath="//thead[tr[th[text()='Provision Status']]]/following-sibling::tbody//td[2]")
	public WebElementFacade tag_functionalStatus;
	
	@FindBy(xpath="//thead[tr[th[text()='Provision Status']]]/following-sibling::tbody//td[3]")
	public WebElementFacade tag_networkElementNode;
	
	@FindBy(xpath="//thead[tr[th[text()='Device CLLI']]]/following-sibling::tbody[2]//td[1]")
	public WebElementFacade tag_alias1;
	
	@FindBy(xpath="//thead[tr[th[text()='Device CLLI']]]/following-sibling::tbody[2]//td[3]")
	public WebElementFacade tag_alias2;
	
	@FindBy(xpath="//thead[tr[th[text()='Device Type']]]/following-sibling::tbody[2]//td[2]")
	public WebElementFacade tag_vendorPortNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Device Type']]]/following-sibling::tbody[2]//td[3]")
	public WebElementFacade tag_partType;
	
	@FindBy(xpath="//thead[tr[th[text()='Device Type']]]/following-sibling::tbody[2]//td[4]")
	public WebElementFacade tag_ManufacpartNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Management VLAN']]]/following-sibling::tbody[1]//td[3]")
	public WebElementFacade tag_ManagementVLAN;
	
	@FindBy(xpath = "//div[label[text()='Chassis Serial Number']]/following-sibling::div//input[@ng-model='deviceDetail.CHASSISSERIALNUMBER']")
	public WebElementFacade tbx_NDchasisSerialNum;
	
	@FindBy(xpath = "//div[label[text()='Serial Number']]/following-sibling::div//input[@ng-model='deviceDetail.SERIALNUMBER']")
	public WebElementFacade tbx_NDserialNum;
	
	@FindBy(xpath = "//div[label[text()='Socket Number']]/following-sibling::div//input[@ng-model='deviceDetail.SOCKETNUMBER']")
	public WebElementFacade tbx_NDSocketNum;
	
	@FindBy(xpath = "//div[label[text()='Hardware Version']]/following-sibling::div//input[@ng-model='deviceDetail.HARDWAREVERSION']")
	public WebElementFacade tbx_NDHardwareVersion;
	
	@FindBy(xpath = "//div[label[text()='Software Version']]/following-sibling::div//input[@ng-model='deviceDetail.SOFTWAREVERSION']")
	public WebElementFacade tbx_NDSoftwareVersion;
	
	@FindBy(xpath = "//div[label[text()='Management IP Subnet Mask']]/following-sibling::div//input[@ng-model='deviceDetail.MGMT_IP_SUBNET_MASK']")
	public WebElementFacade tbx_NDIPSubnetMask;
	
	@FindBy(xpath = "//div[label[text()='Revision']]/following-sibling::div//input[@ng-model='deviceDetail.REVISION']")
	public WebElementFacade tbx_NDRevision;
	
	@FindBy(xpath = "//div[label[text()='Discontinue Date']]/following-sibling::div//input[@ng-model='deviceDetail.DISCONTINUEDATE']")
	public WebElementFacade tbx_DisContinueDate;
	
	@FindBy(xpath = "//div[label[text()='Discontinue Reason']]/following-sibling::div//input[@ng-model='deviceDetail.DISCONTINUEREASON']")
	public WebElementFacade tbx_DisContinueReason;
	
	@FindBy(xpath = "//div[label[text()='MAC Address']]/following-sibling::div//input[@ng-model='deviceDetail.MACADDRESS']")
	public WebElementFacade tbx_NDMacAddress;
	
	@FindBy(xpath = "//div[label[text()='SNMP Object ID']]/following-sibling::div//input[@ng-model='deviceDetail.SNMPOBJECTID']")
	public WebElementFacade tbx_NDSNMPObjectID;
	
	@FindBy(xpath = "//div[label[text()='SNMP Port Number']]/following-sibling::div//input[@ng-model='deviceDetail.SNMP_PORT_ID']")
	public WebElementFacade tbx_NDSNMPPortNum;
	
	@FindBy(xpath = "//div[label[text()='Monitoring Type']]/following-sibling::div//input[@ng-model='deviceDetail.MONITORING_TYPE']")
	public WebElementFacade tbx_NDMonitoringType;
	
	@FindBy(xpath = "//div[label[text()='Firmware Version']]/following-sibling::div//input[@ng-model='deviceDetail.FIRMWAREVERSION']")
	public WebElementFacade tbx_NDFirmWareVersion;
	
	@FindBy(xpath = "//div[label[text()='NMS Type']]/following-sibling::div//input[@ng-model='deviceDetail.NMSTYPE']")
	public WebElementFacade tbx_NDNMSType;
	
	@FindBy(xpath = "//div[label[text()='NMS Host Name']]/following-sibling::div//input[@ng-model='deviceDetail.NMSHOSTNAME']")
	public WebElementFacade tbx_NDNMSHostName;
	
	@FindBy(xpath = "//div[label[text()='NMS Description']]/following-sibling::div//input[@ng-model='deviceDetail.NMSDESCRIPTION']")
	public WebElementFacade tbx_NDNMSDescription;
	
	@FindBy(xpath = "//div[label[text()='Network Identifier']]/following-sibling::div//input[@ng-model='deviceDetail.NETWORKIDENTIFIER']")
	public WebElementFacade tbx_NDNetworkIdentifier;
	
	@FindBy(xpath = "//div[label[text()='Network Name']]/following-sibling::div//input[@ng-model='deviceDetail.NETWORKNAME']")
	public WebElementFacade tbx_NDNetworkName;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[1]//td[1]")
	public WebElementFacade tag_NDchasisSerialNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[1]//td[2]")
	public WebElementFacade tag_NDserialNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[2]//td[1]")
	public WebElementFacade tag_NDSocketNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[2]//td[2]")
	public WebElementFacade tag_NDHardwareVersion;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[2]//td[3]")
	public WebElementFacade tag_NDSoftwareVersion;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[2]//td[4]")
	public WebElementFacade tag_NDIPSubnetMask;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[3]//td[1]")
	public WebElementFacade tag_NDRevision;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[3]//td[2]")
	public WebElementFacade tag_DisContinueDate;

	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[3]//td[3]")
	public WebElementFacade tag_DisContinueReason;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[1]//td[1]")
	public WebElementFacade tag_NDMacAddress;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[1]//td[2]")
	public WebElementFacade tag_NDSNMPObjectID;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[1]//td[3]")
	public WebElementFacade tag_NDSNMPPortNum;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[1]//td[4]")
	public WebElementFacade tag_NDMonitoringType;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[2]//td[1]")
	public WebElementFacade tag_NDFirmWareVersion;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[2]//td[2]")
	public WebElementFacade tag_NDNMSType;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[2]//td[3]")
	public WebElementFacade tag_NDNMSHostName;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[2]//td[4]")
	public WebElementFacade tag_NDNMSDescription;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[3]//td[1]")
	public WebElementFacade tag_NDNetworkIdentifier;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[3]//td[2]")
	public WebElementFacade tag_NDNetworkName;;
	
	
	@FindBy(xpath="(//div[@id='cllilookup'])[1]/div[3]//input[@id='address']")
	public WebElementFacade tbx_wireCenteraddress;
	
	@FindBy(xpath="(//div[@id='cllilookup'])[1]/div[3]//input[@id='streetName']")
	public WebElementFacade tbx_wireCenterstreetName;
	
	@FindBy(xpath="(//div[@id='cllilookup'])[1]/div[4]//input[@id='buildingCLLI']")
	public WebElementFacade tbx_wireCenterbuildingCLLI;
	
	@FindBy(id="WIRECENTERCLLI")
	public WebElementFacade tbx_wireCenterCLLI;
	
	@FindBy(xpath="//label[text()='Device Role']/following-sibling::select")
	public WebElementFacade ddl_devRole;
	
	@FindBy(xpath="//label[normalize-space(text()) = 'Device Name']/following-sibling::input")
	public WebElementFacade tbx_devName;
	
	@FindBy(xpath="(//button[text()='Launch Create Form'])[2]")
	public WebElementFacade btn_launchCreate;
	
	// Link elements
	
		@FindBy(id = "linktype")
		public WebElementFacade ddl_Link_type ;
		
		@FindBy(xpath = "//input[@ng-model='searchParam.name']")
		public WebElementFacade tbx_link_name ;
		
		@FindBy( xpath = ".//*[@id='mainTab']/div/ul/li[2]/a")
		public WebElementFacade lbl_view_page ;
		
	//End of Link
		
	@FindBy( xpath = "//select[@ng-model='searchParam.circuitToCircuitType']")
	public WebElementFacade ddl_circuittype ;
		
	@FindBy(xpath = "//input[@ng-model='searchParam.streetName']")
	public WebElementFacade tbx_streetname;
	
	@FindBy( xpath = "//input[@ng-model='searchParam.serviceAreaName']")
	public WebElementFacade tbx_service_area_name ;
	
	
	//Aparna Sanity Declaration
	
	@FindBy(xpath="//label[text()='Service Type ']/following-sibling::select")
    public WebElementFacade ddl_Search_ServiceType;

	@FindBy(xpath = "//*[@ng-show='showLocationType']/select")
	public WebElementFacade ddl_LocationType;
	
	//click on create form to view the success message
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[1]/a/tab-heading")
	public WebElementFacade tab_Back_2_AddressRangeForm;
			
			
	// success message
	@FindBy(xpath=".//*[@id='0']/ng-include/div/div[1]")
	public WebElementFacade lbl_success_message_AddressRangeForm;
			
	
	@FindBy (id = "invAdvanceSearch")
	public WebElementFacade lnk_Advanced_Search ;
	
	
	@FindBy(xpath = ".//*[@ng-show='showCircuitType']/select")
	public WebElementFacade ddl_CircuitType_Createtab ;
	
	@FindBy(id = "functionalStatus")
	public WebElementFacade ddl_functional_status ;

	@FindBy(id = "AFFILIATE_OWNER")
	public WebElementFacade ddl_Affiliate_Owner ;

	@FindBy(id = "MONITORING_TYPE")
	public WebElementFacade tbx_monitoring_type ;
			
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
		System.out.println("Third stage");
		//btn_inventorysearch.click();
		if(search_button.equals("Inventory")){
			btn_inventorysearch.click();					
		
		}
		else if(search_button.equals("Orders")){
		btn_ordersearch.click();					
			
		}
		 
		else if(search_button.equals("Network")){
			btn_networksearch.click();						
		
		}
		else if(search_button.equals("Task")){
			btn_tasksearch.click();						
			
		}
		
		loginPage.getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(15000);
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
		if(tech.equals("Role")){
			rdbtn_role.click();
		}
		else if(tech.equals("Technology")){
			rdbtn_tech.click();
		}
		else if(tech.equals("All")){
			rdbtn_all.click();
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
		if(create_button.equals("DeviceCreate")){
			WebDriverWait wait = new WebDriverWait(getDriver(),30);
			wait.until(ExpectedConditions.elementToBeClickable(btn_createdevice));
			btn_createdevice.click();
		}
		else if(create_button.equals("ServiveCreate")){
			WebDriverWait waita = new WebDriverWait(getDriver(),30);
			 waita.until(ExpectedConditions.elementToBeClickable(btn_createservice));
			 btn_createservice.click();	
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
	
	
	public void createDeviceRole_Name(String devRole,String devName){		//Selecting device type while creating
		try {
			Thread.sleep(1000);
			ddl_devRole.selectByVisibleText(devRole);
			Thread.sleep(1000);
			tbx_devName.sendKeys(devName);
			Thread.sleep(1000);
			btn_launchCreate.click();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectTopologyType_State(String topologyType,String state){		//Selecting device type while creating
		try {
			Thread.sleep(1000);
			ddl_topologyTypeForSearch.selectByVisibleText(topologyType);
			Thread.sleep(1000);
			ddl_createState.selectByVisibleText(state);
			Thread.sleep(1000);
			btn_launchCreate.click();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	//---------------------------------------------------MOHIT---------------------------------------------------
	
	//TC55673
		@FindBy(id="topologyType")
		public WebElementFacade ddl_topologyTypeForSearch;
		
		@FindBy(id="topologyName")
		public WebElementFacade tbx_topologyNameForSearch;
		
		@FindBy(id="contactFirstName") 
		public WebElementFacade	 tbx_contactFirstName;
		
		@FindBy(id="contactType")
		public WebElementFacade ddl_contactType;
		
//TC54963 
//Edit Topology Details
		@FindBy(xpath="//span[span[label[text()='Name']]]/following-sibling::span//input")
		public WebElementFacade tbx_TDName;
		
		@FindBy(xpath="//span[span[label[text()='Full Name']]]/following-sibling::span//input")
		public WebElementFacade tbx_TDFullName;
		
		@FindBy(xpath="//span[span[label[text()='Alias1']]]/following-sibling::span//input")
		public WebElementFacade tbx_TDAlias1;
		
		@FindBy(xpath="//span[span[label[text()='Topology Role']]]/following-sibling::span//select")
		public WebElementFacade ddl_TDTopologyRole;
		
		@FindBy(xpath="//span[span[label[text()='Topology Technology Type']]]/following-sibling::span//select")
		public WebElementFacade ddl_TDTopologyTechnologyType;
		
		@FindBy(xpath="//span[span[label[text()='Topology Notes']]]/following-sibling::span//textarea")
		public WebElementFacade tbx_TDTopologyNotes;
	
//after click on save button
		@FindBy(xpath="//span[span[label[text()='Name']]]/following-sibling::span//label")
		public WebElementFacade tag_TDName;
		
		@FindBy(xpath="//span[span[label[text()='Full Name']]]/following-sibling::span//label")
		public WebElementFacade tag_TDFullName;
		
		@FindBy(xpath="//span[span[label[text()='Alias1']]]/following-sibling::span//label")
		public WebElementFacade tag_TDAlias1;
		
		@FindBy(xpath="//span[span[label[text()='Topology Role']]]/following-sibling::span//label")
		public WebElementFacade tag_TDTopologyRole;
		
		@FindBy(xpath="//span[span[label[text()='Topology Technology Type']]]/following-sibling::span//label")
		public WebElementFacade tag_TDTopologyTechnologyType;
		
		@FindBy(xpath="//span[span[label[text()='Topology Notes']]]/following-sibling::span//label")
		public WebElementFacade tag_TDTopologyNotes;
		

//TC65965
		@FindBy(xpath="//div[div[div[div[div[span[text()='Device CLLI']]]]]]/following-sibling::div[1]/div/div[1]/div[4]/div")
		public WebElementFacade tag_deviceCLLIl;
		
		@FindBy(xpath="//thead[tr[th[span[text()='Device Name']]]]/following-sibling::tbody/tr[1]//a")
		public WebElementFacade tag_deviceName;
		
		
//-------------------------------------------Ankit-----------------------------------------------
	//TC39243	
		@FindBy(xpath="(//select[@id='typeSelection'])[2]")
		public WebElementFacade ddl_servicetype; 

	//TC39225	
		@FindBy(xpath="//label[text()='City %']/..//input")
		public WebElementFacade tbx_city;
		
		@FindBy(xpath="//label[text()='State']/..//select")
		public WebElementFacade ddl_stateArizona; 

	//TC39223
		@FindBy(xpath="(//label[contains(text(),'Link Type')])[1]/..//select")
		public WebElementFacade ddl_LinkType; 
		@FindBy(xpath="//label[text()='Name %']/../input")
		public WebElementFacade tbx_searchname; 
		
	//TC55318
		@FindBy(xpath="//select[@id='servicetype']")
		public WebElementFacade  ddl_servicetypeForSearch;
				 

}

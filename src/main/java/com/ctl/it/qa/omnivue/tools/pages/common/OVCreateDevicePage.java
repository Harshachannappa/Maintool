package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

public class OVCreateDevicePage extends OmniVuePage {

	UserSteps enduser;
	OVLoginPage loginPage;
	
	@FindBy(id="isDiversed")
	public WebElementFacade ddl_IsDiversed;//2
		
	@FindBy(xpath="//input[@value='Shared']")
	public WebElementFacade rdbtn_Shared;//3
		
	@FindBy(xpath=".//*[text()='Wire Center CLLI']")
	public WebElementFacade lbl_wire_clli;
	
	@FindBy(xpath=".//*[@ng-click='openWireCenterCLLILookUp(field.name)']/img")
	public WebElementFacade btn_wireclli;
	
	@FindBy(xpath="//span[@ng-click='openTopologyLookUp(field.name)']")
	public WebElementFacade btn_Topologysearch;
	
	//@FindBy(xpath=".//*[@id='topologylookup']/div[3]/div[1]/input")
	//public WebElementFacade tbx_Topologyname;
	
	//@FindBy(id="port")
	//public WebElementFacade ddl_TopologyType;
	
	@FindBy(xpath="//div[@id='row0topologyGrid']/div[@class='jqx-grid-cell jqx-grid-cell-office jqx-item jqx-item-office']/div[@tabindex='0']/div[1]")
	public WebElementFacade ckb_TopologylookUp;
	
	@FindBy(xpath=".//*[@value='Look Up']")
	public WebElementFacade btn_TopologylookUp;
	
	@FindBy(xpath=".//*[@value='Associate Topology']")
	public WebElementFacade btn_AssociateTopology;
	
	////
	
	@FindBy(xpath = ".//*[@id='subscriberName']")
	public WebElementFacade tbx_SubscriberName;

	@FindBy(xpath = "//ul[@class='dropdown-menu ng-isolate-scope' and @aria-hidden='false']")
	public WebElementFacade ddl_subscriberSolr;
	
	
	
	//Another window  change id=0 to 1
	@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[1]/input")
	public WebElementFacade tbx_addNo;
	
	@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[2]/input")
	public WebElementFacade tbx_streetName;
	
	@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]/div[4]/div/input")
	public WebElementFacade tbx_buildingclli;
	
	@FindBy(xpath=".//*[@id='loclkp']/img")
	public WebElementFacade btn_locationLookup;
	
	@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[5]/button[text()='Look Up']")
	public WebElementFacade btn_lookUp;
	
	
	@FindBy(xpath=".//*[@ng-controller='wireCentClliLookUpCtrl']/div[1]/div[2]/div[@id='cllilookup']/div[5]/div[2]/button[text()='Look Up']")
	public WebElementFacade btn_wiredlookUp;
	
	//@FindBy(xpath=".//*[@id='row0jqxGrid0']/div/div[1]/a[@href='#']")
	@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/a")
	public WebElementFacade lnk_addlcn;
	
	@FindBy(xpath=".//input[@ng-keyup='setAdddressFields(entity[field.name])' and @ng-model='entity[field.name]']")
	public WebElementFacade tbx_locationclli;
	
	@FindBy(xpath=".//*[@id='RELAYRACKID']")
	public WebElementFacade tbx_relayID;	

	@FindBy(xpath=".//*[@id='isSharedOrDedicated' and  @value='Shared']")
	public WebElementFacade rad_shared;
		
	@FindBy(xpath=".//*[@value='Create']")
	public WebElementFacade btn_Create;
	
	@FindBy(xpath=".//*[@class='control-label ng-binding']")//Only selecting the first rom not all the elements
	//@FindBy(xpath=".//*[@class='ng-scope']/div[11]/div")
	public List<WebElementFacade> lbl_allXapath;
	
	//@FindBy(xpath=".//*[@id='1']/ng-include/div/div[11]/div/div[2]/div/div[3]/input[3]")  /// Check is it used
	@FindBy(xpath=".//*[@class='ng-pristine ng-untouched ng-valid' and @value='PASSIVE']")
	public WebElementFacade rbn_passive;
	
	@FindBy(xpath=".//*[@class='ng-pristine ng-untouched ng-valid' and @value='ETHERNET']")
	public WebElementFacade rbn_ethernet;
	
	@FindBy(xpath=".//*[@class='ng-pristine ng-untouched ng-valid' and @value='GPON']")
	public WebElementFacade rbn_Gpon;
	
	@FindBy(xpath="//*[@id='1']/ng-include/div/div[11]/div/div[2]/div/div[3]/input[4]")
	public WebElementFacade rbn_all;
	
	@FindBy(xpath="//label[text()='Location CLLI']")
	public WebElementFacade tbx_locationClli;
	
	@FindBy(xpath="//select[@id='NETWORKROLES']")
	public WebElementFacade ddl_Equipment_role;
	
	@FindBy(xpath="//div[@class='ng-binding alert alert-success']")
	public WebElementFacade success_alert;
	
	@FindBy(xpath = ".//*[@id='ConnectorType']")
	public WebElementFacade ddl_Connector_type;

	
	//Tab switch Check its already present
	//@FindBy(xpath="//*[contains(text(),'Create Device')]")
	@FindBy(xpath=".//*[@ng-click='onClickTab(tab)']")
	public WebElementFacade tab;
	
	//Network Build for create device--Sairam	
	
	//Start of Netwrok Device creation
	
	@FindBy(xpath="//span[text()=' OLT']")
	public WebElementFacade btn_gpon_OLT;		
	
	@FindBy(xpath="//span[text()=' Splitter']")
	public WebElementFacade btn_gpon_Splitter;
	
	@FindBy(xpath="//span[text()=' FDP']")
	public WebElementFacade btn_gpon_FDP;		
	
	@FindBy(xpath="//span[text()=' MST']")
	public WebElementFacade btn_gpon_MST;		
	
	@FindBy(xpath="//span[text()=' MDU']")
	public WebElementFacade btn_gpon_MDU;		
	
	@FindBy(xpath="//span[text()=' FDH']")
	public WebElementFacade btn_gpon_FDH;		
	
	@FindBy(xpath="//span[text()=' ONT']")
	public WebElementFacade btn_gpon_ONT;		
	
	//Working on only one Netwrok device.
	
	@FindBy(xpath=".//*[@id='tab:0']")
	public WebElementFacade btn_gpon_tab0;
	
	@FindBy(xpath=".//*[@value='+']")
	public WebElementFacade btn_gpon_expand;
	
	@FindBy(xpath=".//*[@ng-model='aDevice.chkValue']")
	public WebElementFacade rdbtn_gpon_select;
	
	@FindBy(xpath=".//label")
	public List<WebElementFacade> lbl_gpon_create_fields;
	//public static String lbl_gpon_create_fields="//*[@alt='OLT']/div";
	
	@FindBy(className="badge")
	public List<WebElementFacade> btn_gpon_device_tab;
			
	@FindBy(className="ng-binding")
	public WebElementFacade btn_gpon_device_select;
			
		
		@FindBy(xpath= "//h4[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center']/button[7]")
		public WebElementFacade btn_NB_device;
		
		@FindBy(xpath= "//button[@id='tab:0']")
		public WebElementFacade btn_NB_device_box;
		
		@FindBy(xpath="//input[@class='cmdButton']")
		public WebElementFacade btn_NB_Expend;
		
		@FindBy(xpath="//select[@id='deviceType']")
		public WebElementFacade ddl_NB_deviceType;//1
		
		@FindBy(xpath="//select[@id='deviceSubType']")
		public WebElementFacade ddl_NB_deviceSubType;//2
	
	//End of network build
		
	//Tab switch Check its already present
		@FindBy(xpath="//*[contains(text(),'Create Device')]")
		public WebElementFacade createtab;
		
	
	//Subscriber field
		
		@FindBy(xpath=".//ng-include[@class='ng-scope']/div/div[11]/div/div[2]/div/div[4]/div[9]/div/div/div[2]/div/div/div[1]/div[1]/span/img")
		public WebElementFacade btn_subsciber;
				
		@FindBy(xpath="//*[not(contains(@style,'height: 0px;'))]/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[3]/div[2]/input[@value='LookUp']")
		public WebElementFacade btn_sublookup;
				
		@FindBy(xpath=".//*[contains(@id,'subscriber_lookup_')]/tbody/tr[1]/td[1]/a/span")
		public WebElementFacade lnk_addsub;
				
	//End of Subscriber build
		@FindBy(id="ConnectorType")
		public WebElementFacade ddl_connectortype;  //Passive device create form details
		
		@FindBy(xpath=".//*[text()='DSL OVC']")
		public List<WebElementFacade> lbl_allServiceXapath;// Move to service page

		@FindBy(xpath=".//*[@ng-if='viewDevice']/div[@class='container']/div[4]/table/tbody[1]/tr/td[2]")
		public WebElementFacade lbl_devicename; 		//Getting the device name
		
	//Logical Port Creation---21/7/2016---Divya-OSIp Regression	
		@FindBy(xpath=".//*[@ng-switch-when='circuitBuildingClliLookup']/div[1]/span/img")
		public WebElementFacade btn_devicelookup;				//Divya Logical port paths --- 20-7-2016
		
		@FindBy(xpath=".//*[@id='devicelookup']/div[5]/div[2]/input[1]")
		public WebElementFacade btn_lookuplogicalfrm;
		
		@FindBy(xpath=".//*[@id='logicalPhysicalPort']/following-sibling::span/img")
		public WebElementFacade btn_lookuplogicalport;
		
		@FindBy(xpath=".//*[@ng-click='servicePhysicalPortlookUp()']")
		public WebElementFacade btn_lookuplogicalport_lookup;
			
		@FindBy(xpath=".//*[@id='servicePort_look_up']/tbody/tr[1]/td[2]/a")
		public WebElementFacade lbl_selctlogicalport_lookup;
		
		
	// End of Logical port
		
		//Location creation start
		@FindBy(xpath="//div[@ng-show='showLocationType']/select")
		public WebElementFacade ddl_Locationtype;
		
		@FindBy(xpath="//button[@ng-click='create();']")
		public WebElementFacade btn_Location_create;
		
		@FindBy(xpath="//input[@id='addRangeY']")
		public WebElementFacade rdbtn_addRange;
		
		@FindBy(xpath="//select[@id='locationRole']") 
		public WebElementFacade ddl_locationRole;
		
		@FindBy(xpath="//input[@id='addressNumber']") //2------------Check do we need its in activationpage
		public WebElementFacade tbx_addressNumber;
		
		@FindBy(xpath="//input[@id='street']") //3------------Check do we need its in activationpage
		public WebElementFacade tbx_street;
		
		@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='state')]") //4------------Check do we need its in activationpage
		public WebElementFacade ddl_state;
		
		@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='city')]") //5------------Check do we need its in activationpage
		public WebElementFacade ddl_city;
		
		@FindBy(xpath="//input[@id='zip']") //6----------Not a mandatory field so not used
		public WebElementFacade tbx_zip;
		
		@FindBy(xpath="//select[@id='NewConstructionIndicator']") //7
		public WebElementFacade ddl_NewConstructionIndicator;
		
		@FindBy(xpath="//input[@id='sWCCLLI']") //8
		public WebElementFacade tbx_sWCCLLI;
		
		@FindBy(xpath="//select[@id='addrangeVal']") //9
		public WebElementFacade ddl_addrangeVal;
		
		@FindBy(xpath="//input[@value='Find Address Range']") //10
		public WebElementFacade btn_FindAddressRange;
		
		@FindBy(xpath="//select[@id='ContractType']") //11
		public WebElementFacade ddl_CTL_ContractType;
		
		@FindBy(xpath="//div[@ng-if='isEditMode']/div[2]/div[7]/div/div[2]/ng-include/div/span[2]/span/select")
		public WebElementFacade ddl_Edit_contractType;
		
		@FindBy(xpath="//input[(@class='cmdButton')and(@value='Edit')]")
		public WebElementFacade btn_Edit;
		
		@FindBy(xpath="//input[(@class='cmdButton')and(@value='Save')]")
		public WebElementFacade btn_Save;
		
		@FindBy(xpath="//select[@id='RestrictedAddressCode']") //12
		public WebElementFacade ddl_RestrictedAddressCode;
		
			
		@FindBy(xpath="//*[contains(text(),'Create Individual Location')]") //14
		public WebElementFacade tab_Indivdual_Location;
		
		@FindBy(xpath="//*[contains(text(),'Create Individual Location')]/a")
		public WebElementFacade tab_Indivdual_Location_cancel;
		
		//@FindBy(xpath="//*[ends-with(text(),'STREET3')]")
		//public WebElementFacade tab_Indivdual_Location;
		
		@FindBy(xpath="//div[@class='ng-binding alert alert-success']") //15
		public WebElementFacade loc_success;
		
		@FindBy(xpath="//div[@ng-controller='viewEditLocationAWRCtrl']/div[@class='ng-binding alert alert-success']")
		public WebElementFacade loc_Edit_success;
		
		@FindBy(xpath="//*[@id='mainTab']/div/ul/li[Last()-1]/a/tab-heading")
		public WebElementFacade created_tab;
		
		

		//End of location creation
		
		// Editing the device page--9/23
		@FindBy(xpath="//label[@class='col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label']")//Only selecting the first rom not all the elements
		//@FindBy(xpath=".//*[@class='ng-scope']/div[11]/div")
		public List<WebElementFacade> lbl_allXapath1;
		
		@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[3]/ng-include/div[2]/div[1]/div[3]/div[2]/select")
		public WebElementFacade ddl_FunctionalStatus;
		
		@FindBy(xpath="(//span[@class='input-group-addon span-img']/img)[3]")
		public WebElementFacade btn_subscriberName;
		
		@FindBy(xpath=".//*[@id='addShelf']/div[5]/div[2]/input[@value='LookUp']")
		public WebElementFacade btn_subscriberLookUp;
		
		@FindBy(xpath=".//*[@id='subscriber_lookup_0']/tbody/tr/td[1]/a/span")
		public WebElementFacade lnk_subscriberName;
		
		@FindBy(xpath="(//div[@class='row form-group-device'])[16]/div[3]//img")
		public WebElementFacade btn_searchSubscriberName;
		
		@FindBy(xpath="(//input[@value='Save'])[1]")
		public WebElementFacade btn_saveDeviceDetail;
		
		//End of editing device page
		
	//New Changes -- 9/23
		
		@FindBy(id="streetType")
		public WebElementFacade ddl_wireCenterstreetType;
		
		@FindBy(id="city")
		public WebElementFacade tbx_wireCenterCity;

		@FindBy(id="state")
		public WebElementFacade tbx_wireCenterstate;
		
		@FindBy(id="zip")
		public WebElementFacade tbx_wireCenterzip;
		
		@FindBy(xpath="(//button[text()='Look Up'])[1]")
		public WebElementFacade btn_wireCenterLookUp;
		
		@FindBy(xpath="(//button[text()='Cancel'])[1]")
		public WebElementFacade btn_wireCenterCancel;
		
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String window_switch(){
		//String Parent_Window = driver.getWindowHandle();
		String Parent_Window = loginPage.getDriver().getWindowHandle();
		//btn_locationLookup.click();
		try {			
			Thread.sleep(5000);
			System.out.println("cliked on location lookup");
			Thread.sleep(5000);
			Set<String> allWindowHandles = getDriver().getWindowHandles();
			for (String allWindowHandles1 : getDriver().getWindowHandles()) {
				 
	        	System.out.println(allWindowHandles1);

	        	getDriver().switchTo().window(allWindowHandles1);
	        	System.out.println("switched..............");
	        	Thread.sleep(5000);
	        	
			} 
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return Parent_Window;	
	
		}

	
	
	
	public void switch_win(String parentwin){
			//btn_locationLookup.click();
			try {
				Thread.sleep(5000);
				//System.out.println("cliked on location lookup");
				//Thread.sleep(5000);
				//Set<String> allWindowHandles = getDriver().getWindowHandles();
				//for (String allWindowHandles1 : getDriver().getWindowHandles()) {
					 
		        //	System.out.println(allWindowHandles1);

		       // 	getDriver().switchTo().window(allWindowHandles1);
		        //	System.out.println("switched..............");
		        	//}
				//System.out.println(enduser.get_container_from_xml("OVCreateDevicePage","US43123-TC24409","Locationdata").getFieldValue("tbx_buildingclli").toString());
					//Thread.sleep(10000);
				//	enduser.locn_field();
					//System.out.println(enduser.get_data_for_page(actvtnpage).getContainer(ctag_range));
					//btn_lookUp.click();
					lnk_addlcn.click();  //Check whr is it clicking
					loginPage.getDriver().switchTo().window(parentwin);
					Thread.sleep(5000);
					//lnk_addlcn.click();
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//btn_lookUp.click();

	}
	
	
	public void form_field(){
		try {
			Thread.sleep(5000);
		//rdbtn_Shared.click();
		Thread.sleep(5000);
		//System.out.println(lbl_wire_clli.getText());
		btn_Create.click();
		Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void topology_fill(){
		try {
			Thread.sleep(5000);
			
		//btn_Topologysearch.click();
		// After search selecting 
		btn_TopologylookUp.click();
		Thread.sleep(5000);
		//window_switch();
		ckb_TopologylookUp.click();
		Thread.sleep(1000);
		btn_AssociateTopology.click();
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean validatingAtributesOfPassiveCreatePage(String devtype)
	{
		List<WebElementFacade> acutalList = lbl_allXapath;
		ArrayList<String> atributesOfPage=new ArrayList<String>();
		for(int j=0;j<acutalList.size();j++){
			atributesOfPage.add(j, acutalList.get(j).getText());
		}
		if(devtype.equals("PASSIVE")){
			for(int j=0;j<atributesOfPage.size();){
				System.out.println(atributesOfPage.get(j));
				if(atributesOfPage.get(j).equals("Is Diverse") || atributesOfPage.get(j).equals("Affiliate Owner*") || atributesOfPage.get(j).equals("Monitoring Type") || atributesOfPage.get(j).equals("Management VLAN") || atributesOfPage.get(j).equals("SNMP Port Number") || atributesOfPage.get(j).equals("SNMP Version") || atributesOfPage.get(j).equals("SNMP User") || atributesOfPage.get(j).equals("Management IP Subnet Mask") || atributesOfPage.get(j).equals("RO Community String")){
					return false;
				}
					j++;					
			}
		}
	
		else if(devtype.equals("ONT")){
			for(int j=0;j<atributesOfPage.size();){
				System.out.println(atributesOfPage.get(j));
				if(atributesOfPage.get(j).equals("Power Supply*") || atributesOfPage.get(j).equals("Fiber Distribution Node*") || atributesOfPage.get(j).equals("Fiber Distribution Node-Port*") || atributesOfPage.get(j).equals("Fiber Cable Name*") || atributesOfPage.get(j).equals("Fiber Strand ID*") ){
					return false;
				}
					j++;				
			}
		
		
	
		}
		
		/*
		String[] expectedList = {"Is Diverse","Affiliate Owner*","Monitoring Type","Management VLAN","SNMP Port Number","SNMP Version","SNMP User","Management IP Subnet Mask","RO Community String"};
		   
		List<WebElementFacade> acutalList = lbl_allXapath;

		for(int j=0;j<acutalList.size();j++){

		  // list.get(i).getText();
			acutalList.get(j);
		   System.out.println(acutalList.get(j).getText());
		   //
		   for (int i=0; i<expectedList.length; i++){
				 
			      if (!(acutalList.get(j).getText().equals(expectedList[i])))
			    		 // {
			        
			        //System.out.println(acutalList.get(j).getText()+"==="+expectedList[i]);
			    	  
			      //}
			      System.out.println(acutalList.get(j).getText()+"==="+expectedList[i]);
			    }		    
		  }
		  */
		System.out.println("these are not present in the list...");
		 // Assert.assertTrue(match);
		 // converting list to string[]		 
		return true;
	}
	
	public void IsRadioButtonPresent()
	 {
		 if( rbn_passive.isDisplayed() && rbn_all.isDisplayed()){
			System.out.println("passive and all radibutton is Visible");
			}else{
			System.out.println("Element is InVisible");
			}
	 }
	
	public boolean isRadioButtonSelected(String radioButton) throws Throwable 
		{
				boolean isRadioButtonSelected=false;
				System.out.println(radioButton+"..............");
				Thread.sleep(3000);
		
				if(radioButton.equals("PASSIVE")){
					if(rbn_passive.isSelected())
					{
						isRadioButtonSelected=true;
						System.out.println(radioButton+"is seclected");
					}					
				}
				else if(rbn_ethernet.isSelected())
				{
					isRadioButtonSelected=true;
					System.out.println(radioButton+"is seclected");
				}
				else if(radioButton.equals("GPON")){
					if(rbn_Gpon.isSelected())
					{
						isRadioButtonSelected=true;
						System.out.println(radioButton+"is seclected");
					}		
				}					
									
	return isRadioButtonSelected;
	}
	
	public boolean isLocationCLLIMandatory() throws Throwable {
			String LocationClli=tbx_locationClli.getText();
		  
            boolean isLocationCLLIMandatory=false;
		    if(LocationClli.contains ("*"))
		    	{
		    	isLocationCLLIMandatory=true;
		    	
              //String parts[] = LocationClli.split("[+]");
		        //LocationClli =  parts[0]; // i want to strip part after  +
		    	}
		    	System.out.println(isLocationCLLIMandatory);		    	
		    	return isLocationCLLIMandatory;
	    	}
	
	//To filter the unwanted text --- By Sairam
	public String create_device_successfull_msg() {
		String message=success_alert.getText();
		String msg = message.substring(1, message.length());
		 System.out.println(msg);
		return msg;
		}
	
	public void clickcreate(){
		btn_Create.click();
	}
	
	
	public void create_msg(){
		createtab.click();
		try {
			Thread.sleep(5000);
		
		WebElement ele = ddl_Equipment_role.selectByValue("0");
		String role =ele.getText();
		enduser.created_device_role_is(":"+role+" "+create_device_successfull_msg());
		System.out.println("*******************"+create_device_successfull_msg());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Validate_attributes_in_create_device_page_splitter() { // Shiva

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);

		wait.until(ExpectedConditions.elementToBeClickable(ddl_Connector_type));

		try {
			Thread.sleep(5000);

			// List<WebElement> attributeList =
			// driver.findElements(By.xpath(".//*[@id='0']/ng-include/div/div[11]"));
			List<WebElement> attributeList = getDriver()
					.findElements(By.xpath(".//*[@class='control-label ng-binding']"));
			ArrayList<String> atributesOfPage = new ArrayList<String>();

			for (int j = 0; j < attributeList.size(); j++) {

				atributesOfPage.add(j, attributeList.get(j).getText());

				// System.out.println("Step Two done");

			}

			System.out.println(atributesOfPage);

			ArrayList<String> testAttributes = new ArrayList<String>();

			testAttributes.add(0, "Device Type*");
			testAttributes.add(1, "Device Subtype*");
			testAttributes.add(2, "Device CLLI*");
			testAttributes.add(3, "Relay Rack Shelf*");
			testAttributes.add(4, "Shared Flag*");
			testAttributes.add(5, "Is Diverse*");
			testAttributes.add(6, "Location CLLI");
			testAttributes.add(7, "Location Address*");
			testAttributes.add(8, "Functional Status");
			testAttributes.add(9, "Affiliate Owner*");
			testAttributes.add(10, "Monitoring Type");
			testAttributes.add(11, "Network Identifier");
			testAttributes.add(12, "Management VLAN");
			testAttributes.add(13, "Device Template");
			testAttributes.add(14, "Management IP Subnet Mask");
			testAttributes.add(15, "SNMP Port Number");
			testAttributes.add(16, "RO Community String");
			testAttributes.add(17, "Network Element Note");
			testAttributes.add(18, "Equipment Roles*");
			testAttributes.add(19, "Splitter Number*");
			testAttributes.add(20, "Splitter Start Port #*");
			testAttributes.add(21, "Fiber in count");
			testAttributes.add(22, "Fiber out count");
			testAttributes.add(23, "Connector Type*");
			testAttributes.add(24, "Aerial or Buried*");
			testAttributes.add(25, "Topology*");

			for (String attributeb : testAttributes) {
				System.out.println(attributeb);
			}

			if (atributesOfPage.containsAll(testAttributes)) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void validate_apacheSolr_for_subscriber_in_create_device_service_createpage() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);

		wait.until(ExpectedConditions.elementToBeClickable(tbx_SubscriberName));

		tbx_SubscriberName.sendKeys("united");
		
		List<String> autoSuggest = ddl_subscriberSolr.getSelectOptions();
		
		System.out.println(autoSuggest);
		
		
		
		
		//wait.until(ExpectedConditions.elementToBeClickable(ddl_subscriberSolr));

		Thread.sleep(2000);
		if (ddl_subscriberSolr.isCurrentlyVisible()) {

			System.out.println("Apache SOLR feature is working fine");
		} else {
			System.out.println("Apache SOLR feature is NOT working");
		}
	}
	
	//GPON Netwrok Build steps below
	
	public void gpon_ntwdevice_select(String devicetype){
		try {	
			if(devicetype.equals("ONT")){
				btn_gpon_ONT.click();
				Thread.sleep(2000);	
			}			
			Thread.sleep(2000);
			btn_gpon_tab0.click();
			Thread.sleep(2000);
			rdbtn_gpon_select.click();
			btn_gpon_expand.click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	//-------------------------------------ANKIT-------------------------------------------------------
		@FindBy(xpath=".//*[@id='IS_DIVERSE']")
		public WebElementFacade ddl_IsDiversedForNPE;
	
	
}
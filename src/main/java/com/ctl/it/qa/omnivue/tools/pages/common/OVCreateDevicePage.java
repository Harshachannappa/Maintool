package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
	//Tab switch Check its already present
	@FindBy(xpath="//*[contains(text(),'Create Device')]")
	public WebElementFacade tab;
	
	//Network Build for create device--Sairam
		@FindBy(xpath="//input[@id='serviceCLLI']")
		public WebElementFacade tbx_SWCCLLI;
		
		@FindBy(xpath="//input[@id='engOrdId']")
		public WebElementFacade tbx_EngOrdId;
		
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
		
		@FindBy(xpath=".//*[text()='DSL OVC']")
		public List<WebElementFacade> lbl_allServiceXapath;// Move to service page

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
		switch(devtype){
		
		case "PASSIVE": for(int j=0;j<atributesOfPage.size();){
							System.out.println(atributesOfPage.get(j));
							switch(atributesOfPage.get(j)){
									case "Is Diverse": return false; 													
									case "Affiliate Owner*": return false; 
									case "Monitoring Type": return false;
									case "Management VLAN": return false; 
									case "SNMP Port Number": return false; 
									case "SNMP Version": return false; 
									case "SNMP User": return false; 
									case "Management IP Subnet Mask": return false; 
									case "RO Community String": return false; 
									default: j++;
							}		
						}
		case "ONT": for(int j=0;j<atributesOfPage.size();){
					System.out.println(atributesOfPage.get(j));
					switch(atributesOfPage.get(j)){
								case "Power Supply*": return false; 
								case "Fiber Distribution Node*": return false; 
								case "Fiber Distribution Node-Port*": return false; 
								case "Fiber Cable Name*": return false; 
								case "Fiber Strand ID*": return false; 														
								default: j++;
					}
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
			}}
	
	public boolean isRadioButtonSelected(String radioButton) throws Throwable 
		{
				boolean isRadioButtonSelected=false;
				System.out.println(radioButton+"..............");
				Thread.sleep(3000);
		
				switch(radioButton) {		
						case "PASSIVE": if(rbn_passive.isSelected())
										{
											isRadioButtonSelected=true;
											System.out.println(radioButton+"is seclected");
										}
										break;
							
						case "ETHERNET": if(rbn_Gpon.isSelected())
										{
											isRadioButtonSelected=true;
											System.out.println(radioButton+"is seclected");
										}
										break;
		
						case "GPON": if(rbn_ethernet.isSelected())
										{
											isRadioButtonSelected=true;
											System.out.println(radioButton+"is seclected");
										}
										break;
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
	
}
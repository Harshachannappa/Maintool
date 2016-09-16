package com.ctl.it.qa.omnivue.tools.steps.user;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.Alert;

import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedModServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVHomepage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLoginPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModServiceDetailsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVServiceDetailsPage;
import com.ctl.it.qa.omnivue.tools.steps.OmniVueSteps;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

@SuppressWarnings("serial")
public class UserSteps extends OmniVueSteps  {
	
	OVLoginPage loginPage;
	OVHomepage ovhomepage;
	OVActivationPage actvtnpage;
	OVAssociatedServicesPage assocservicespage;
	OVDeviceLookupPage devicelookuppage;
	OVSearchDevicePage searchdevicepage;
	OVServiceDetailsPage servicedetailspage;
	OVModServiceDetailsPage modservicedetailspage;
	OVModDeviceLookupPage moddevicelookuppage;
	OVAssociatedModServicesPage modassocservicespage;
	OVCreateDevicePage devcreatepage;
	//OVCreateLocationPage locpage;
	

	@Step
	public void logs_in_as_a(String userType) {
		shouldExist(loginPage);
		loginPage.EnterDetails(userType);
		loginPage.clickLogin();
		WaitForPageToLoad(100);
	}

	public void is_in_omnivue_login_page(String url) {
		loginPage.openAt(url);
		loginPage.maximize();
	}
	
	@Step
	public void should_be_on_homepage() {
		shouldExist(ovhomepage);
	}
	
	@Step
	public void should_be_on_loginpage() {
		shouldExist(loginPage);
	}
	
	@Step	
	public void click_activationTab() throws Exception {
		ovhomepage.click_activation_tab();
		shouldExist(actvtnpage);
	}
	
	@Step
	public void click_Tab(String Acttab) {
		actvtnpage.click_actscreentab(Acttab);		
	}
	
	@Step
	public void fill_fields(String field) throws InterruptedException {
			fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer(field));
			Thread.sleep(5000);
		}
	
	@Step
	public void Usability_validation(String serviceType,String serviceCapabilityType) throws InterruptedException {
		actvtnpage.Validation_Usability(serviceType,serviceCapabilityType);		
	}
	
	@Step
	public void Usability_validation(String serviceType,String serviceCapabilityType1,String serviceCapabilityType2) throws InterruptedException {
		servicedetailspage.Validation_Usabilites(serviceType,serviceCapabilityType1,serviceCapabilityType2);		
	}
	
	@Step
	public void validate_service_tab(){
		servicedetailspage.validate_servicetab();
	}
	
	@Step
	public void click_searchBtn(String search_button) throws InterruptedException {
		actvtnpage.click_searchbtn(search_button);
	}
	
	@Step
	public void select_viewBtn() {
		actvtnpage.click_viewbtn();
	}
	
	@Step
	public void click_createbutton(){
		//devcreatepage.tbx_locationClli.clear();
		devcreatepage.clickcreate();
	}
	
	
	@Step
	public void click_createlaunchformbutton(){
		try {
			actvtnpage.clickcreatelaunchform();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Step
	public void verify_deviceSearchPage() {
		shouldExist(searchdevicepage);
	}
	
	@Step
	public void click_servicesTab(String tab) throws Exception {
		System.out.println("entered the Second stage"+tab);
		searchdevicepage.click_servicetab(tab);
	}
	
	@Step
	public void update_serviceName() throws Exception {
		String val = assocservicespage.verify_before_servicename();
		System.out.println("value is:=" + val);
		assocservicespage.click_devicelookup();
		Thread.sleep(10000);
		devicelookuppage.click_devicelookupeditbtn();
		fillMandatoryFields(servicedetailspage);
		servicedetailspage.click_savebtn();	
		
	}
	
	@Step
	public void back_to_servicesTab() throws Exception {
		servicedetailspage.click_closetab();
		Thread.sleep(5000);
		servicedetailspage.click_devicetab();
	}
	
	@Step
	public void click_onRefresh() throws Exception {
		assocservicespage.click_refreshbtn();		
	}
	
	@Step
	public void fill_fields_from(String container1, String container2,String container3)
	{
		//System.out.println(get_container_from_xml("OVActivationPage","US31642-TC20884","Less than 1").getFieldValue("tbx_ctagtxtfield1").toString());
		//IntDataContainer container= get_data_for_page(actvtnpage).getContainer("US31642-TC20884").getContainer("Less than 1");
		//if(container!=null){
		//	System.out.println("not null");
	//	}else{
	//		System.out.println("null");
	//	}
		fillMandatoryFields(actvtnpage,get_container_from_xml(container1, container2,container3));
	}
	
	@Step
	public void fill_fields_lookup(String container1, String container2,String container3)
	{
		devcreatepage.tbx_addNo.sendKeys((get_container_from_xml(container1, container2,container3).getFieldValue("tbx_addNo").toString()));
		System.out.println(get_container_from_xml("OVCreateDevicePage","US43123-TC24409","Locationdata").getFieldValue("tbx_streetName").toString());
		//IntDataContainer container= get_data_for_page(actvtnpage).getContainer("US31642-TC20884").getContainer("Less than 1");
		//if(container!=null){
		//	System.out.println("not null");
	//	}else{
	//		System.out.println("null");
	//	}
		fillMandatoryFields(devcreatepage,get_container_from_xml(container1, container2,container3));
	}
	
	@Step
	public void is_having_updatedassociatedservicename() throws Exception {
		String updatedsrvcname = assocservicespage.verify_after_servicename();
		
		if(updatedsrvcname.equals("77/L1XX/785391//ADCD")) 
		{
			System.out.println("Service name didn't change;Before Updating servicing name is 77/L1XX/785391//CTKF " + ";After updating service name is "  + updatedsrvcname);
		}else 
		{
			System.out.println("Service name didn't change successfully");
		}
		
	}
	@Step
	public void	Revertback_name() {
		try {
			//String val = assocservicespage.verify_before_servicename();
			//System.out.println("value is:=" + val);
			modassocservicespage.click_devicelookup();
			Thread.sleep(10000);
			devicelookuppage.click_devicelookupeditbtn();
			fillMandatoryFields(modservicedetailspage);
			modservicedetailspage.click_savebtn();	
		
			/* checking
			assocservicespage.Revertbck_name();
			//devicelookuppage.click_devicelookupeditbtn();
			servicedetailspage.Revertname();
			servicedetailspage.click_savebtn();	 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Step
	public void	Revertback_name_Ctag(){
		try {
			Thread.sleep(5000);
			//System.out.println(servicedetailspage.btn_Ctagdelete.getText());
			while(servicedetailspage.btn_Ctagdelete.isVisible()){
				servicedetailspage.click_Ctagdelete();
				//switchToChildWindow();
				Robot rb =new Robot();
				//Alert alert = driver.switchTo().alert();
				 //alert.accept();
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);		
				 Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Step
	public void logoutfrom_application() throws Exception {
		servicedetailspage.click_logoutinsettings();
	}

	@Step
	public void ctag_update(String ctag_range) throws Exception {
		assocservicespage.btn_ctagadd.click();
		//String Alertmsg=assocservicespage.Alerttxt_txtbx.getText();
		Thread.sleep(20000);
		switch(ctag_range){
		
		case "Less than 1": fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							//enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							//System.out.println(enduser.get_data_for_page(actvtnpage).getContainer(ctag_range));
			
			//ctagtxt_field1.sendKeys("0");
							//ctagtxt_field2.sendKeys("1");
							Thread.sleep(1000);
							assocservicespage.btn_ctagsave.click();/// *****************  Change this condition to some place else***************
							if(assocservicespage.lbl_alertmsgctag.getText().contains("Start and End values should be in range from 1 to 4095."))
							{
								System.out.println("Enter valid text between range 1 to 4095");
								assocservicespage.btn_alertmsgctag.click();
							}
							//assocservicespage.btn_ctagcancel.click();
							Thread.sleep(10000);
							break;
							
		case "Alphanumeric values": fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									assocservicespage.btn_ctagsave.click();
									 Thread.sleep(1000);/// *****************  Change this condition to some place else***************
									 if(assocservicespage.lbl_alertmsgctag.getText().contains("Please enter a numeric value."))
										{
											System.out.println("Enter valid text between range 1 to 4095");
											Thread.sleep(10000);
											assocservicespage.btn_alertmsgctag.click();
										}
										//assocservicespage.btn_ctagcancel.click();
										Thread.sleep(10000);
										break;
										
		case "Greater than 4095": fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									assocservicespage.btn_ctagsave.click();/// *****************  Change this condition to some place else***************
									if(assocservicespage.lbl_alertmsgctag.getText().contains("Start and End values should be in range from 1 to 4095."))
									{
										System.out.println("Enter valid text between range 1 to 4095");
										Thread.sleep(10000);
										assocservicespage.btn_alertmsgctag.click();
									}
									//assocservicespage.btn_ctagcancel.click();
									Thread.sleep(10000);
									break;
							
		case "Single Range 1-4095": fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							assocservicespage.btn_ctagsave.click();
							Thread.sleep(10000);
							//Revertback_name_Ctag();
							//Thread.sleep(10000);
							break;	
							
		case "Multiple Range between 1-4095": 	fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(10000);
							assocservicespage.btn_ctagsave.click();
							Thread.sleep(5000);
							/*searchdevicepage.tab_orders.click();
							Thread.sleep(3000);
							searchdevicepage.tab_ctag.click();
							Thread.sleep(3000);*/
							assocservicespage.btn_ctagadd.click();
							Thread.sleep(10000);
							fill_fields_from("OVActivationPage","US31642-TC20884","Multiple Range between 1-4095 secound range");
							Thread.sleep(10000);
							assocservicespage.btn_ctagsave.click();
							Thread.sleep(5000);
							/*searchdevicepage.tab_orders.click();
							Thread.sleep(3000);
							searchdevicepage.tab_ctag.click();
							Thread.sleep(3000);*/
							assocservicespage.btn_ctagadd.click();
							Thread.sleep(10000);
							fill_fields_from("OVActivationPage","US31642-TC20884","Multiple Range between 1-4095 third range");
							Thread.sleep(1000);
							assocservicespage.btn_ctagsave.click();
							Thread.sleep(10000);
							break;
		
		case "Single Number Range": fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									assocservicespage.btn_ctagsave.click();
									Thread.sleep(10000);
									//Revertback_name_Ctag();
									//Thread.sleep(10000);
									break;
							
		case "Modify the Ctag Range":ctag_update("Multiple Range between 1-4095");
							assocservicespage.editctag_fld1.clear();
							assocservicespage.editctag_fld2.clear();
							Thread.sleep(1000);
							fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							assocservicespage.btn_ctagsave.click();
							Thread.sleep(10000);
							if(assocservicespage.lbl_succmsgctag.getText().contains("Pool range(s) created/updated successfully.")){
								System.out.println("Successfully validated modified Ctag");
								Thread.sleep(10000);
								assocservicespage.btn_succmsgctag.click();
							}												
							//Revertback_name_Ctag();
							//Thread.sleep(10000);
							break;
							
		case "Overlapping the CTag range": //ctag_update("Multiple Range between 1-4095");  //Check the values already present & modify
							assocservicespage.btn_ctagadd.click();
							Thread.sleep(5000);
							fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							assocservicespage.btn_ctagsave.click();
/*							if(assocservicespage.Alerttxt_txtbx.getText()=="Start value or End value is overlapping with an existing pool range.")
							{
								System.out.println("Overlapping CTag Range");
							}
							assocservicespage.btn_ctagcancel.click();*/
							if(assocservicespage.lbl_alertmsgctag.getText().contains(""))
							{
								System.out.println("Enter valid text between range 1 to 4095");
								Thread.sleep(10000);
								assocservicespage.btn_alertmsgctag.click();
							}
							//assocservicespage.btn_ctagcancel.click();
							Thread.sleep(10000);
							break;
						 //Thread.sleep(5000);
						// Revertback_name_Ctag();
							//Thread.sleep(10000);
							//break;
		}		
	}

	@Step
	public void selectType(String type,String subtype){
		//fillMandatoryFields(actvtnpage,get_container_from_xml(actvtnpage).getContainer(type));
		//actvtnpage.selectCreateType(type,subtype);
		//fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer(subtype));
		fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer(type));
		fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer(subtype));
	}
	
	@Step
	public void attri_field() {
		try {
			searchdevicepage.attribute_field();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Step
	public void locn_field(){
		System.out.println(get_container_from_xml("OVCreateDevicePage","US43123-TC24409","Locationdata").getFieldValue("tbx_streetName").toString());
		fill_fields_from("OVCreateDevicePage","US43123-TC24409","Locationdata");
		//fillMandatoryFields(devcreatepage);
		//fill_fields_from("OVCreateDevicePage","US43123-TC24409","Locationdata");
	}
	
	@Step
	public void fillmandatoryfield(String testdata){
		try
		{	
			Thread.sleep(5000);
			List<WebElementFacade> acutalList = devcreatepage.lbl_allXapath;
			ArrayList<String> atributesOfPage=new ArrayList<String>();
			System.out.println("Step one done");
			
			for(int j=0;j<acutalList.size();j++){
				
				atributesOfPage.add(j, acutalList.get(j).getText());
				
				System.out.println("Step Two done");
				//System.out.println(atributesOfPage.get(j));
			}
			
			System.out.println(atributesOfPage);
			//for(int i=0;i<acutalList.size();i++){
			for(int i=0;i<atributesOfPage.size();i++){
				//System.out.println(atributesOfPage.get(i));
			switch(atributesOfPage.get(i)) {
				
			case "Location Address*": devcreatepage.btn_locationLookup.click();
									String parentwin=devcreatepage.window_switch();
									fill_fields_from("OVCreateDevicePage",testdata,"Locationdata");
									devcreatepage.btn_lookUp.click();//Rework
									Thread.sleep(5000);
									devcreatepage.switch_win(parentwin);
									break;
									//End of Location clli
			
			case "Wire Center CLLI*": devcreatepage.btn_wireclli.click();
									Thread.sleep(5000);			
									fill_fields_from("OVCreateDevicePage",testdata,"Wireddata");
									devcreatepage.btn_wiredlookUp.click();//Rework
									Thread.sleep(5000);
									devcreatepage.lnk_addlcn.click();//Rework
									Thread.sleep(2000);
									break;
									//End of wire CLLI
									
			case "Topology*": devcreatepage.btn_Topologysearch.click();
								fill_fields_from("OVCreateDevicePage",testdata,"Topologydata");	
								devcreatepage.topology_fill();
								break;
			
			case "Shared Flag*": devcreatepage.rdbtn_Shared.click();
								Thread.sleep(3000);	
								break;	
								
			case "Connector Type*": devcreatepage.ddl_connectortype.selectByVisibleText("GPON");
									Thread.sleep(3000);	
									break;
									
			case "Splitter Number*": fill_fields_from("OVCreateDevicePage",testdata,"splitter");
									Thread.sleep(3000);	
									break;
			//case "Name*": //fill_fields_from("OVCreateDevicePage",testdata,"namefield");
								//actvtnpage.tbx_logportname.sendKeys("logical01");
									//Thread.sleep(2000);	
									//break;
			case "Device Name*": devcreatepage.btn_devicelookup.click();
								Thread.sleep(2000);	
								fill_fields_from("OVCreateDevicePage",testdata,"Deviceclli");
								//actvtnpage.tbx_devicelookup.sendKeys("TESTYYYYT01");
								Thread.sleep(3000);
								devcreatepage.btn_lookuplogicalfrm.click();
								Thread.sleep(10000);
								devcreatepage.btn_lookuplogicalport.click();
								Thread.sleep(2000);
								devcreatepage.btn_lookuplogicalport_lookup.click();
								Thread.sleep(2000);
								devcreatepage.lbl_selctlogicalport_lookup.click();	
								Thread.sleep(2000);
								break;
								
			case "Location Role*": if(devcreatepage.rdbtn_addRange.isVisible()){
										devcreatepage.rdbtn_addRange.click();
										Thread.sleep(3000);
										}
									for(int j=1;j<=3;j++){
										devcreatepage.ddl_locationRole.selectByIndex(j);
										Thread.sleep(3000);
										}
									System.out.println("Done with filling location role");
										break;
										
			case "New Construction Ind*": devcreatepage.ddl_NewConstructionIndicator.selectByVisibleText("Yes");
										break;
				default:break;
			}
			}
			fill_fields_from("OVCreateDevicePage",testdata,"Devicedata");	
			if(devcreatepage.btn_FindAddressRange.isVisible()){
				devcreatepage.btn_FindAddressRange.click();
				Thread.sleep(5000);
				devcreatepage.ddl_addrangeVal.selectByValue("1");
			}
		devcreatepage.form_field();
		Thread.sleep(5000);
		devcreatepage.tab.click(); //// Combine my scripts with Luna code-----------2
		//Thread.sleep(5000);
		//WebElement ele = devcreatepage.ddl_Equipment_role.selectByValue("0");	//Divya OSIP Reg this is not needed TC39192
		//String role =ele.getText();		//Divya OSIP Reg this is not needed TC39192
		//created_device_role_is(":"+role+" "+devcreatepage.create_device_successfull_msg());		//Divya OSIP Reg this is not needed TC39192
		created_device_role_is(devcreatepage.create_device_successfull_msg());
		System.out.println("*******************"+devcreatepage.create_device_successfull_msg());
		//enduser.locn_field();
		//devcreatepage.lnk_locn.click();	
		
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Step
	public void searched_device_is(String deviceName) throws InterruptedException
	{
		  System.out.println(searchdevicepage.tbx_deviceName.getText());
	}
	
	@Step//reading the successful msg after one device created
	public void created_device_role_is(String deviceName) throws InterruptedException
	{
		 
		 Thread.sleep(1000);
		 
		
	}
	
	@Step
	public void advancesearch() throws Exception{
		devicelookuppage.click_circuitparameter();
		fill_fields("DTN Data");
		devicelookuppage.btn_adsearchorder.click();
	}
	
	@Step
	public void order_attribute(){
		//System.out.println("order detaisl"+servicedetailspage.lbl_csof_id.getTextValue()+servicedetailspage.lbl_subscriber.getTextValue()+servicedetailspage.lbl_dtn.getTextValue()+servicedetailspage.lbl_EnsembleOrderNumber.getTextValue());
		System.out.println(get_data_for_page(actvtnpage).getContainer("lbl_csoderid"));//Adjust the Parameter
	}
	
	@Step
	public void validateaddcontactbutton(){
		servicedetailspage.validateaddcontactbutton();
	}
	
	@Step   //Selecting the create Type & subtype from Creaet Tab---Move to OVCreate page form
	public void selectFormType(String type,String subtype) {
		try {
			System.out.println(type);
			System.out.println(subtype);
			//System.out.println(tech);
			actvtnpage.ddl_createType.selectByVisibleText(type);
			Thread.sleep(1000);
			Thread.sleep(1000);
			switch(type){
					case "Inventory": 	actvtnpage.ddl_CreateinvntryType.selectByVisibleText(subtype);
										break;
					case "Network Build": 	actvtnpage.ddl_CreateNetworkType.selectByVisibleText(subtype);
											break;
				}	
			Thread.sleep(1000);
				} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Step
	public void validate_technology_and_device_type(String techType) throws Throwable /// Selecting the Technology in Create FOrm
	{
		System.out.println(techType);
		actvtnpage.selecttech(techType);
		//int Validation=1;
		//actvtnpage.ddl_techType.selectByVisibleText(techType);
		switch(techType){
				case "PASSIVE":  	//String[] actualDeviceType = {"","Fiber Distribution Hub","Fiber Distribution Panel","Fiber Multiport Service Terminal","Fiber Splitter"};
									WebElement dropdown = actvtnpage.ddl_devType;
									//ArrayList<String> ExpDeviceType = null;
									 Select select = new Select(dropdown);  
							
									 List<WebElement> options = select.getOptions();  
									 System.out.println(options.size());
									 
									 for(int j=0;j<=options.size()-1;j++)  {
										 
									/*	 for (int i=0; i<actualDeviceType.length; i++){
											 
										      if (options.get(j).getText().equals(actualDeviceType[i]))
										    		  {										       
										        System.out.println(options.get(j).getText()+"==="+actualDeviceType[i]);
										    	       }
										 
									 		} */
										 switch(options.get(j).getText()){
													 case "":
													 case "Fiber Distribution Hub":
													 case "Fiber Distribution Panel":
													 case "Fiber Multiport Service Terminal":
													 case "Fiber Splitter": System.out.println(options.get(j).getText()+"Is present"); break;
													 default: throw new Error(options.get(j).getText()+"Is not present");											 
										 		}
									 }
									 	
									 
				default:break;
		}
		
		/*
		String[] actualDeviceType = {"","Fiber Distribution Hub","Fiber Distribution Panel","Fiber Multiport Service Terminal","Fiber Splitter"};
		 WebElement dropdown = getDriver().findElement(By.xpath("//label[text()='Device Type']/following-sibling::select"));
		 ArrayList<String> ExpDeviceType = null;
		 Select select = new Select(dropdown);  

		 List<WebElement> options = select.getOptions();  
		 System.out.println(options.size());
		 
		 for(int j=0;j<=options.size()-1;j++)  
		 {  
			 //System.out.println("..............."+options.get(j).getText());
		  boolean match = false;
		  for (int i=0; i<actualDeviceType.length; i++){
			 
		      if (options.get(j).getText().equals(actualDeviceType[i]))
		    		  {
		        match = true;
		        System.out.println(options.get(j).getText()+"==="+actualDeviceType[i]);
		    	  
		      }
		    }
		   
		 // Assert.assertTrue(match);
		 }*/
		 System.out.println("successfully validated"); 
	}
	
	@Step				//Selecting Device category Type & its Sub-category for Inventory Create form
	public void device_select(String devtype,String devsubtype){
		actvtnpage.device_select_create(devtype,devsubtype);
	}
	
	@Step 			//Printing the Device name in the Output file
	public void device_create_msg(){
	try {	
			Thread.sleep(25000);
			created_device_role_is(devcreatepage.lbl_devicename.getText());
			//System.out.println("*******************"+devcreatepage.create_device_successfull_msg());
			//devcreatepage.create_msg();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Step		//Validating the Device page attributes in Create form page
	public void validate_attribute_search_page(String attributes){
		
		try {
			Thread.sleep(5000);		
		List<WebElement> attributeList = loginPage.getDriver().findElements(By.className(searchdevicepage.allsearchXapath));
			//List<WebElement> attributeList = searchdevicepage.lbl_allsearchXapath;
		ArrayList<String> atributesOfPage=new ArrayList<String>();
		//System.out.println("Step one done"+attributeList);
		int Validation=1;
		String output=null;
		for(int j=0;j<attributeList.size();j++){
			
			atributesOfPage.add(j, attributeList.get(j).getText());
			
			System.out.println("Step Two done");
			//System.out.println(atributesOfPage.get(j));
		} 
		
		System.out.println(atributesOfPage);
		
		//System.out.println(id);
	for(int i=0;i<attributeList.size();i++){
		System.out.println(atributesOfPage.get(i));
		
		switch(attributes){						
						case "Passive":	switch(atributesOfPage.get(i)) {		
														case "Is Diverse": 
														case "Affiliate Owner": 							
														case "Monitoring Type": 	
														case "Management VLAN":						
														case "SNMP Port Number":
														case "SNMP Version": 
														case "SNMP User": 
														case "Management IP Subnet Mask": 
														case "RO Community String": Validation=0; output=atributesOfPage.get(i); break;
														default:break;
														}	
						case "Location": switch(atributesOfPage.get(i)) {		
														case "Is Diverse": 
														case "Affiliate Owner": 							
														case "Monitoring Type": 	
														case "Management VLAN":						
														case "SNMP Port Number":
														case "SNMP Version": 
														case "SNMP User": 
														case "Management IP Subnet Mask": 
														case "RO Community String": Validation=0; output=atributesOfPage.get(i); break;
														default:break;
														}	
		
		}
	}
	if(Validation==1){
		System.out.println("Above Attributes are not present");
		return;
	} else throw new Error("Above Attributes is present"+output);//If it fails need to be displayed at the output screen
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Step  //Validating the Radio button in create device form page
	public void validate_radio_button_device_create_page(String radioButton) throws Throwable {
		  
		if (devcreatepage.isRadioButtonSelected(radioButton)) 
		     {
				System.out.println("pass");
			}
		     else throw new Error("not selected");
		}
	
	@Step  //Validating Bam Logs 
	public void bam_tab_validation(){
		servicedetailspage.bam_log_validation();
	}
	
	
	@Step
	public void selectport_createtab(String Porttype){
		actvtnpage.ddl_portType.selectByVisibleText(Porttype);
	}
	
	@Step
	public void locationtype(String locationtype){		//Sairam code merge---21/7/2016
		actvtnpage.locntype(locationtype);	
	}
	
	//18/8/2016--QOS Addition
	
	@Step
	public void Qos_screen_edit_and_save(String actionkey) throws InterruptedException{
		servicedetailspage.Qos_button_action(actionkey);
	}
	
	@Step
	public void Qos_template_validation(){
		servicedetailspage.Qos_template_validation();
	}
	
	@Step
	public void success_message_validation(String msg){
		servicedetailspage.success_message_validation(msg);
	}
	
	//19/8/16---Shivaprasad Updates
	
	@Step
	public void select_expandIcon(String Tab) throws InterruptedException {
		servicedetailspage.click_expandicon(Tab);
	}
	
	
	@Step
	public void Usability_validation() throws InterruptedException {
		servicedetailspage.validateActivationTab();	
	}
	
	@Step
	public void select_devicesubtype(String splitter_option) {
		actvtnpage.sel_devicesubtype(splitter_option);		
	}
	
	
	//End of search 
	
	//Create Part	Startes from Here
	
	@Step
	public void createroleform(String role,String devtype,String devsubtype){
		try {
		actvtnpage.ddl_role.selectByVisibleText(role);
		Thread.sleep(1000);
		actvtnpage.ddl_devType.selectByVisibleText(devtype);
		Thread.sleep(1000);
		actvtnpage.ddl_devsubType.selectByVisibleText(devsubtype);
		Thread.sleep(1000);
		actvtnpage.btn_create.click();
		Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Step
	public void createFormpage(String techtype,String devtype,String devsubtype){
		try {
			System.out.println(techtype);
			System.out.println(devtype);
			System.out.println(devsubtype);
		actvtnpage.ddl_techType.selectByVisibleText(techtype);
		Thread.sleep(1000);
		actvtnpage.ddl_devType.selectByVisibleText(devtype);
		Thread.sleep(1000);
		actvtnpage.ddl_devsubType.selectByVisibleText(devsubtype);
		Thread.sleep(1000);
		actvtnpage.btn_create.click();
		Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Step
	public void validate_Location_CLLI() throws Throwable {  //Validate Location clli field
		if (!(devcreatepage.isLocationCLLIMandatory())) {
			System.out.println("location clli.........."+devcreatepage.isLocationCLLIMandatory());
		}
		 else {
			 System.out.println("location clli..is mandatory for Ethernet........"+devcreatepage.isLocationCLLIMandatory());
		 }
	}
	
	@Step
	public void subcriber_equipment(String testdata) throws InterruptedException{
		devcreatepage.btn_subsciber.click();
		Thread.sleep(5000);
		fill_fields_from("OVCreateDevicePage",testdata,"Subscriberdata");
		devcreatepage.btn_sublookup.click();
		Thread.sleep(1000);
		//String parentwin=devcreatepage.window_switch();
		Thread.sleep(1000);
		devcreatepage.lnk_addsub.click();
		//devcreatepage.switch_win(parentwin);
		Thread.sleep(3000);
		devcreatepage.ddl_Equipment_role.selectByValue("0").click();
		
		
	}
	
	@Step
	public void gpon_ntwrk_deviceselecting(String gpondevice){
		devcreatepage.gpon_ntwdevice_select(gpondevice);
	}
	
	@Step
	public void gpon_fill_field(){
		try
		{
		/*List<WebElementFacade> acutalList = devcreatepage.lbl_gpon_create_fields; */
			Thread.sleep(2000);
		 List<WebElement> acutalList = loginPage.getDriver().findElements(By.xpath(".//label"));

		//List<WebElementFacade> acutalList = loginPage.getDriver().getTitle()
		//List<WebElement> acutalList = loginPage.getDriver().findElements(By.className(devcreatepage.lbl_gpon_create_fields));
		ArrayList<String> atributesOfPage=new ArrayList<String>();
		System.out.println("Step one done");
		for(int j=0;j<acutalList.size();j++){
			
			atributesOfPage.add(j, acutalList.get(j).getText());
			
			System.out.println("Step Two done");
			//System.out.println(atributesOfPage.get(j));
		}
		System.out.println(atributesOfPage);
		
		for(int i=0;i<acutalList.size();i++){
			//System.out.println(atributesOfPage.get(i));
		switch(atributesOfPage.get(i)) {
		/*
		case "": 
			
		case "": devcreatepage.btn_locationLookup.click();
								String parentwin=devcreatepage.window_switch();
								fill_fields_from("OVCreateDevicePage",testdata,"Locationdata");
								devcreatepage.btn_lookUp.click();//Rework
								Thread.sleep(5000);
								devcreatepage.switch_win(parentwin);
								break;
								//End of Location clli
		
		case "Wire Center CLLI": devcreatepage.btn_wireclli.click();
								Thread.sleep(5000);			
								fill_fields_from("OVCreateDevicePage",testdata,"Wireddata");
								devcreatepage.btn_wiredlookUp.click();//Rework
								Thread.sleep(5000);
								devcreatepage.lnk_addlcn.click();//Rework
								Thread.sleep(2000);
								break;
								//End of wire CLLI
								
		case "Topology": devcreatepage.btn_Topologysearch.click();
							fill_fields_from("OVCreateDevicePage",testdata,"Topologydata");	
							devcreatepage.topology_fill();
							break;
							
		case "":
			
		case "":
			
		case "":
		
		case "Shared Flag*": devcreatepage.rdbtn_Shared.click();
							Thread.sleep(3000);	
							break;			
		
			default:break;
		}
		}
		
		Device type
		Device SubTypes
		Infrastructure/Service
		Aerial/Buried
		Indoor or Outdoor
		
		fill_fields_from("OVCreateDevicePage",testdata,"Devicedata");		
	devcreatepage.form_field();
	Thread.sleep(5000);
	//devcreatepage.tab.click(); //// Combine my scripts with Luna code
	//Thread.sleep(5000);
	//WebElement ele = devcreatepage.ddl_Equipment_role.selectByValue("0");
	//String role =ele.getText();
	//created_device_role_is(":"+role+" "+devcreatepage.create_device_successfull_msg());
	//System.out.println("*******************"+devcreatepage.create_device_successfull_msg());
	//enduser.locn_field();
	//devcreatepage.lnk_locn.click();	
	*/
		}}
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	
	@Step
	public void click_launch_create_form(String create_button) throws InterruptedException {
		actvtnpage.click_launch_create_form(create_button);
	}
	
	@Step
	public void i_Select_for_the_drop_down_Service_Type_us(String service_type) throws InterruptedException {
		actvtnpage.i_Select_for_the_drop_down_Service_Type_actvtnpage(service_type);		
	}
	
	
	//Validation sections --26/8/2016
	
	@Step	
	public void Validate_fields_in_create_device_splitter_page() throws Exception {
		devcreatepage.Validate_attributes_in_create_device_page_splitter();
	}
	
	@Step
	public void validate_apacheSolr_for_subscriber_in_create_device_service_page_enduser() throws InterruptedException {
		// TODO Auto-generated method stub
		devcreatepage.validate_apacheSolr_for_subscriber_in_create_device_service_createpage();
	}
	
	
	
}

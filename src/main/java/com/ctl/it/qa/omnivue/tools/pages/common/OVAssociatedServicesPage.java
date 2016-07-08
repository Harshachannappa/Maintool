package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

public class OVAssociatedServicesPage extends OmniVuePage {
	
	UserSteps enduser;
	OVSearchDevicePage searchdevicepage;
	OVActivationPage actvtnpage;
	
	@FindBy(xpath="//div[text()='77/L1XX/785391//CTQF']/parent::div/preceding-sibling::div//input")
	public WebElementFacade lnk_deviceLookup;
	
	@FindBy(xpath=".//*[@id='right-content']/div/div[2]/div/div/div[2]/ul/li[2]/a/tab-heading/i[@title='Refresh']")
	public WebElementFacade btn_refresh;
	
	@FindBy(xpath="//div[text()='77/L1XX/785391//CTQF']")
	public WebElementFacade before_servicename;
	
	@FindBy(xpath="//div[text()='77/L1XX/785391//ABCD']")
	public WebElementFacade after_servicename;

	@FindBy(xpath="//div[text()='77/L1XX/785391//ABCD']/parent::div/preceding-sibling::div//input")
	public WebElementFacade lnk_newDeviceLookup ;
	
	@FindBy(xpath=".//input[@value='Edit']")
	public WebElementFacade btn_newServiceEdit;
	
	@FindBy(xpath=".//img[@title='Add CTag Pool SubRange']")
	public WebElementFacade btn_ctagadd;
	
	@FindBy(xpath=".//img[@title='Save CTag Pool Range']")
	public WebElementFacade btn_ctagsave;
	
	@FindBy(xpath=".//*[@id='right-content']/div/div[2]/div/div/div[2]/div/div/div/div/div[3]/div[3]/div[2]/div/label[3]/input[@value='Cancel']")
	public WebElementFacade btn_ctagcancel;
	
	@FindBy(xpath=".//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade ctagtxt_field1;
	
	@FindBy(xpath=".//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade ctagtxt_field2;
	
	@FindBy(xpath=".//*[@id='start_0']")
	public WebElementFacade editctag_fld1;
	
	@FindBy(xpath=".//*[@id='end_0']")
	public WebElementFacade editctag_fld2;
	
	@FindBy(xpath=".//*[@id='right-content']/div/div[2]/div/div/div[2]/div/div/div/div/div[3]/div[@ng-show='showCEVLANAlert']")
	public WebElementFacade Alerttxt_txtbx;
	
	@FindBy(xpath=".//*[@id='right-content']/div/div[2]/div/div/div[2]/div/div/div/div[@class='ng-scope']/div[2]/label")
	public WebElementFacade Ctag_index;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return lnk_deviceLookup;
	}
	
	public void click_devicelookup() throws Exception {
		lnk_deviceLookup.click();
		Thread.sleep(15000);		
	}
	
	public void click_Newdevicelookup() throws Exception {
		lnk_newDeviceLookup.click();
		Thread.sleep(15000);		
	}
	
	public void click_refreshbtn() throws Exception {
		btn_refresh.click();
		Thread.sleep(30000);
	}
	
	public String verify_after_servicename() {
		String servicenameval = after_servicename.getText();
		return servicenameval;
	}
	
	public String verify_before_servicename() throws Exception {
		Thread.sleep(10000);
		String servicenameval = before_servicename.getText();
		return servicenameval;
	}
	
	public void Revertbck_name() throws Exception{
		//Newservicelookup_link.click();
		Thread.sleep(20000);
		btn_newServiceEdit.click();
		Thread.sleep(5000);
	}
	
	/*
	public void ctag_write(String ctag_range)throws Exception{
		btn_ctagadd.click();
		Thread.sleep(20000);
		/*enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
		enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
		Thread.sleep(1000);
		btn_ctagsave.click();
		String Alertmsg=Alerttxt_txtbx.getText();
		if(Alertmsg=="Start and End values should be in range from 1 to 4095.")
		{
			System.out.println("Enter valid text between range 1 to 4095");
			btn_ctagcancel.click();
		}else if(Alertmsg=="Please enter a numeric value.") {
			System.out.println("Enter valid text between range 1 to 4095");
			btn_ctagcancel.click();
		}
		
		switch(ctag_range){
		
		case "Less than 1": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							//enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							//System.out.println(enduser.get_data_for_page(actvtnpage).getContainer(ctag_range));
			
			//ctagtxt_field1.sendKeys("0");
							//ctagtxt_field2.sendKeys("1");
							Thread.sleep(10000);
							btn_ctagsave.click();
							if(Alerttxt_txtbx.getText()=="Start and End values should be in range from 1 to 4095.")
							{
								System.out.println("Enter valid text between range 1 to 4095");
							}
							btn_ctagcancel.click();
							Thread.sleep(10000);
							break;
							
		case "Alphanumeric values": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									btn_ctagsave.click();
									 Thread.sleep(1000);
									 if(Alerttxt_txtbx.getText()=="Please enter a numeric value.")
										{
											System.out.println("Enter valid text between range 1 to 4095");
										}
									 btn_ctagcancel.click();
									 Thread.sleep(5000);
										break;
										
		case "Greater than 4095": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									btn_ctagsave.click();
									 if(Alerttxt_txtbx.getText()=="Start and End values should be in range from 1 to 4095.")
										{
											System.out.println("Enter valid text between range 1 to 4095");
										}
									 btn_ctagcancel.click();
									 Thread.sleep(5000);
										break;
							
		case "Single Range 1-4095": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							btn_ctagsave.click();
							Thread.sleep(10000);
							enduser.Revertback_name_Ctag();
							break;	
							
		case "Multiple Range between 1-4095": 	enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(10000);
							btn_ctagsave.click();
							searchdevicepage.tab_orders.click();
							Thread.sleep(3000);
							searchdevicepage.tab_ctag.click();
							Thread.sleep(3000);
							btn_ctagadd.click();
							Thread.sleep(10000);
							ctagtxt_field1.sendKeys("101");	// Work on it
							ctagtxt_field2.sendKeys("2045");// Work on it
							Thread.sleep(1000);
							btn_ctagsave.click();
							Thread.sleep(10000);
							break;
		
		case "Single Number Range": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									btn_ctagsave.click();
									Thread.sleep(10000);
									enduser.Revertback_name_Ctag();
									break;
							
		case "Modify the Ctag Range":ctag_write("Multiple Range between 1-4095");
							editctag_fld1.clear();
							editctag_fld2.clear();
							Thread.sleep(1000);
							enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							btn_ctagsave.click();
							Thread.sleep(10000);
							enduser.Revertback_name_Ctag();
							break;
							
		case "Overlapping the CTag range": ctag_write("Multiple Range between 1-4095");
							btn_ctagadd.click();
							Thread.sleep(5000);
							enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							btn_ctagsave.click();
							if(Alerttxt_txtbx.getText()=="Start value or End value is overlapping with an existing pool range.")
							{
								System.out.println("Overlapping CTag Range");
							}
						 btn_ctagcancel.click();
						 Thread.sleep(5000);
							break;
		} 	
	}*/

	

}

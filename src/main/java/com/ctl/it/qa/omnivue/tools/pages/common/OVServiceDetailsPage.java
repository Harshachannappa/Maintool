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

public class OVServiceDetailsPage extends OmniVuePage {

	OVCreateDevicePage devcreatepage;
	OVActivationPage actvtnpage;
	
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
		
	//Bam Table validation ----- 21/7/2016
	
	@FindBy(xpath="//*[@jqx-create='createBamlog']")
	public WebElementFacade lbl_bamtable;
	
	//End of BAM table
	
	
	
	@FindBy(xpath=".//*[text()='No Associated Services to display']")
	public WebElementFacade lbl_service_msg;
	
	
	//QOS Template validation screen 
	
	@FindBy(xpath=".//*[@id='view1']/div/div/div[2]/div")
	public WebElementFacade lbl_QOS_table;
	
	@FindBy(xpath=".//*[contains(@value,'Edit')]")
	public WebElementFacade btn_QOS_edit;
	
	@FindBy(xpath=".//*[contains(@value,'Save')]")
	public WebElementFacade btn_QOS_save;
	
	@FindBy(xpath=".//*[@ng-controller='viewQOSCtrl']/div/div[1]")
	public WebElementFacade lbl_QOS_msg;
	
	//New updates on QOS--9/23
	
	@FindBy(xpath="(//div[label[contains(text(),'QOS Template Name')]]/following-sibling::div/label[1])[1]")
	public WebElementFacade lbl_templateName;
	
	//End of QOS Template 
	
	@FindBy(xpath=".//*[@id='right-content']/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/input")
	public WebElementFacade btn_addSubscriber;
	
	// Action Tab + Expand button
	
	@FindBy(xpath=".//*[@id='active:1610803390']")
	public WebElementFacade btn_icon;
	
	@FindBy(xpath = ".//*[@id='data:1610803390']/td")
	public WebElementFacade lbl_TableActivationTab;
	
	//New update---9/23
	
	@FindBy(xpath="//h4[text()='Subscriber Lookup']")
	public WebElementFacade tag_SubscriberLookup;
	
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
		
		public void validate_servicetab(){
			if(lbl_service_msg.isVisible())
			{
				System.out.println("No service is present");
			}
			else throw new Error("Service is prsent");
			
		}
		
		public void bam_log_validation(){	//I am validating Bam table is present or not
			if(lbl_bamtable.isDisplayed()){
				System.out.println("BAM Table is present");
			}
			else throw new Error("BAM Table is not Present");
		}
		
		public void Qos_template_validation(){
			if(lbl_QOS_table.isDisplayed()){
				System.out.println("Qos Table is Visible");
			}
			else throw new Error("Qos Table is not Present");
			
		}
		
		public void Qos_button_action(String actionkey) throws InterruptedException{
			if(actionkey.equals("Edit")){
				btn_QOS_edit.click();
			}
			else if(actionkey.equals("Save")){
				btn_QOS_save.click();
			}
			else  if(actionkey.equals("Add Subscribers")){
				btn_addSubscriber.click();
			}
						
			Thread.sleep(5000);			
			
		}
		
		public void success_message_validation(String msg){
			if(lbl_QOS_msg.isDisplayed()){
				System.out.println(lbl_QOS_msg.getText());
				if(msg.equals("Success")){
					 if(lbl_QOS_msg.getText().equals("xQOS Template has been updated with the name Template1"));
						System.out.println("Success");
				}
				else if(msg.equals("Error")){
					if(lbl_QOS_msg.getText().equals("xIncorrect partition value"));
					System.out.println("Error message");
				}
				else throw new Error("Invalid message is displayed");		
				}				
		}
		
		public void click_expandicon(String tab) throws InterruptedException {
			if(tab.equals("Activations")){
				btn_icon.click();
			}
			
			Thread.sleep(3000);
				
		}
		
		public void validateActivationTab(){
			
			WebDriverWait wait = new WebDriverWait(getDriver(),10);
			
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("lbl_TableActivationTab")));
			
			wait.until(ExpectedConditions.visibilityOf(lbl_TableActivationTab));
			
			
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Activations']")));
			
			//String activationIdXpath = ".//*[@id='data:1610803390']/td";
			//String activationId = find(By.xpath(activationIdXpath)).getText();

			//boolean activationIdXpath = getDriver().findElement(By.xpath("lbl_TableActivationTab")).isDisplayed();
			
			boolean activationIdXpath = lbl_TableActivationTab.isDisplayed();
			
			if(activationIdXpath){
				
				System.out.println("Verification to activations tab is Passed");
				
			}else{
				
				System.out.println("Verification to activations tab is Failed");
			}
		}
		
		public void validateViewList(String template){
			try {
				String sTemplateName = lbl_templateName.getText();
				System.out.println("sTemplateName ="+sTemplateName);
				UserSteps enduser = new UserSteps();
				
				IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template);
				String fieldValue = datacontainer.getFieldValue("tbx_Template_name");
				String FielsString[] = fieldValue.split(":");
				String actualFieldvalue = FielsString[1];
				System.out.println(actualFieldvalue);
			if(sTemplateName.contains(actualFieldvalue)){
				Thread.sleep(3000);
				System.out.println("List view displayed when search is performed.");

			}
			else
			{
				System.out.println("List view not displayed when search is performed.");
			}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		public void validate_subscriberLookupPage() {
			String fieldValue = tag_SubscriberLookup.getText();
			Assert.assertEquals("Page is not present", "Subscriber Lookup", fieldValue);
			System.out.println("subscriber Lookup Page is present");
	}
		
	
		//--------------------------------------------ANKIT--------------------------------------------------
		//TC39223
		@FindBy(xpath="//div[contains(text(),'DSL OVC Service Attributes')]/..//div[7]//div[2]//label[2]")
		public WebElementFacade ver_supportedversion; 
		
		@FindBy(id="nameval")
		public WebElementFacade tbx_name;
		
		@FindBy(id="subsc")
		public WebElementFacade tbx_subsname;
		
		@FindBy(xpath="//select[@id='netpro']")
		public WebElementFacade ddl_networkprotocol;
		
		@FindBy(id="supIo")
		public WebElementFacade ddl_supportipversion;
		
		@FindBy(xpath="//input[@id='vlan']")
		public WebElementFacade tbx_vlan;
		
		
}

package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

/**
 * @author ab56363
 *
 */
public class OVCreateServicePage extends OmniVuePage {
	
	public OVCreateServicePage() {
		// TODO Auto-generated constructor stub
		initialize();
	}
  // LoginPage loginpage;
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return tbx_subscribername;
	}
	//subscriber section
	@FindBy(xpath="(//label[contains(text(),'Subscriber Name')])[1]")
	public WebElementFacade tbx_subscribername;//2
	//Hpc details section
	@FindBy(xpath="//label[text()='HPC Reference Code']")
	public WebElementFacade tbx_HPCReferenceCode;
	
	@FindBy(xpath="//label[contains(text(),'HPC Expiration Date')]")
	private WebElementFacade tbx_HPCExpirationDate;
	//ENNI Service Attributes SectionSPEC
	@FindBy(xpath="//label[text()='SPEC Code']")
	public WebElementFacade ddl_SPECCode;
	
	@FindBy(xpath="//label[text()='SPEC Code']/..//select")
	public WebElementFacade ddl_speccoded;
	
	
	
	
	
	
	@FindBy(xpath="(//label[text()='Monitoring Type'])[1]")
	public WebElementFacade tbx_MonitoringType;
		
	
	@FindBy(xpath="//label[text()='No of EVC/OVCs allowed']")
	public WebElementFacade tbx_NoofEVCOVCsallowed;
		
	
	@FindBy(xpath="//label[text()='LAG Indicator']")
	public WebElementFacade tbx_LAGIndicator;
		
	
	@FindBy(xpath="//label[text()='NC Code']")
	public WebElementFacade tbx_NCCode;
		
	@FindBy(xpath="//label[text()='NCI Code']")
	public WebElementFacade tbx_NCICode;
	
	@FindBy(xpath="//label[text()='Sec NCI Code']")
	public WebElementFacade tbx_SecNCICode;
	
	@FindBy(xpath="(//label[text()='Bandwidth'])[3]")
	public WebElementFacade tbx_Bandwidth;
	
	@FindBy(xpath="//label[text()='Rate Limit Type']")
	public WebElementFacade tbx_RateLimitType;
	
	@FindBy(xpath="//label[text()='Frame Size']")
	public WebElementFacade tbx_FrameSize;
	
	@FindBy(xpath="//label[text()='Frame Format']")
	public WebElementFacade tbx_Frameformat;
	
	@FindBy(xpath="//label[text()='Source System']")
	public WebElementFacade tbx_SourceSystem;
	
	@FindBy(xpath="//label[text()='TSP']")
	public WebElementFacade tbx_TSP;
	
	
	@FindBy(xpath="//label[text()='Functional Status']")
	public WebElementFacade tbx_FunctionalStatus;
	
	@FindBy(xpath="//label[text()='Requesting Affiliate']")
	public WebElementFacade tbx_RequestingAffiliate;
	
	@FindBy(xpath="//label[text()='Protection Protocol']")
	public WebElementFacade tbx_ProtectionProtocol;
	
	@FindBy(xpath="//label[text()='MCO']")
	public WebElementFacade tbx_MCO;
	
	//QOS AttributesAdd
	
	@FindBy(xpath="//label[text()='Add QOS Details']")
	public WebElementFacade tbx_AddQOSDetails;
	//Service Association Section
//	@FindBy(xpath="(//label[text()='Device Name'])[1]")
	@FindBy(xpath="(//div[@class='col-sm-6 col-xs-12 col-md-4 col-lg-3'])[27]/label")
	public WebElementFacade tbx_DeviceNameservuceassociation;
	
	@FindBy(xpath="(//input[@class='ng-pristine ng-untouched ng-valid'])[7]")
	public WebElementFacade cbx_createactivation;
	//probe uni service section
	
	@FindBy(xpath="(//label[text()='Device Name'])[2]")
	public WebElementFacade tbx_DeviceNameUniservice;
	
	
	@FindBy(xpath="//label[text()='Circuit Name']")
	public WebElementFacade tbx_CircuitName;
	
	//mef Enni Lag service section
	@FindBy(xpath="//label[text()='MEF ENNI LAG Service']")
	public WebElementFacade tbx_MEFENNILAGService;
	
	
	
	public void verifyfield() throws InterruptedException
	{
		  Select select=new Select(ddl_speccoded);
	        List<WebElement> option = select.getOptions();
	        
      for(int i=1;i<option.size()-1;i++){       {
        	String s1=option.get(i).getText();
        	
            	select.selectByIndex(i);
            	
            	
            	if(s1.equals("-Select-")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MSCSP")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertEquals(tbx_DeviceNameUniservice.getText().trim(), "Device Name");
                	Assert.assertEquals(tbx_CircuitName.getText().trim(), "Circuit Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MSCSMUX")){ 	
            		commonAttributeforverification();
            		Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
            		Assert.assertEquals(tbx_DeviceNameUniservice.getText().trim(), "Device Name");
            		Assert.assertEquals(tbx_CircuitName.getText().trim(), "Circuit Name");
            		Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MSCENNI")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertEquals(tbx_DeviceNameUniservice.getText().trim(), "Device Name");
                	Assert.assertEquals(tbx_CircuitName.getText().trim(), "Circuit Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("ERPSC")){
            		commonAttributeforverification();
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MCLAGAS")){
            		commonAttributeforverification();
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MOENNH")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MOENNS")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MOENN")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MOENNML")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());        			
            	} else if(s1.equals("BGPLU")){
            		commonAttributeforverification();            					
            	}
        
         option = select.getOptions();
       
        
      }
      }
	}
	 public void commonAttributeforverification() throws InterruptedException {
		
		
			 Assert.assertEquals(tbx_subscribername.getText().trim(), "Subscriber Name");
			 Assert.assertEquals(tbx_HPCReferenceCode.getText().trim(), "HPC Reference Code");
			Assert.assertEquals(tbx_HPCExpirationDate.getText().trim(), "HPC Expiration Date");
		
			 Assert.assertEquals(ddl_SPECCode.getText().trim(), "SPEC Code");
			 Assert.assertEquals(tbx_MonitoringType.getText().trim(), "Monitoring Type");

			  Assert.assertEquals(tbx_NoofEVCOVCsallowed.getText().trim(), "No of EVC/OVCs allowed");
			 Assert.assertEquals(tbx_LAGIndicator.getText().trim(), "LAG Indicator");
			 Assert.assertEquals(tbx_NCCode.getText().trim(), "NC Code");
			 Assert.assertEquals(tbx_NCICode.getText().trim(), "NCI Code");
			 Assert.assertEquals(tbx_SecNCICode.getText().trim(), "Sec NCI Code");
			 Assert.assertEquals(tbx_Bandwidth.getText().trim(), "Bandwidth");
			 Assert.assertEquals(tbx_RateLimitType.getText().trim(), "Rate Limit Type");
			 Assert.assertEquals(tbx_FrameSize.getText().trim(), "Frame Size");
			Assert.assertEquals(tbx_Frameformat.getText().trim(), "Frame Format");
			 Assert.assertEquals(tbx_SourceSystem.getText().trim(), "Source System");
			 Assert.assertEquals(tbx_TSP.getText().trim(), "TSP");
			 Assert.assertEquals(tbx_FunctionalStatus.getText().trim(), "Functional Status");
			 Assert.assertEquals(tbx_RequestingAffiliate.getText().trim(), "Requesting Affiliate");
			 Assert.assertEquals(tbx_ProtectionProtocol.getText().trim(), "Protection Protocol");
			 Assert.assertEquals(tbx_MCO.getText().trim(), "MCO");
		 Assert.assertEquals(tbx_AddQOSDetails.getText().trim(), "Add QOS Details");
     	
     }
     
	
		
	
	
	
	

}

package com.ctl.it.qa.omnivue.tools.pages.common;


import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateCircuitPage extends OmniVuePage {

	

		
		UserSteps enduser;
	
		
		
			@FindBy(id="NAME")
			public WebElementFacade tbx_name;
			
		
			@FindBy(id="ALIAS1")
			public WebElementFacade tbx_alias1;
		
		
			@FindBy(id="ALIAS2")
			public WebElementFacade tbx_alias2;
		
			@FindBy(id="CIRCUITBANDWIDTH")
			public WebElementFacade tbx_Bandwidth;
		
			@FindBy(id="DESCRIPTION")
			public WebElementFacade tbx_note;
		
		
			@FindBy(id ="CIRCUITSERVICETYPE")
			public WebElementFacade ddl_Circuit_Service_Type;
		
			@FindBy(id="TSP")
			public WebElementFacade tbx_TSP;
		
			@FindBy(id="TRANSPORTTYPE")
			public WebElementFacade ddl_Trasport_Type;

		
			@FindBy(id="BANDWIDTH")
			public WebElementFacade tbx_Provisioned_Bandwidth;
		
			@FindBy(id="CIRCUIT2FUNCTIONALSTATUS")
			public WebElementFacade ddl_Functional_Status;

	
			@FindBy(id="IS_DIVERSE")
			public WebElementFacade ddl_Is_Diverse;
		

		
			@FindBy(id = "CIRCUIT2PROVISIONSTATUS")
			public WebElementFacade tbx_Provision_status;
		
		
			@FindBy(xpath = "//input[@ng-click='createCircuit();']")
			public WebElementFacade btn_create_circuit;
		
			
			
					
		// Subscriber section
		
			@FindBy(xpath = ".//*[@id='addShelf']/div[3]/div[2]/input[1]")
			public WebElementFacade btn_lookup ;
					
					
					
		// common fields for device section
		
			@FindBy(xpath = "//input[@ng-model='invServiceDevLookUp.buildingClli']")
			public WebElementFacade tbx_Building_CLLi ;
		
		
			@FindBy(xpath = "//input[@ng-model='invServiceDevLookUp.deviceClli']")
			public WebElementFacade tbx_Device_CLLi ;
		
		
			@FindBy(xpath = "//input[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_device_lookup ;
		
		
		
			@FindBy(xpath = "//*[@ng-click='lookupGridSettings.selLukupValue(0)']")
			public WebElementFacade lnk_Device_name ;
		
		
		// Start Device section
		
		
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div[9]/div[6]/div/div/div/div[1]/span")
			public WebElementFacade btn_start_device_lookup ;
		
		
			@FindBy(id = "CIRCUIT2STARTLOCATION")
			public WebElementFacade tbx_start_device_name ;
		
		
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div[9]/div[6]/div/div[4]/div/p/span/input")
			public WebElementFacade btn_Sfetch_port ;
		
		
			@FindBy(id = "LOGICALSTARTPORTNAME")
			public WebElementFacade ddl_Start_port_name ;
		
		
		
		// End Device section
					
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div[9]/div[7]/div/div/div/div[1]/span")
			public WebElementFacade btn_end_device_lookup ;
		
		
		
			@FindBy(id = "CIRCUIT2ENDLOCATION")
			public WebElementFacade tbx_end_device_name ;
		
		
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div[9]/div[7]/div/div[4]/div/p/span/input")
			public WebElementFacade btn_Efetch_port ;
		
		
			@FindBy(id = "LOGICALENDPORTNAME")
			public WebElementFacade ddl_End_port_name ;
		
		
		
			
			
			
			
			@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
			public WebElementFacade tab_circuit360view ;
			
			
			@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[1]/a/tab-heading")
			public WebElementFacade tab_create_circuit_form ;
			
			
			@FindBy(xpath = "//*[@ng-show='showAlert' and @class='ng-binding alert alert-success']")
			public WebElementFacade lbl_message ;
			
			
			// End of Ethernet Bearer Circuit
			
			
			
			/*
			 * @FindBy(xpath = "//input[@ng-click='openDeleteCircuit()']")
			 * public WebElementFacade btn_Delete_circuit
			 */
			
			
			
			
			
			
			
		
		/*
		
		// Click on Create location button
		@FindBy(id=".//*[@id='0']/ng-include/div/div[3]/div/span/input[1]")
		public WebElementFacade btn_CreateButtonLocation;
		
		*/
		
		
		@Override
		public WebElementFacade getUniqueElementInPage() {
			// TODO Auto-generated method stub
			return null;
		}
		
	
		
		
		
		
		
		
	 
}

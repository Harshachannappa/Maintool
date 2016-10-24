package com.ctl.it.qa.omnivue.tools.pages.common;


import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateLocationPage extends OmniVuePage {

	

		
		UserSteps enduser;
	
		/*
		// Select the Create Type
		
		@FindBy(xpath="//label[text()='Create Type']/following-sibling::select")
		public WebElementFacade ddl_createType;
		
		
		// Select the Inventory Type
		
		@FindBy(xpath="//*[@ng-show='showInventoryType']/select")
		public WebElementFacade ddl_invntryTypeCreate ;
		
		
		// Select the Location Type
		
		@FindBy(xpath=".//*[@ng-show='showLocationType']/select")
		public WebElementFacade ddl_locationType;
		
		
		// Click on Launch Address Range Create Form
		@FindBy(xpath="html/body/form/div/div[1]/div/div[2]/div[2]/ng-include/div/div/div[3]/div/div[3]/button[1]")
		public WebElementFacade btn_LaunchCreateForm;
		
		*/
		
		@FindBy(xpath=".//*[@value='Create']")
		public WebElementFacade btn_CreateAddressRange;
		
		@FindBy(id="lowstreet")
		public WebElementFacade tbx_low_street;
		
		
		@FindBy(id="highstreet")
		public WebElementFacade tbx_high_street;
		
		
		@FindBy(id="street")
		public WebElementFacade tbx_street_name;
		
		@FindBy(id="streetType")
		public WebElementFacade ddl_streettype;
		
		@FindBy(id="indicator")
		public WebElementFacade ddl_indicator;
		
		
		@FindBy(xpath=".//*[@id='state' and @ng-show='field.display']")
		public WebElementFacade ddl_State;
		
		@FindBy(id="city")
		public WebElementFacade ddl_City;
		
		@FindBy(id="zip")
		public WebElementFacade tbx_zip;

		
		
		@FindBy(id="NewConstructionIndicator")
		public WebElementFacade ddl_NewConstructionIndicator;
		
		@FindBy(id="LegacyCompanyArea")
		public WebElementFacade ddl_LegacyCompanyArea;
		
		
		@FindBy(id="WireCenterRemarks")
		public WebElementFacade tbx_WireCenterRemarks;
		
		@FindBy(id="WireCenterCLLI")
		public WebElementFacade tbx_WireCenterCLLI;
		
		@FindBy(id="TaxCode")
		public WebElementFacade tbx_TaxCodeTAR;

		@FindBy(id="RateZone")
		public WebElementFacade tbx_RateZone;
		
		@FindBy(id="WireCenterID")
		public WebElementFacade tbx_WireCenterID;
		
		
		@FindBy(id="TTA")
		public WebElementFacade tbx_TTA;
		
		
		@FindBy(id="CALA")
		public WebElementFacade tbx_CALA;
		
		
		@FindBy(xpath = "//*[@class='ng-binding alert alert-danger']")
		public WebElementFacade lbl_error_message;
		
		
		
		
		// Add To Range section
		
		
					@FindBy(xpath=".//*[@id='addRangeY']")
					public WebElementFacade rdb_Add_To_Range;
		
					@FindBy(xpath=".//*[@id='addrangeVal']")
					public WebElementFacade ddl_Address_Range_value;	
			
					@FindBy(xpath = "//input[@ng-click='findAddressRange();']")
					public WebElementFacade btn_Find_Address_Range;
		
		
	
		// Primary Address section
		
		
					@FindBy(xpath=".//*[@id='addressNumber']")
					public WebElementFacade tbx_Address_Number;
					
					@FindBy(xpath="//*[@id='locationRole']")
					public WebElementFacade cmb_Location_Role;
					
					@FindBy(id = "locationFullName")
					public WebElementFacade tbx_LocationFullName ;
					
					@FindBy(id = "addressPrefix")
					public WebElementFacade tbx_AddressPrefix ;
					
					@FindBy(id = "addressSuffix")
					public WebElementFacade tbx_AddressSuffix ;
					
					@FindBy(id = "streetDirectionPrefix")
					public WebElementFacade ddl_StreetDirPrefix ;
					
					@FindBy(id = "street")
					public WebElementFacade tbx_StreetName ;
					
					@FindBy(id = "streetType")
					public WebElementFacade ddl_StreetType ;
					
					@FindBy(id = "streetDirectionSuffix")
					public WebElementFacade ddl_StreetDirSuffix ;
					
					@FindBy(xpath = "//*[@ng-model='entity[field.name]' and @id ='zip']")
					public WebElementFacade tbx_Zip_1 ;
					
					@FindBy(xpath = "//*[@ng-disabled='disableZip2Text']")
					public WebElementFacade tbx_Zip_2 ;
					
			
			// End of Primary Address section
	
	
			// Secondary Address section
					
					@FindBy(xpath=".//*[@id='LocationDesignator1']")
					public WebElementFacade ddl_location_Designator_1;	
					
					@FindBy(xpath=".//*[@id='LocationDesignator1Value']")
					public WebElementFacade tbx_location_Designator_1_value;
					
					@FindBy(xpath=".//*[@id='LocationDesignator2']")
					public WebElementFacade ddl_location_Designator_2;
					
					@FindBy(xpath=".//*[@id='LocationDesignator2Value']")
					public WebElementFacade tbx_location_Designator_2_value;
					
					@FindBy(xpath=".//*[@id='LocationDesignator3']")
					public WebElementFacade ddl_location_Designator_3;
					
					@FindBy(xpath=".//*[@id='LocationDesignator3Value']")
					public WebElementFacade tbx_location_Designator_3_value;
					
					@FindBy(xpath=".//*[@id='notes']")
					public WebElementFacade tbx_location_Remarks;
					
					@FindBy(xpath=".//*[@id='NewConstructionIndicator']")
					public WebElementFacade ddl_New_Construction_Ind;
					
					@FindBy(xpath=".//*[@id='buildingclli1']")
					public WebElementFacade tbx_Building_CLLi;
					
					@FindBy(xpath=".//*[@id='sWCCLLI']")
					public WebElementFacade tbx_SWC_CLLi;
					
					@FindBy(xpath=".//*[@id='latitude']")
					public WebElementFacade tbx_Latitude;
					
					@FindBy(xpath=".//*[@id='longitude']")
					public WebElementFacade tbx_Longitude;
					
					@FindBy(xpath=".//*[@id='hcoordinates']")
					public WebElementFacade tbx_HCoordinate;
					
					@FindBy(xpath=".//*[@id='vcoordinates']")
					public WebElementFacade tbx_VCoordinate;
					
					@FindBy(xpath=".//*[@id='lATA']")
					public WebElementFacade tbx_LATA;
					
					@FindBy(xpath=".//*[@id='nPA']")
					public WebElementFacade tbx_NPa;
					
					@FindBy(xpath=".//*[@id='nXX']")
					public WebElementFacade tbx_NXX;
					
	
			// End of Secondary Location
	
					
					
			//	Create button Individual Location
					
					@FindBy(xpath=".//*[@value='Create']")
					public WebElementFacade btn_Individual_Location;
					

					
			// Individual Location Create form and 360 view
					
					
					@FindBy(xpath=".//*[@value='Add Next Address']")
					public WebElementFacade btn_Add_Next_Address;		
					
					@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[7]/div[2]/div[8]/div/div[3]/ng-include/div/label")
					public WebElementFacade lbl_Address_Range_ID;	
					
					
					@FindBy(xpath=".//*[@ng-click='onClickTab(tab)']")
					public WebElementFacade tab_Individual_location_Create_form;
					
					@FindBy(xpath=".//*[@id='0']/ng-include/div/div[1]")
					public WebElementFacade lbl_Individual_location_Create_form;	
					
					
					
					
		// Error message on SWC CLLi Field
					
		@FindBy(xpath=".//div[@ng-show='showAlert' and  @class='ng-binding alert alert-danger']")
		public WebElementFacade lbl_SWC_CLLI_Error_messge;	
					
	
		
		/*
		
		// Click on Create location button
		@FindBy(id=".//*[@id='0']/ng-include/div/div[3]/div/span/input[1]")
		public WebElementFacade btn_CreateButtonLocation;
		
		*/
		@FindBy(id = "addrange")
		public WebElementFacade btn_AddressRange_radio_button ;
		
		@Override
		public WebElementFacade getUniqueElementInPage() {
			// TODO Auto-generated method stub
			return null;
		}
		
	
		public void location_role_selection(String LRole,String LRoleType){
			if ("Single".equals(LRole)){
				
				if ("Central Office".equals(LRoleType)) {
				
				cmb_Location_Role.selectByVisibleText("Central Office") ;
				
				}
				
				else if ("Equipment Site".equals(LRoleType)){
					
					cmb_Location_Role.selectByVisibleText("Equipment Site") ;
				}
				
				else if ("Customer Site".equals(LRoleType)) {
					
					cmb_Location_Role.selectByVisibleText("Customer Site") ;
				}
				
				else if ("Building  site".equals(LRoleType)) {
					
					cmb_Location_Role.selectByVisibleText("Building  site") ;
				}
				
				else {
					
					cmb_Location_Role.selectByVisibleText("Remote Site") ;
				}
				
				
				
			}
			
			else {
			
				cmb_Location_Role.selectByVisibleText("Equipment Site") ;
				cmb_Location_Role.selectByVisibleText("Customer Site") ;
				
			}
		}
		
		
		
		
		
	 
}

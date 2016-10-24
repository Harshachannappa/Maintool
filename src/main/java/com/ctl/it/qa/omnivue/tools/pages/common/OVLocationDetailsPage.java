package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVLocationDetailsPage extends OmniVuePage {

	@FindBy(xpath="//a[text()='Subscribers']")
	public WebElementFacade btn_subscriber;
	
@FindBy(xpath="(//input[@value='Add Subscriber Association'])[2]")	
public WebElementFacade btn_AddSubScriber;
	

@FindBy(xpath = "//input[@ng-model='invLocSrch.rlowStreet']")
public WebElementFacade tbx_InvLocSrch_LowStreet;

@FindBy(xpath = "//input[@ng-model='invLocSrch.rhighStreet']")
public WebElementFacade tbx_InvLocSrch_HighStreet;

@FindBy(xpath = "//input[@ng-model='invLocSrch.rstreetName']")
public WebElementFacade tbx_InvLocSrch_StreetName;

@FindBy(xpath = "//input[@ng-model='invLocSrch.rcity']")
public WebElementFacade tbx_InvLocSrch_CityName;

@FindBy(xpath = "//select[@ng-model='invLocSrch.rstate']")
public WebElementFacade ddl_InvLocSrch_StateName;

@FindBy(xpath = "//input[@ng-click='rangeAdvncSearch()']")
public WebElementFacade btn_Search;



//
@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading")
public WebElementFacade lbl_addressTabTtitle;


@FindBy(xpath = "//input[@value='Add Individual Addresses']")
public WebElementFacade btn_AddIndividualLocation;


@FindBy(xpath = "//*[@id='mainTab']/div/ul/li[4]/a/tab-heading")
public WebElementFacade lbl_locationTabTitle;




//Location form fields

@FindBy(id ="AddressRole")
public WebElementFacade cmb_Location_Role;

@FindBy(id = "locationFullName")
public WebElementFacade tbx_LocationFullName ;

@FindBy(xpath=".//*[@id='addressNumber']")
public WebElementFacade tbx_Address_Number;


@FindBy(id = "addressPrefix")
public WebElementFacade tbx_AddressPrefix ;

@FindBy(id = "addressSuffix")
public WebElementFacade tbx_AddressSuffix ;

@FindBy(id = "streetDirectionPrefix")
public WebElementFacade ddl_StreetDirPrefix ;

@FindBy(id = "street")
public WebElementFacade tbx_StreetName ;

@FindBy(xpath = ".//*[@name='streetType']")
public WebElementFacade ddl_StreetType ;

@FindBy(id = "streetDirectionSuffix")
public WebElementFacade ddl_StreetDirSuffix ;

@FindBy(xpath = "//span[@ng-switch-when='inputSelectOneMenu']/select[@id = 'state']")
public WebElementFacade ddl_State ;

@FindBy(id = "city")
public WebElementFacade ddl_City ;

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

@FindBy(id="RestrictedAddressCode")
public WebElementFacade ddl_Restricted_Location;

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

@FindBy(id = "lata")
public WebElementFacade tbx_LATA;

@FindBy(id = "npa")
public WebElementFacade tbx_NPa;

@FindBy(id ="nxx")
public WebElementFacade tbx_NXX;



@FindBy(xpath = "//*[@value='Create']")
public WebElementFacade btn_Create_AWR ;


@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[5]/a/tab-heading")
public WebElementFacade tab_AWR_view_Tab_title;

@FindBy(xpath = "//*[@value='Add Next Address' and @ng-click='addNextAddressLocation();']")
public WebElementFacade btn_Add_Next_Address;	


@FindBy(xpath = "//*[@ng-click='getAddressRangeLocationDetails(entity[field.name])']")
public WebElementFacade lbl_Range_ID_view_screen;


@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[4]/a/tab-heading")
public WebElementFacade tab_Create_form_Address_Within_Range;

@FindBy(xpath = "//*[@ng-show='showAlert' and @class='ng-binding alert alert-success']")
public WebElementFacade lbl_success_message;

@FindBy(xpath = "//*[@ng-click='getAddressRangeLocationDetails(entity[field.name])']")
public WebElementFacade lbl_Range_ID_view_;

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return btn_subscriber;
	}
	
public void  Addsubbtnverify()
{
	Assert.assertTrue(btn_AddSubScriber.isPresent());
	btn_AddSubScriber.click();
}
  
  
}

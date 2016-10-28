package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.List;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateNetworkbuild extends OmniVuePage{
	
	//@FindBy(xpath=".//*[@class='control-label ng-binding']")
	/*@FindBy(xpath=".//*[@class='row']")
	public List<WebElementFacade> lbl_altequitbuildcreateform;*/
	
	@FindBy(xpath=".//*[text()='Build ID']")
	public WebElementFacade lbl_altequitbuild_createform_buildid;
	
	@FindBy(xpath=".//*[text()='Build ID']/following-sibling::div")
	public WebElementFacade lbl_altequitbuild_createform_buildid_value;
	
	@FindBy(xpath=".//*[text()='Build Type']")
	public WebElementFacade lbl_altequitbuild_createform_buildtype;
	
	@FindBy(xpath=".//*[text()='Build Type']/following-sibling::div")
	public WebElementFacade lbl_altequitbuild_createform_buildtype_value;
	
	@FindBy(xpath=".//*[text()='Initiated By']")
	public WebElementFacade lbl_altequitbuild_createform_initid;
	
	@FindBy(xpath=".//*[text()='Initiated By']/following-sibling::div")
	public WebElementFacade lbl_altequitbuild_createform_initid_value;
	
	@FindBy(xpath=".//*[text()='Last Updated By']")
	public WebElementFacade lbl_altequitbuild_createform_lastupdt;
	
	@FindBy(xpath=".//*[@class='form-horizontal']/div/div[1]/div/div[5]/label")
	public WebElementFacade lbl_altequitbuild_createform_status;
	
	@FindBy(xpath=".//*[@class='form-horizontal']/div/div[1]/div/div[5]/label/following-sibling::div")
	public WebElementFacade lbl_altequitbuild_createform_status_value;
		
	@FindBy(xpath=".//*[text()='Order/CSOF Id']")
	public WebElementFacade lbl_altequitbuild_createform_odercsofid;
	
	@FindBy(xpath=".//*[text()='Initiated Date']")
	public WebElementFacade lbl_altequitbuild_createform_initdate;
	
	@FindBy(xpath=".//*[text()='Last Updated Date']")
	public WebElementFacade lbl_altequitbuild_createform_lstdate;
	
	
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void validatealtequitbuildcreateformvalidation(){
		//Build section Validation for Alt Build equipment
		if(lbl_altequitbuild_createform_buildid.isDisplayed() && lbl_altequitbuild_createform_buildtype.isDisplayed() && lbl_altequitbuild_createform_initid.isDisplayed()  &&  lbl_altequitbuild_createform_lastupdt.isDisplayed()  && lbl_altequitbuild_createform_status.isDisplayed() && lbl_altequitbuild_createform_odercsofid.isDisplayed() && lbl_altequitbuild_createform_initdate.isDisplayed() && lbl_altequitbuild_createform_lstdate.isDisplayed()){
			if(lbl_altequitbuild_createform_buildid_value.isDisplayed() && lbl_altequitbuild_createform_buildtype_value.isDisplayed() && lbl_altequitbuild_createform_initid_value.isDisplayed() && lbl_altequitbuild_createform_status_value.isDisplayed()) {
				System.out.println("Validated Build section in Alt equit create form");
			}
			
			
		}
	}
	
	
	
	

}

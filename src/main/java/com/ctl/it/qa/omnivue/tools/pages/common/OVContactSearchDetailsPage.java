package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.List;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVContactSearchDetailsPage extends OmniVuePage {

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}
	@FindBy(id="firstName")
	public WebElementFacade tbx_firstname;
	@FindBy(id="EMAIL")
	public WebElementFacade tbx_Email;
	@FindBy(id="lastName")
	public WebElementFacade tbx_lastname;
	@FindBy(id="contactCategory")
	public WebElementFacade ddl_Category;
	@FindBy(xpath="(//select[@id='contactType'])[2]")
	public WebElementFacade ddl_ContactType;
	@FindBy(xpath="(//input[@class='cmdButton'])[1]")
	public WebElementFacade btn_save;
	@FindBy(xpath="(//input[@id='ContactRole'])[1]")
	public WebElementFacade cbx_Circuit;
   @FindBy(xpath="(//label[text()='Contact Type'])[3]/../../..//div/label")
   public WebElementFacade verf_contacttype;
   
   @FindBy(xpath="//label[text()='First Name']/../../..//div//label")
   public WebElementFacade verf_firstname;
   
   
   @FindBy(xpath="//label[text()='Last Name']/../../..//div//label")
   public WebElementFacade verf_lastname;
   
   @FindBy(xpath="//label[text()='Email']/../../..//div//label")
   public WebElementFacade verf_email;
   
   @FindBy(xpath="//label[text()='Category']/../../..//div//label")
   public WebElementFacade verf_category;
   
   @FindBy(xpath="(//input[@id='allDay'])[1]")
   public WebElementFacade cbx_Email;
   public void validate(List<String> al)
   {
	  //
	   System.out.println(verf_firstname.getText().trim());
	   Assert.assertEquals(verf_firstname.getText().trim()	, al.get(0));
	   System.out.println(verf_lastname.getText().trim());
   // Assert.assertEquals(verf_firstname.getText().trim()	, al.get(0));
    System.out.println("1");
    Assert.assertEquals(verf_lastname.getText().trim()	, al.get(1));
    System.out.println("2");
    Assert.assertEquals(verf_category.getText().trim()	, al.get(2));
    System.out.println("3");
    Assert.assertEquals(verf_contacttype.getText().trim()	, al.get(3));
    System.out.println("4");
    Assert.assertEquals(verf_email.getText().trim()	, al.get(4));
    System.out.println("5");

    
    System.out.println("verification done");
    
   }
	

}

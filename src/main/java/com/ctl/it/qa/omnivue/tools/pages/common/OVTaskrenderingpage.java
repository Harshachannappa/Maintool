package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVTaskrenderingpage extends OmniVuePage {
	
	
	OVLoginPage loginPage;
	
	@FindBy(xpath=".//*[@ng-click='gridSettings.viewTaskDetailDsp(0)' and @title='View DSP Task']")
	public WebElementFacade btn_DSPview_task;
	
	@FindBy(xpath=".//*[@ng-click='gridSettings.editTaskDetailDsp(0)' and @title='Edit DSP Task']")
	public WebElementFacade btn_DSPedit_task;
	
	@FindBy(xpath=".//*[@ng-click='gridSettings.viewTaskDetail(0)' and @title='View Task']")
	public WebElementFacade btn_view_task;
	
	@FindBy(xpath=".//*[@ng-click='gridSettings.editTaskDetailDsp(0)' and @title='Edit Task']")
	public WebElementFacade btn_edit_task;
	
	//IFrame view
	
	@FindBy(xpath=".//iframe[@class='ng-scope']")
	public WebElementFacade lbl_iframeview;
	
	
	
	
	
	
	//API Task Fields
	
	@FindBy(xpath=".//*[text()='General Task Details']")
	public WebElementFacade lbl_General_task_details;
	
	@FindBy(xpath=".//*[text()='Actions']")
	public WebElementFacade lbl_Actions;
	
	@FindBy(xpath=".//*[text()='Task Specific Info']")
	public WebElementFacade lbl_Task_specific_info;
	
	@FindBy(xpath=".//*[text()='Task WorkFlow']")
	public WebElementFacade lbl_Task_workflow;
	
	//@FindBy(xpath=".//*[@ng-controller='dspTaskDetailCtrl']")
	@FindBy(xpath=".//*[@ng-controller='dspTaskDetailCtrl']/div[3]/div")
	public List<WebElementFacade> lbl_General_task_list;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return btn_view_task;
	}
				
	public WebElementFacade ViewDSPtaskclick(){
		btn_DSPview_task.click();
		return lbl_General_task_details;		
	}
	
	public WebElementFacade EditDSPtaskclick(){
		String taskpath=".//*[@ng-click='gridSettings.editTaskDetailDsp(";
		for(int i=0;i<5;i++){
			String edittaskpath=taskpath+i+")' and @title='Edit DSP Task']";
			String taskstatuspath=".//*[contains(@id,'row"+i+"taskGrid_')]/div[7]/div";
			if(loginPage.getDriver().findElement(By.xpath(taskstatuspath)).getText().equals("Open")||loginPage.getDriver().findElement(By.xpath(taskstatuspath)).getText().equals("Assigned")){
				loginPage.getDriver().findElement(By.xpath(edittaskpath)).click();
				break;
			}
		}
		
		System.out.println("Found an open task");
		//btn_DSPedit_task.click();
		return lbl_General_task_details;		
	}
	
	
	public WebElementFacade fallouttaskclick(){
		btn_view_task.click();
		return lbl_iframeview;
	}
	
	
	public void taskviewvalidation(String viewtask){
		if(viewtask.equals("API View")){
			if(lbl_General_task_details.isDisplayed() && lbl_Actions.isDisplayed() && lbl_Task_specific_info.isDisplayed() && lbl_Task_workflow.isDisplayed()){
				System.out.println("Able to see the API view for the Autoform task");
			} else throw new Error("API View is not displayed");
		} else if(viewtask.equals("Iframe View")){	
			
			if(lbl_iframeview.isDisplayed()){
				System.out.println("Able to see the Iframe view for the Fallout task");
			} else throw new Error("Iframe View is not displayed");
			loginPage.getDriver().switchTo().defaultContent();
		}
	}
	
	
	public void APIsectionvalidation(String tasksec){
		if(tasksec.equals("GPON Task Specific Details Area")){
			
		
			List<WebElementFacade> generaltasklist = lbl_General_task_list;
			ArrayList<String> generaltaskatributesOfPage=new ArrayList<String>();
			//System.out.println("Step one done");
		
			for(int j=0;j<generaltasklist.size();j++){
			
				generaltaskatributesOfPage.add(j, generaltasklist.get(j).getText());
			
			//System.out.println("Step Two done");
			//System.out.println(atributesOfPage.get(j));
		}
		
			System.out.println(generaltaskatributesOfPage);
			
			for(int i=0;i<generaltaskatributesOfPage.size();i++){
				//System.out.println(atributesOfPage.get(i));
				if(generaltaskatributesOfPage.get(i).equals("Task ID:")){
					
					
				} else if(generaltaskatributesOfPage.get(i).equals("Created By:")){
					
				} else if(generaltaskatributesOfPage.get(i).equals("Create Date:")){
					
				} else if(generaltaskatributesOfPage.get(i).equals("WorkGroup:")){
					
				} else if(generaltaskatributesOfPage.get(i).equals("Due Date:")){
					
				} else if(generaltaskatributesOfPage.get(i).equals("Completed By:")){
					
				} else if(generaltaskatributesOfPage.get(i).equals("Completed Date:")){
					
				} else if(generaltaskatributesOfPage.get(i).equals("Task Name:")){
					
				} else if(generaltaskatributesOfPage.get(i).equals("Task Type:")){
					
				} else if(generaltaskatributesOfPage.get(i).equals("Task Description:")){
					
				}
			}
			
			ArrayList<String> taskAttributestobepresent = new ArrayList<String>();

			taskAttributestobepresent.add(0, "Task ID:");
			taskAttributestobepresent.add(1, "Created By:");
			taskAttributestobepresent.add(2, "Create Date:");
			taskAttributestobepresent.add(3, "Task Status:");
			taskAttributestobepresent.add(4, "WorkGroup:");
			taskAttributestobepresent.add(5, "Assigned To:");
			taskAttributestobepresent.add(6, "Due Date:");
			taskAttributestobepresent.add(7, "Completed By:");
			taskAttributestobepresent.add(8, "Task Name:");
			taskAttributestobepresent.add(9, "Task Type:");
			taskAttributestobepresent.add(10, "Task Description:");
			taskAttributestobepresent.add(11, "Error Details:");
			taskAttributestobepresent.add(12, "Ensemble Order Number/ID:");
			taskAttributestobepresent.add(13, "CSOF ID:");
			taskAttributestobepresent.add(14, "Customer DTN:");
			taskAttributestobepresent.add(15, "Customer Name:");
			taskAttributestobepresent.add(16, "BAN:");
			taskAttributestobepresent.add(17, "GPON Wiki URL Link:");
			
			/*for (String attributeb : taskAttributestobepresent) {
				System.out.println(attributeb);
			}*/

			if (generaltaskatributesOfPage.containsAll(taskAttributestobepresent)) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}		
		}
		
		
	}

}

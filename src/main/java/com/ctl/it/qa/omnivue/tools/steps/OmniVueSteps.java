package com.ctl.it.qa.omnivue.tools.steps;

import com.ctl.it.qa.staf.Page;
import com.ctl.it.qa.staf.Steps;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;

@SuppressWarnings("serial")
public class OmniVueSteps extends Steps{
	
		public IntDataContainer get_data_for_page(Page page) {
			commonData.getContainer(page.getClass().getSimpleName())
					.setActualValuesForAllContainers();
			return commonData.getContainer(page.getClass().getSimpleName());
		}
		
		public IntDataContainer get_container_from_xml(String... containers){
			IntDataContainer actualContainer= commonData;
			for(int i=0;i<containers.length;i++){
				actualContainer=actualContainer.getContainer(containers[i]);
			}
			actualContainer.setActualValuesForAllContainers();
			return actualContainer;
		}


}

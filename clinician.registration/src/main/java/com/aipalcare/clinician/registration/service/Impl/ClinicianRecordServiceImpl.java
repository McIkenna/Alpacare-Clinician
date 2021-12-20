package com.aipalcare.clinician.registration.service.Impl;


import com.aipalcare.clinician.registration.datalayer.DataService;
import com.aipalcare.clinician.registration.enums.NameOfFactory;
import com.aipalcare.clinician.registration.factory.ServiceFactory;

import com.aipalcare.clinician.registration.models.Clinician;
import com.aipalcare.clinician.registration.services.ClinicianRecordService;

public class ClinicianRecordServiceImpl implements ClinicianRecordService {
	
	DataService dataService = (DataService) ServiceFactory.createService(NameOfFactory.BloodTest);

//	@Override
//	public boolean saveRecord(LambdaRequest input) {
//      
//	
//}


	@Override
	public boolean saveData(Clinician clinic) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean saveRecord(Clinician input) {
		
		boolean response = dataService.saveData(input);
		
		return response;
	}


	

}

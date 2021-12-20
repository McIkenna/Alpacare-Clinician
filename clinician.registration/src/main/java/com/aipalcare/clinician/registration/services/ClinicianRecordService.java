package com.aipalcare.clinician.registration.services;

import com.aipalcare.clinician.registration.factory.FactoryBase;
import com.aipalcare.clinician.registration.model.lambda.LambdaRequest;
import com.aipalcare.clinician.registration.models.Clinician;

public interface ClinicianRecordService  extends FactoryBase{
	
//	public boolean saveRecord(LambdaRequest input);
	
	boolean saveData(Clinician clinic);

	public boolean saveRecord(Clinician input);

}

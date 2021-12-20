package com.aipalcare.clinician.registration.datalayer;

import com.aipalcare.clinician.registration.factory.FactoryBase;
import com.aipalcare.clinician.registration.model.lambda.LambdaRequest;
import com.aipalcare.clinician.registration.model.lambda.LambdaResponse;
import com.aipalcare.clinician.registration.models.Clinician;

public interface DataService  extends FactoryBase{
	
	public LambdaResponse save(Clinician clinic);
	boolean saveData(Clinician clinic);
	
	
}

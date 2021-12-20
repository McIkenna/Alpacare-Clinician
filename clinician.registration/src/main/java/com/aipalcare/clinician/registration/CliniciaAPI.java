package com.aipalcare.clinician.registration;

import com.aipalcare.clinician.registration.enums.NameOfFactory;
import com.aipalcare.clinician.registration.factory.ServiceFactory;

import com.aipalcare.clinician.registration.model.lambda.LambdaResponse;
import com.aipalcare.clinician.registration.models.Clinician;
import com.aipalcare.clinician.registration.services.ClinicianRecordService;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class CliniciaAPI implements RequestHandler<Clinician, LambdaResponse > {
	
	ClinicianRecordService recordService = (ClinicianRecordService) ServiceFactory.createService(NameOfFactory.PatientData);

	

	@Override
	public LambdaResponse handleRequest(Clinician input, Context context) {
		
		

		LambdaResponse lambdaResponse = new LambdaResponse();


		lambdaResponse.setBody("I received Clinician data from database:" + input.toString());
		lambdaResponse.setStatusCode(200);
		
		
		
		  boolean response = recordService.saveRecord(input);
		  
		  if(response) {
			  lambdaResponse.setBody("Data save successful!");
			  lambdaResponse.setStatusCode(200);
			  
		  }else {
			  lambdaResponse.setBody("failure");
			  lambdaResponse.setStatusCode(401);
		  }

			
				return lambdaResponse;
			}
	


}

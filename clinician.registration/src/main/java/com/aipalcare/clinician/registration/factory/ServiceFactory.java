package com.aipalcare.clinician.registration.factory;

import com.aipalcare.clinician.registration.datalayer.DataServiceImpl;
import com.aipalcare.clinician.registration.enums.NameOfFactory;
import com.aipalcare.clinician.registration.service.Impl.ClinicianRecordServiceImpl;

public class ServiceFactory {
	
	public static FactoryBase createService(NameOfFactory name) {
		 if(name.equals(NameOfFactory.BloodTest)) {
			 
			 return new DataServiceImpl();
			 
		}else if(name.equals(NameOfFactory.PatientData)) {
			
			return new ClinicianRecordServiceImpl();
		}
		 
		 return null;
	}

}

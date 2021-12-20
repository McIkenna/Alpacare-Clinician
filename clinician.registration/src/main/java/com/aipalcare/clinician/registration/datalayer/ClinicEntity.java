package com.aipalcare.clinician.registration.datalayer;



import com.aipalcare.clinician.registration.models.Clinician;
import com.microsoft.azure.storage.table.TableServiceEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClinicEntity extends TableServiceEntity{
	
	public ClinicEntity(Clinician clinic) 
	{
	super.setPartitionKey("ClinicEntity");
	super.setRowKey(clinic.getPhoneNo());
	this.setName(clinic.getName());
	this.setCardId(clinic.getCardId());
	this.setEmail(clinic.getEmail());
	

}
	public ClinicEntity() { }
	
	private String name;
	private String cardId;
	private String email;
	private String phoneNo;
}
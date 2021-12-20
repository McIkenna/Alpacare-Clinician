package com.aipalcare.clinician.registration.datalayer;

import java.net.URISyntaxException;
import java.security.InvalidKeyException;


import com.aipalcare.clinician.registration.configure.DataConfig;
import com.aipalcare.clinician.registration.model.lambda.LambdaResponse;
import com.aipalcare.clinician.registration.models.Clinician;
import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.table.CloudTable;
import com.microsoft.azure.storage.table.CloudTableClient;
import com.microsoft.azure.storage.table.TableOperation;

public class DataServiceImpl implements DataService{
	
	private static  CloudStorageAccount _storageAcct;
	private static CloudTableClient _tableClient;
	
	static {
		create();
		_tableClient = createTableClient();
	}
	
	public static  CloudStorageAccount create() {
		
		
		try {
			_storageAcct = CloudStorageAccount.parse(DataConfig.getDataConfig());
		
		}catch(InvalidKeyException e) {
			
			e.printStackTrace();
			
		}catch(URISyntaxException e) {
			
			e.printStackTrace();
		}
		
	return _storageAcct;
		
		}
	public static CloudTableClient createTableClient() {
		
		
		
		return _storageAcct.createCloudTableClient();
		
	}

	@Override
	public boolean saveData(Clinician clinic) {
		CloudTable cloudTable = null;
		try {
		String tableName = "clinician"+ clinic.getPhoneNo();
		
		ClinicEntity entity = new ClinicEntity(clinic);
		
		cloudTable = creaateOrGetUserTable(tableName);
		
		TableOperation insertOperation = TableOperation.insertOrReplace(entity);
		
		
		cloudTable.execute(insertOperation);
		}
	
	    catch(Exception ex) {
		
		return false;
	}
	
	return true;
}
	private CloudTable creaateOrGetUserTable(String tableName) {
		CloudTable cloudTable = null;
		
		try {
			cloudTable = _tableClient.getTableReference(tableName);
			cloudTable.createIfNotExists();
			
			}catch(URISyntaxException url) {
				
			}catch(StorageException se) {
				
			}catch(Exception e) {
				
			}
		return cloudTable;
	} 
		
	

	@Override
	public LambdaResponse save(Clinician clinic) {
	 ClinicEntity entity = new ClinicEntity(clinic);
		return null;
	}

}

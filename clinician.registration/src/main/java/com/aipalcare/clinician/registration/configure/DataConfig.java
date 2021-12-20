package com.aipalcare.clinician.registration.configure;

public class DataConfig {
	
	
private static final String AZURE_CONNECTION_STRING="DefaultEndpointsProtocol=https;AccountName=aipalcaredatabase;AccountKey=Orii48j3Of8C4Mg2NkzWjVk6ASIOELeQbHZhOvfkuL7m6ohdpbUX9DmRfqN5/hw5TRk69Kf6HatyP86MM48Yzg==;EndpointSuffix=core.windows.net";
	
	
	public static String getDataConfig() {
return AZURE_CONNECTION_STRING;

}

}

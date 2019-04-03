package gwd.common;

import java.io.IOException;

import gwd.pojo.GetWorkDayProperties;

public class RetrieveLibrary {

	/* This method retrieves the library from Properties file using the following parameters:
	 * a. firmCode = company code i.e "20/21/24/25/26" 
	 * b. libraryType: USSOLIB = USSOXXX 
	 * 				   ULCLLIB = ULCLXXX
	 * 				   where XXX = OSA (MES/MME/TMT/MEP/PMM)*/
	public static String getLibrary(String firmCode, String libraryType){

		String library = "";

		GetWorkDayProperties prop = new GetWorkDayProperties();
		try {
			prop.getProperties();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if(libraryType.equals("USSOLIB")){
			if(firmCode.equals("20")){
				library = prop.getUssolib20();
			}else if (firmCode.equals("21")){
				library = prop.getUssolib21();
			}else if (firmCode.equals("24")){
				library = prop.getUssolib24();
			}else{
				library = prop.getUssolib25();
			}
		}

		if(libraryType.equals("ULCLLIB")){
			if(firmCode.equals("20")){
				library = prop.getUlcllib20();
			}else if (firmCode.equals("21")){
				library = prop.getUlcllib21();
			}else if (firmCode.equals("24")){
				library = prop.getUlcllib24();
			}else{
				library = prop.getUlcllib25();
			}
		}

		return library;
	}
}

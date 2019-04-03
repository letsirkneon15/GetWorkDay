package gwd.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import gwd.pojo.USSOCalendar;

public class USSOCalendarMgr {

	public USSOCalendar getCalendarByNumOfDays(String firmCode, String warehouseCode, int calYear, 
			int calMonth, int numOfDays, Connection conn){

		/* Get USSOLIB - i.e USSOMES etc. */
		String ussoLib = RetrieveLibrary.getLibrary(firmCode, "USSOLIB");

		/* Variables declaration  */
		USSOCalendar ussoCal = new USSOCalendar();
		int ctr = 1;
		
		try{

			String sql = "SELECT FIRMKL, WRHSKL, JAHRKL, MONAKL, TAGXKL, KZTAKL FROM "  + ussoLib  + ".SMKLP00 WHERE FIRMKL=?" +
					" AND WRHSKL=? AND JAHRKL=? AND MONAKL=? AND KZTAKL='A' FOR READ ONLY";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, firmCode.trim());
			ps.setString(2,  warehouseCode.trim());
			ps.setInt(3, calYear);
			ps.setInt(4, calMonth);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){	
				if(ctr == numOfDays){
					ussoCal = new USSOCalendar(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), 
							rs.getInt(5), rs.getString(6));
					
					System.out.println("From SMKLP00: " + rs.getInt(3) + "/" + rs.getInt(4) + "/" + rs.getInt(5));
				}
				ctr+=1;
			}
			rs.close();
			ps.close();

		}catch(Exception e){
			e.printStackTrace();
		}	
		return ussoCal;
	}
}

package gwd.pojo;

import java.io.Serializable;

public class USSOCalendar implements Serializable{
		private static final long serialVersionUID = 1L;
		
		private String firmCode;
		private String warehouseCode;
		private int calYear;
		private int calMonth;
		private int calDay;
		private String markOfDay;
		
		public String getFirmCode() {
			return firmCode;
		}
		public void setFirmCode(String firmCode) {
			this.firmCode = firmCode;
		}
		public String getWarehouseCode() {
			return warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}
		public int getCalYear() {
			return calYear;
		}
		public void setCalYear(int calYear) {
			this.calYear = calYear;
		}
		public int getCalMonth() {
			return calMonth;
		}
		public void setCalMonth(int calMonth) {
			this.calMonth = calMonth;
		}
		public int getCalDay() {
			return calDay;
		}
		public void setCalDay(int calDay) {
			this.calDay = calDay;
		}
		public String getMarkOfDay() {
			return markOfDay;
		}
		public void setMarkOfDay(String markOfDay) {
			this.markOfDay = markOfDay;
		}

		public USSOCalendar(String firmCode, String warehouseCode, int calYear, int calMonth, int calDay,
				String markOfDay) {
			this.firmCode = firmCode;
			this.warehouseCode = warehouseCode;
			this.calYear = calYear;
			this.calMonth = calMonth;
			this.calDay = calDay;
			this.markOfDay = markOfDay;
		}
		
		public USSOCalendar() {
			// TODO Auto-generated constructor stub
		}		
}

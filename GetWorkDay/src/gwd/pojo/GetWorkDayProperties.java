package gwd.pojo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetWorkDayProperties {
	    
		private String ulcllib20;
		private String ussolib20;
		private String ulcllib21;
		private String ussolib21;
		private String ulcllib24;
		private String ussolib24;
		private String ulcllib25;
		private String ussolib25;
		
		
		public void getProperties() throws IOException{
			Properties progProperties = new Properties();
			InputStream in = this.getClass().getClassLoader().getResourceAsStream("GetWorkDay.properties");
			progProperties.load(in);
		    this.setUlcllib20(progProperties.getProperty("ulcllib20"));
		    this.setUssolib20(progProperties.getProperty("ussolib20"));
		    this.setUlcllib21(progProperties.getProperty("ulcllib21"));
		    this.setUssolib21(progProperties.getProperty("ussolib21"));
		    this.setUlcllib24(progProperties.getProperty("ulcllib24"));
		    this.setUssolib24(progProperties.getProperty("ussolib24"));
		    this.setUlcllib25(progProperties.getProperty("ulcllib25"));
		    this.setUssolib25(progProperties.getProperty("ussolib25"));
		    
		}
		
		public String getUlcllib20() {
			return ulcllib20;
		}
		public void setUlcllib20(String ulcllib20) {
			this.ulcllib20 = ulcllib20;
		}
		public String getUssolib20() {
			return ussolib20;
		}
		public void setUssolib20(String ussolib20) {
			this.ussolib20 = ussolib20;
		}
		public String getUlcllib21() {
			return ulcllib21;
		}
		public void setUlcllib21(String ulcllib21) {
			this.ulcllib21 = ulcllib21;
		}
		public String getUssolib21() {
			return ussolib21;
		}
		public void setUssolib21(String ussolib21) {
			this.ussolib21 = ussolib21;
		}
		public String getUlcllib24() {
			return ulcllib24;
		}
		public void setUlcllib24(String ulcllib24) {
			this.ulcllib24 = ulcllib24;
		}
		public String getUssolib24() {
			return ussolib24;
		}
		public void setUssolib24(String ussolib24) {
			this.ussolib24 = ussolib24;
		}
		public String getUlcllib25() {
			return ulcllib25;
		}
		public void setUlcllib25(String ulcllib25) {
			this.ulcllib25 = ulcllib25;
		}
		public String getUssolib25() {
			return ussolib25;
		}
		public void setUssolib25(String ussolib25) {
			this.ussolib25 = ussolib25;
		}
	
}

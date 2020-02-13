package utilities;

import commonFunctionLibrary.ERP_Functions;

public class Dummy {

	public static void main(String[] args) throws Exception {
		
		ERP_Functions erp= new ERP_Functions();
		erp.launchAPP("http://webapp.qedge.com/login.php");
		erp.login("admin", "master");
		String result= erp.supplier("Akhilesh1", "srnagar1", "Hyd", "India", "rangatnath", "4563787823", "test@gmail.com", "8765432", "iam purchasing mobile1" );
		
		
		

	}

}

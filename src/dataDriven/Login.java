package dataDriven;

import java.util.ArrayList;

public class Login {
	public static void main(String args[]) throws Exception {
		Datadriven data=new Datadriven();
		ArrayList<String> exceldata = data.getData("Login");			
		System.out.println(exceldata.get(0));
		System.out.println(exceldata.get(1));
		System.out.println(exceldata.get(2));
		System.out.println(exceldata.get(3));
		
	}


}

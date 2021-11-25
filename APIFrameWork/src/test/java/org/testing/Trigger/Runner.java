package org.testing.Trigger;

import org.testing.TestScripts.TC1_PostRequest;
import org.testing.TestScripts.TC2_GetRequest;
import org.testing.TestScripts.TC3_GetsAll;
import org.testing.TestScripts.TC4_GetAll_FetchID;
import org.testing.TestScripts.TC5_PutRequest;
import org.testing.TestScripts.TC6_DeleteRequest;


public class Runner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC1_PostRequest tc1= new TC1_PostRequest();
		tc1.FirstTC();
		TC2_GetRequest tc2= new TC2_GetRequest();
		tc2.SecondTc();
		TC3_GetsAll tc3 =new TC3_GetsAll();
		tc3.ThirdTC();
		TC4_GetAll_FetchID tc4 =new TC4_GetAll_FetchID();
		tc4.FourthTC();
	    TC5_PutRequest tc5 =new TC5_PutRequest();
		tc5.FifthTC();
		TC6_DeleteRequest tc6 =new TC6_DeleteRequest();
    	tc6.SixthTC();

	}

}

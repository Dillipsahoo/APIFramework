package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class xmlRead 
{

	//public static String handleXml(String path) {
	//	return path;
		// TODO Auto-generated method stub

	//}
	public static void main(String[] args) throws IOException {
		File f = new File("../APIFrameWork/xmlData.xml");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
	}

}

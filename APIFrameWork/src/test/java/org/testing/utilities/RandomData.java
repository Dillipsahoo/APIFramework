package org.testing.utilities;

import java.util.Random;

public class RandomData {
	
	public static Integer randomno()
	{
		Random r = new Random();
		return r.nextInt();
	}

}

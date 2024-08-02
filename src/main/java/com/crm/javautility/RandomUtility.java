package com.crm.javautility;

import java.util.Random;

public class RandomUtility {
	
	

	public static int random() {
		Random r=new Random();
		return r.nextInt(1000);
	}

}

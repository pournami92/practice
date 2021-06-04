package com;

import org.springframework.stereotype.Component;

@Component
public class MyBackEndService {

	public String getData() {
		//try {
			//Thread.sleep(10000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		return "Hi malu this message is from the backened of the internal system";
	}
}

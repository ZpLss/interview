package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileReader;

@SpringBootApplication
public class InterviewApplication {

	public static void main(String[] args) throws Exception {
//		SpringApplication.run(InterviewApplication.class, args);
		if("200".equals(null)){
			System.out.println("123");
		}


		File file = new File("/d");
		FileReader fileReader = null;
		try {
			fileReader.close();
		}catch (Exception e){}
		  throw new Exception("youwenti");


	}

}

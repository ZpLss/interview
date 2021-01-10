package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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


        String s = "123";
		s.substring(1);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("123");
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("234");

		File file = new File("/d");
		FileReader fileReader = null;
		try {
			fileReader.close();
		}catch (Exception e){}
		  throw new Exception("youwenti");


	}

}

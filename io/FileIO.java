package com.ajay.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	
	public static void  main(String []args) throws IOException{
		File fl = new File("/Users/ajatripa/hello.txt");
		FileReader fr = new FileReader(fl);
		BufferedReader fbr = new BufferedReader(fr);
		String line = null;
		while((line = fbr.readLine()) != null){
			System.out.println(line);
		}
		fbr.close();
	}

}

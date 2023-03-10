package com.lcpan.m10;

import java.io.*;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\dir");
		dir.mkdir();		//產生dir
		System.out.println(dir.isDirectory());
		
		File file = new File(dir, "input.txt");
		file.createNewFile();		//產生input.txt
		System.out.println(file.isFile());
		
		File newDir = new File("C:\\testDir");
		dir.renameTo(newDir);		//改名
		System.out.println(file.getName());
	}
}

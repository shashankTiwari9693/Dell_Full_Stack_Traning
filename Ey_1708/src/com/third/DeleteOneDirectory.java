package com.third;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class DeleteOneDirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path P= Paths.get("C:/Files/ABC3.txt");
		Path p2=Paths.get("C:/Files/ABC.txt");
		BasicFileAttributeView view =Files.getFileAttributeView(P,BasicFileAttributeView.class);
		BasicFileAttributes attr=view.readAttributes();
		

		FileTime creatinTime =attr.creationTime();
		System.out.println("Creation Time of my files was "+ creatinTime);
		
		FileTime lastAccessedTime =attr.lastAccessTime();
		System.out.println("last Time of my files was "+ lastAccessedTime);
	
		FileTime modifiedTime =attr.lastModifiedTime();
		System.out.println("modify Time of my files was "+ modifiedTime);
	}

}

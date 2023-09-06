package com.third;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOConcepts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p = Paths.get("C:/Files/ABC3.txt");
		System.out.println(p.getFileName());
		System.out.println(p.getFileSystem());
		System.out.println(p.getParent());
		System.out.println(p.getRoot());
		
		
		File f=p.toFile();
		System.out.println(f.getAbsolutePath());
		BufferedReader br=Files.newBufferedReader(p,StandardCharsets.UTF_8);
		String str=null;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		Files.createFile(Paths.get("C:/Files/ABC8.txt"));
		System.out.println("File Created");
		
		Files.createDirectory(Paths.get("C:/Files/File2"));
		System.out.println("Dir Created");
		
		Files.createDirectories(Paths.get("C:/Files/File2/Files3/Files5"));
	}

}

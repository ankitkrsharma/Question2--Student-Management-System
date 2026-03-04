package fileHanding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileDemo {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\ankit\\OneDrive\\Desktop\\test2.txt");
		File f2=new File("C:\\Users\\ankit\\OneDrive\\Desktop\\test3.txt");
		BufferedReader bf = null;
        BufferedWriter bw = null;
		try {
		bf=new BufferedReader(new FileReader(f1));
		bw=new BufferedWriter(new FileWriter(f2));
		String line;
		while((line=bf.readLine()) != null) {
			bw.write(line);
			bw.write("\n");
		
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		try {
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	

		
			
		
	

}

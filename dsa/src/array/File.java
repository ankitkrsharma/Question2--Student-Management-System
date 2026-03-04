package array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
	public static void main(String[] args) {
		try {
			BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\ankit\\OneDrive\\Desktop\\source.txt"));
			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

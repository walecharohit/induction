package ioresource;

import java.io.*;

public class CsvReader implements DataReader{
	String line;
	public void getInfo(BufferedReader b)throws IOException{
		while((line = b.readLine()) != null){
		String[] arr = line.split(",");
		System.out.println("ID - "+ arr[0] +" "+" FirstName - "+ arr[1] +" "+" LastName - "+ arr[2] +" "+" Email - "+ arr[3] +" "+" Country - "+ arr[4]);
		}
	}
}

package ioresource;

import java.io.*;

public class TabReader implements DataReader{
	String line;
	public void getInfo(BufferedReader b)throws IOException{
		while((line = b.readLine()) != null){
			String[] arr = line.split("\t");
			System.out.println("Value 1 - "+ arr[0] +" "+"Value 2 - "+ arr[1] +" "+"Value 3 - "+ arr[2] +" "+"Value 4 - "+ arr[3] +" "+"Value 5 - "+ arr[4]);
		}
	}
}

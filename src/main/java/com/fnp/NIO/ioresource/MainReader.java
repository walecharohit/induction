package ioresource;

import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class MainReader{
	 	
	public void ReaderRequired(CsvReader csv, FileChannel channel, ByteBuffer buff)throws IOException{
	
		System.out.println("csv");
		csv.getInfo(buff, channel);
	}
	
	public void ReaderRequired(TabReader tab, FileChannel channel, ByteBuffer buff)throws IOException{
	
		System.out.println("tab");
		tab.getInfo(buff, channel);
	}
	
}

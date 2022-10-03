import ioresource.*;
import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.channels.FileChannel;

class Main {
	
	public static void main(String [] args){
	
		try{
			RandomAccessFile fr = new RandomAccessFile("./file.csv","rw");
			FileChannel channel = fr.getChannel();
			ByteBuffer buff = ByteBuffer.allocate(1024);
			MainReader read = new MainReader();
			CsvReader csv = new CsvReader();
			read.ReaderRequired(csv, channel, buff);
			buff.clear();
			channel.close();
			fr.close();
		}
		catch(Exception e){
				e.printStackTrace();
		}
		try{
			RandomAccessFile fr = new RandomAccessFile("./test.txt","rw");
			FileChannel channel = fr.getChannel();
			ByteBuffer buff = ByteBuffer.allocate(1024);
			MainReader read = new MainReader();
			TabReader tab = new TabReader();
			read.ReaderRequired(tab, channel, buff);
			channel.close();
			fr.close();
		}
		catch(Exception e){
				e.printStackTrace();
		}
	}
}

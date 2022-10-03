package ioresource;

import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class CsvReader implements DataReader{
	public void getInfo(ByteBuffer buff, FileChannel channel)throws IOException{
		while(channel.read(buff) > 0){
			buff.flip();
			while(buff.hasRemaining()){	
					System.out.print((char) buff.get());
			}
		}
	}
}

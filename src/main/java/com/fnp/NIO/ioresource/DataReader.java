package ioresource;

import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

interface DataReader{
	void getInfo(ByteBuffer buff, FileChannel channel)throws IOException;
}

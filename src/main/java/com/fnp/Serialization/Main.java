import serializationresource.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main{
	public static void main(String [] args){
		
		try{
			FileOutputStream file = new FileOutputStream("./write.txt");
			ObjectOutputStream filewriter = new ObjectOutputStream(file);

			Company cns = new Company(1, "john", "tech", "texas");
			filewriter.writeObject(cns);
			file.close();
			filewriter.close();			
						
			FileInputStream file1 = new FileInputStream("./write.txt");	
			ObjectInputStream filereader = new ObjectInputStream(file1);
			Company object=(Company)filereader.readObject();
			System.out.println(object);			
			file1.close();
			filereader.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

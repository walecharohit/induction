import singletonresource.*;

class Main{
	public static void main(String [] args){
		CurrentTime time = CurrentTime.getInstance();
		time.getTime();
	}
}

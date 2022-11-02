package mediatorresource;

import java.util.Date;

public class Mediator{
	public static void displayMessage(User user,String message){
		System.out.println(new Date().toString() + " " + user.getName() +" "+ message);
	}
}

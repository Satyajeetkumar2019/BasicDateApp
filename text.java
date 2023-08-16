package TextApp;
//import DependencyInjection
import java.time.LocalDateTime;
import DependencyInJection.*;
public class text {
public static void main(String[] args) {
	//object create by dependate class
	 LocalDateTime scn= LocalDateTime.now();
	 //create object by targer class
	 Injection obj=new Injection();
	 obj.setIdt(scn);
	 String userName=obj.gettingWishMessage("Mr .Satyajeet kumar");
	//print Result
	 System.out.println(userName);
}//end of the main method
	
}//end of the main class


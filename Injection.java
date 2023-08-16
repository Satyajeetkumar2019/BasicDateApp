package DependencyInJection;
import java.time.LocalDateTime;
public class Injection {
private LocalDateTime idt;
	//setter injection 
public  void setIdt(LocalDateTime idt) {
	System.out.println("WishMessage SetMethod(-)");
	this.idt=idt;
	
}
public String gettingWishMessage(String user) {
	System.out.println("WishMessageGenerater ");
	int h=idt.getHour();
	if(h<12) {
		
		return "Good Morning"+user;
	}
	else if(h<16) {
		return"Good Afternoon "+user;
	}
	else if(h<20) {
		return "good evening "+user;	
	}
	else {
		return "Good Night"+user;
		//System.out.println("good night "+user);
	}
}//end of the method 




}//end of the class

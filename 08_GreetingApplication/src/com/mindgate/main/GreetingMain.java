package com.mindgate.main;
import com.mindgate.pojo.Greetings;
public class GreetingMain {

	public static void main(String[] args) {

		
        Greetings greetings=()->{System.out.println("Good Afternoon");};
		Greetings greetings1=()->{System.out.println("Good Evening");}; 
      greetings1.greet();
	}

	
	
}

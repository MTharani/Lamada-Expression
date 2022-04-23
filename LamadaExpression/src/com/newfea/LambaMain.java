package com.newfea;

import java.util.ArrayList;

interface Drawablecircle
 {
	 void draw();
 }
 interface sayable
 {
	 void say(String s);  //function with argu with no return type
 }
interface SayHello{
	String sayhello();
}
interface Addition
{
	int add(int i, int j);
}
public class LambaMain {

	public static void main(String[] args) {
          Drawablecircle dob=()->
          {
        	System.out.println("draw method");  
          };
          dob.draw();
          sayable sa=(s)->
          {
        	System.out.println("hello"+s);  
          };
          sa.say("Java");
          SayHello sh=()->
          {
        	return "Hi";  
          };
          System.out.println(sh.sayhello());
          Addition aod=(i,j)->(i+j);
        		  System.out.println(aod.add(5, 5));
        		  //collection API
        		  ArrayList<Integer> l=new ArrayList<Integer>();
                  l.add(7);
                  l.add(5);
                  l.add(4);
                  l.add(56);
                  l.forEach((n)->System.out.println(n));;
	}

}

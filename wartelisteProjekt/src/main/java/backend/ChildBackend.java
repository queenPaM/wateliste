package backend;

import java.util.ArrayList;

public class ChildBackend {
	   public static ArrayList<Child> getChildren()
	   {
	      Child joe = new Child("Joe", "Underwood"," ","Straße2134","männlcih","");
	      ArrayList<Child> people = new ArrayList<Child>();
	      people.add(joe);
	      Child steve = new Child("Jack", "Keinplan"," ","Straße2wt34","neutral","");
	      people.add(steve);            // Now Steve and Joe are two separate objects 
	                                    // that have their own instance variables
	                                    // (non-static)
	      return people;
	   }
	  
}
package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Practice_Collection 
{
   public static void main (String [] args)
   {
	   
	   System.out.println("------------Array List-----------------------------------"); 
	   //List Collections --> duplicate, null value , insertion arrange data sequentially
	   ArrayList al= new ArrayList();
	//   ArrayList al= new ArrayList<String>();
	  al.add(111);
	  al.add("apurv");
	  al.add("true");
	  al.add("a");
	  al.add(111);
	  al.add(null);
	  al.add(null);
	  al.add(1, "wankhede");
	//  System.out.println(al);
	  for (int i=0; i<al.size(); i++)    // one by one print on console
	  {
		 System.out.println(al.get(i));
	  }
	 
//	  System.out.println( al.get(1));
//	  System.out.println(al.get(3)); 
	  
	  // add()  ---> to add data in collection object
	  // remove()  ---> to delete data in collection object
	  // get() --> to get/retrieve data from collections
	  System.out.println("--------Iterator---------------------------------------"); 
	  
	  Iterator itr = al.iterator();
	while(itr.hasNext())    // 0th index
	{
		System.out.println(itr.next());
	}
	
	
	  System.out.println("--------LinkedList---------------------------------------"); 
	  
	  //LinkedList
	  LinkedList ll= new LinkedList ();
	  ll.add(111);         //(0,1)
	  //(1,2)  Shifting index to get new index 1 value
	  ll.add("apurv");     // (2,3)
	  ll.add("true");
	  ll.add("a");
	  ll.add(111);
	  ll.add(null);
	  ll.add(null);
	  ll.add(1, "wankhede");
	  System.out.println(ll);
		
		//out is same as Array List  
	  System.out.println("--------Vector List---------------------------------------");
	  // Vector List
	//  while importing java.util* for all list importing
	  
	  Vector v = new Vector ();
	  v.add(111);
	  v.add("apurv");
	  v.add("true");
	  v.add("a");
	  v.add(111);
	  v.add(null);
	  v.add(null);
	  System.out.println(v);
		
	  System.out.println("--------Set---------------------------------------");
	  //Set ---> duplicate value not allow, only one null value, random arrange data 
	  HashSet hs= new HashSet();
	  hs.add(111);
	  hs.add("apurv");
	  hs.add("true");
	  hs.add("a");
	  hs.add(111);
	  hs.add(null);
	  hs.add(null);
	  System.out.println(hs);
	//  System.out.println(hs.get(3));  // method is not supported bcoz of index property not allow
	  
	  System.out.println("---------------one collection to another-----------------------------------------"); 
	  HashSet hs1 =new HashSet(al);  //method 1
	//  HashSet hs1 =new HashSet();    // method 2 adding one collection to another
	  hs1.addAll(al);
	  System.out.println(hs1);
	  
	  System.out.println("---------------LinkedHashset-----------------------------------------"); 
	  
	  
	  //LinkedHashet--> insertion arrange data sequentially,  
	  LinkedHashSet LinkedHs= new LinkedHashSet ();
	  LinkedHs.add(111);        
	  LinkedHs.add("apurv");    
	  LinkedHs.add("true");
	  LinkedHs.add("a");
	  LinkedHs.add(111);
	  LinkedHs.add(null);
	  LinkedHs.add(null);
	 
	
	  System.out.println(LinkedHs);
	  System.out.println("---------------TreeSet-----------------------------------------"); 
	  TreeSet  ts = new TreeSet (); //   method 1
	  // it will arrange data in alphabetical and sequential order 
	  // it has no index property // duplicate value is not accepted //
	  ts.add(11);
	  ts.add(22);     // (2,3)
	  ts.add(44);
	  ts.add(33);
	  ts.add(66);
	  ts.add(55);
	  ts.add(22);
	  ts.add(77);
	  ts.add(99);
	 
	  
		ArrayList al2 = new ArrayList ();
		al2.addAll(ts);
	  System.out.println(al2.get(2)); // it will arrange and get index 2 value 
	  
	  System.out.println("---------------HashMap-----------------------------------------"); 
	  //duuplicate key is not allowed, boolean value is accepted
	  //we can pass generic also
	  // multi thread is accepted, null value is accepted
	  HashMap  hm = new HashMap();
	  hm.put("Name", "ram");
	  hm.put("address", "abcd");
	  hm.put("Designation", "Qa");
	  hm.put(true, "yes");    //  boolean value is accepted
	  hm.put(11, "this is a number");
	  hm.put(null, "this is a null value"); //only one null value is allowed
	  hm.put(null, "this is a second null value");
	  hm.put(11, "this is second number");        
	  //key is same but value is replaced with existing value or current value
	  hm.put(12, "this is second number"); // duplicate value is allowed but duplicate is not allowed.
	  hm.put(12, null);
	  System.out.println(hm.get("Name"));
	  System.out.println(hm);
	  
	  System.out.println("---------------HashTable-----------------------------------------"); 
	  // it doesn't allow any null values (key, value)
	  //
	  
	  Hashtable  ht = new Hashtable();
	  ht.put("Name", "ram");
	  ht.put("address", "abcd");
	  ht.put("Designation", "Qa");
	  ht.put(true, "yes");    //  boolean value is accepted
	  ht.put(11, "this is a number");
//	  ht.put(null, "this is a null value"); //only one null value is allowed
//	  ht.put(12, null); // does not allow
	  ht.put(11, "this is second number");     
	  ht.put(11, "this is second number");  // duplicate value is not allowed
	  //key is same but value is replaced with existing value or current value
	  ht.put(12, "this is second number"); // duplicate value is allowed but duplicate is not allowed.
	  ht.put(13, 13);
	  
	 
	  System.out.println(ht);
	  
	  
	  
   }
	
	
	
	
}


import java.util.*;  
class TestCollection1{  
 public static void main(String args[]){  
  ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist  
  list.add(10);//Adding object in arraylist  
  list.add(20);  
  list.add(30);  
  list.add(40);  
  //Traversing list through Iterator  
 /* Iterator <Integer>itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  */
 // }  
  for(Integer inte:list){
	  System.out.println(inte);
  }
 }  
} 



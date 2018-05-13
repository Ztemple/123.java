# 123.java
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String arg[]) throws IOException
     {
	  Scanner scan=new Scanner(System.in);
      TreeMap<String,String> tab1 = new TreeMap<String,String>(); 
      //TreeMap<String,String> tab2 = new TreeMap<String,String>(); 
      TreeMap<Long,String> tab2 = new TreeMap<Long,String>(); 
      while(scan.hasNext()){    	 
    	 int n=scan.nextInt();
    	 if(n==0)break;
    	 String[] name=new String[10000];
    	 String[] num=new String[10000];
    	 String temp=null;
    	 String str1,str2;
    	 for(int i=0;i<n;i++)
    	 {
    		 name[i]=scan.next(); 
    	 } 
    	 for(int j=0;j<n;j++)
    	 {
    		 num[j]=scan.next();
    	 }
    	 for(int p=0;p<n;p++)
    	 {
    		  for(int q=0;q<n;q++)
    		 {
        	     str1=num[q];
        	     str2=num[q+1];
    			 if(str1.compareTo(str2)>0)
    			 {
    				 temp=num[q];
    				 num[q]=num[q+1];
    				 num[q+1]=temp;
    			 }
    		tab1.put(name[p], num[p]);
    		 //tab2.put(num[p], name[p]);
        
    		 }
    	 }
    	 Long b=(long) 0;
    	 for(int a=0;a<n;a++)
    	 {
    		 b++;
    		 tab2.put(b, num[a]);
    	 }
    	 Iterator iter1 = tab1.keySet().iterator();
    	 Iterator iter2 = tab2.keySet().iterator();
    	 while(iter1.hasNext()&&iter2.hasNext()) {
    		 Object key1 = iter1.next();
    		 Object key2 = iter2.next();
    		 System.out.println(key1.toString()+" "+key2.toString()); 

    	 }  	    	 
 }
 }
}
           
           
       
  
 

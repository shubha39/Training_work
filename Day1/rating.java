public class rating 
{ 
 public static void main(String []args) 
 { 
 double[] rating ={9.6,9.6,3.8,10.5,8.4,9.2,10.5,9.6,9.6};  
 double value=0; 
 int count=0; 
 // int count1=0;
 for(int i=0;i<rating.length-1;i++) 
 { 
 int count1=0; 
 for(int j=0;j<rating.length;j++) 
 { 
 if(rating[i]==rating[j]) 
 { 
 count1++; 
 //value=rating[i]; 
 } 
 } 
 if(count1>count) 
 { 
 count=count1; 
 value=rating[i]; 
 } 
 } 
 System.out.println("Most frequently rating occured"+value);  System.out.println("Count is "+count);
 }
}
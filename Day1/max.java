class max 
{ 
public static void main(String []args) 
{ 
int[] sale={120,780,560,100,230,450}; 
int max_sales=Integer.MIN_VALUE; 
int max_day=Integer.MIN_VALUE; 
for(int i=0;i<sale.length;i++) 
{ 
if(sale[i]>max_sales){ 
max_sales=sale[i]; 
max_day=i; 
} 
} 
System.out.println("Maximum sales of the day "+max_day); } 
} 

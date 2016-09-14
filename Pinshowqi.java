package pishowqi;
import java.util.*;
public class Pinshowqi {
	 public static void main(String []args) {
		Scanner p=new Scanner(System.in);
		System.out.print("请输入总金额：");
		float sum=p.nextInt();
		Scanner q=new Scanner(System.in);
		System.out.print("请输入红包个数：");
		int num=q.nextInt();
		int i;	
		int x;
		int all=0;
		int[] y = new int[num]; 
		float[] result= new float[num];
		float[] lastresult= new float[num];
		for(i=0;i<num;++i){
			x=(int)(Math.random()*100);
			y[i]=x;	
			all=all+x;
		}
		lastresult[num-1]=sum;
		for(i=0;i<num-1;++i){
			result[i]=sum*y[i]/all;			  		
			lastresult[i]=(float)(Math.round(result[i]*100))/100;
			lastresult[num-1]-=lastresult[i];}
		    lastresult[num-1]=(float)(Math.round(lastresult[num-1]*100))/100;
		    
		for(i=0;i<num;++i)
			
		    System.out.println(lastresult[i]+"元");  					
}}

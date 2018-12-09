import java.io.*;
public class Student {
     String name[]=new String[5];
     char grade[]=new char[5];
     double test[][]=new double[5][4];
     String getname(int p)
     {
    	 return name[p];
     }
     double average_score( int p)
     {
    	 
    	 double sum=0;
    	 for(int i=0;i<4;i++)
    	 {
    		 
    		 sum+=test[p][i];
    	 }
    	 double avg=sum/4;
    	 if(avg>=90&&avg<=100)
    		 grade[p]='A';
    	 else if(avg>=80&&avg<=89)
    		 grade[p]='B';
    	 else if(avg>=70&&avg<=79)
    		 grade[p]='C';
    	 else if(avg>=60&&avg<=69)
    		 grade[p]='D';
    	 else
    		 grade[p]='E';
    	 return avg;
     }
     char getgrade(int p)
     {
    	 return grade[p];
     }
     
}

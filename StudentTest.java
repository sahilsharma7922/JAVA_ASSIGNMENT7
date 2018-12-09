import java.util.*;
public class StudentTest {

	public static void main(String arg[])
	{
		Student se=new Student();
        Scanner ke=new Scanner(System.in);
        System.out.println("Enter the student details:");
        for(int i=0;i<5;i++)
        {
        	System.out.println("Enter the student name:");
        	se.name[i]=ke.next();
        	System.out.println("Enter the test scores:");
        	for(int j=0;j<4;j++)
        	{
        		try {
        		se.test[i][j]=ke.nextDouble();
        		if(se.test[i][j]>100||se.test[i][j]<0)
        			throw new TestException("enter again:");
        		}
        		catch(TestException ex)
        		{
        		System.out.println(ex.getMessage());
        		j--;
        		}
        		
        	}
        }
        System.out.println("Student details:");
        for(int i=0;i<5;i++)
        {
        	System.out.print("Stdudent Name:"+se.getname(i)+"\r\n");
        	double avg=se.average_score(i);
        	System.out.print("Average score of student:"+avg+"\r\n");
        	System.out.println("Grade of student:"+se.getgrade(i)+"\r\n");
        }
	}
}

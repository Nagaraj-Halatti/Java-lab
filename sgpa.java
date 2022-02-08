import java.util.*;
class student{
   
    int marks[]= new int[10];
    int cred[]=new int[10];
    int grade[]=new int[10];
    String name;
    String usn;
    void accept()
    {
     
      Scanner sc= new Scanner(System.in);
      System.out.println("enter name");
      name=sc.next();
      System.out.println("enter USN");
      usn=sc.next();
      System.out.println("enter marks in 5 subjects");
      for(int i=0;i<5;i++)
         marks[i]=sc.nextInt();
      System.out.println("enter credits of 5 subjects");
      for(int i=0;i<5;i++)
         cred[i]=sc.nextInt();
    }
    void display()
    {
      
      System.out.println("Name :"+name);
      System.out.println("USN :"+usn);
      System.out.println("Subjects     Marks   Credits");
      for(int i=0;i<5;i++)
         System.out.println("Subject "+(i+1)+"    "+marks[i]+"        "+cred[i]);
    }
       
    float sgpa()
    {
       int totalcred=0;
       float sum=0;
       float sgpa;
       for(int i=0;i<5;i++)
         totalcred+=cred[i];
       for(int i=0;i<5;i++)
       {
          if(marks[i]<40)
             grade[i]=0;
          else if(marks[i]==100)
             grade[i]=10;
          else
             grade[i]=(marks[i]/10)+1;
       }
       for(int i=0;i<5;i++)
         sum+=(cred[i]*grade[i]);
       sgpa=sum/totalcred;
       return sgpa;
    }
}
class sgpa{
    

    public static void main(String args[])
    {
        student s= new student();
        s.accept();
        s.display();
        System.out.println("The SGPA is "+s.sgpa());
    }

}

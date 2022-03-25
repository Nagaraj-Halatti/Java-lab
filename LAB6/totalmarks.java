import CIE.*;
import SEE.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

class totalmarks{
    public static void main(String[] args) {
        int i , j ,n;
        Scanner sc = new Scanner(System.in);
        int total[] = new int[5];
        System.out.println("Enter the number of students: ");
        n = sc.nextInt();
        CIE.student s[] = new CIE.student[n];
        CIE.internals ci[]= new CIE.internals[n];
        SEE.external se[]= new SEE.external[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter student"+(i+1)+"details");
            s[i] = new CIE.student();
            s[i].accept();
            ci[i] = new CIE.internals();
            ci[i].accept();
            se[i] = new SEE.external();
            se[i].accept();

        }
        for(i=0;i<n;j++)
        {
            System.out.println("Details of student"+(i+1));
            s[i].display();
            for(j=0;j<5;j++)
            {
                total[j] = ci[i].ciem[j]+se[i].seem[j];
                System.out.println("Total marks in subject"+(j+1)+":"+total[j]);
            }
            System.out.println();
        }
    }
}

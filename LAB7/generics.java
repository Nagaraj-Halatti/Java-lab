import java.util.Scanner;
class multiple<T,V>{
    T obj1;
    V obj2;
    multiple(T o1,V o2){
        obj1= o1;
        obj2=o2;
    }
    void showtype(){
        System.out.println("Type of first data:"+obj1.getClass().getName());
        System.out.println("Type of second data:"+obj2.getClass().getName());
    }
    T getobj1(){
        return obj1;
    }
    V getobj2(){
        return obj2;
    }
}
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        System.out.print("Enter a integer:");
        int i=sc.nextInt();
        multiple<String , Integer> ob;
        ob = new multiple<>(s,i);
        System.out.println("The value of 1st variable is: "+ob.getobj1());
        System.out.println("The value of 2nd variable is: "+ob.getobj2());
        ob.showtype();
    }
}

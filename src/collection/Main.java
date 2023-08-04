package collection;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        students s1=new students("AJAY");
        students s2=new students("ASWIN");
        students s3=new students("ASHOK");

        ArrayList<students> array1 = new ArrayList<>();
        array1.add(s1);
        array1.add(s2);
        array1.add(s3);

        for (students obj : array1) {
            System.out.println(obj.name);
        }
    }
}

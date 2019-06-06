package com.wbl.Programs;

public class CompareTwoObjects {
	String a;

    public CompareTwoObjects(String ax) {
        a = ax;
    }

    public boolean equals(Object object2) {
        if(a == object2) { 
            return true;
        }
        else return false;
    }

    public boolean equals2(Object object2) {
        if(a.equals(object2)) {
            return true;
        }
        else return false;
    }



    public static void main(String[] args) {

    	CompareTwoObjects object1 = new CompareTwoObjects("test ");
    	CompareTwoObjects object2 = new CompareTwoObjects("test");

        object1.equals(object2);
        System.out.println(object1.equals(object2));

        object1.equals2(object2);
        System.out.println(object1.equals2(object2));
    }


}

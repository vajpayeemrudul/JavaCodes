package oop_practice;

public class TwoWheeler extends Automobile {
    float price;
    String color;
    int mileage;
    
    TwoWheeler(int mn,String name,int year,float p, String c,int m)
    {
    	super(mn,name,year);
    	price=p;
    	color=c;
    	mileage=m;
    }
    void display()
    {
    	System.out.println(super.model_num+" "+super.model_name+" "+super.rel_yr);
    	System.out.println(price+" "+color+" "+mileage);
    	System.out.println();
    }
}

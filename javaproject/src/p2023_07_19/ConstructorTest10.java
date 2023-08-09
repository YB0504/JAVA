package p2023_07_19;

class MyDate10{   

  private int year;    
  private int month;    
  private int day;

  public MyDate10(){
    this(2023, 1, 1);                   
  }  
  public MyDate10(int new_year){
    this(new_year, 1, 1);                
  }  
  public MyDate10(int new_year, int new_month){
     this(new_year, new_month, 1);    
  }  
public MyDate10(int new_year,int new_month,int new_day){
    year=new_year;
    month=new_month;
    day=new_day;
  }    

  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}

public class ConstructorTest10 {     
  public static void main(String[] args) {
    MyDate10 d=new MyDate10(2023, 7, 19);  
    d.print();
    MyDate10 d2=new MyDate10(2023, 7);     
    d2.print();
    MyDate10 d3=new MyDate10(2023);       
    d3.print();
    MyDate10 d4=new MyDate10();          
    d4.print();
  }
}
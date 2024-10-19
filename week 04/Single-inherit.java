import java.util.*;
 class student{

	
	static int id=508;
	
	static String name="siva";
	
	 void display(){
	    System.out.println("name="+name+"and his id="+id);
	    }
	    }
 class marks extends student{
	
	 int java_marks,maths_marks,uhv_marks,dbms_marks,dlco_marks,es_marks;
	public void inpt(){
	Scanner s=new Scanner(System.in);
	 System.out.println("enter java mid marks");
	 java_marks=s.nextInt();
	 System.out.println("enter maths mid marks");
	 maths_marks=s.nextInt();
	 System.out.println("enter DBMS mid marks");
	 dbms_marks=s.nextInt();
	  System.out.println("enter UHV mid marks");
	 uhv_marks=s.nextInt();
	  System.out.println("enter ES mid marks");
	  es_marks=s.nextInt();
	  System.out.println("enter DLCO mid marks");
	 dlco_marks=s.nextInt();
	}
	 public void show_marks(){
	 	System.out.println(name+"\'s marks:  ");
	 	System.out.println("java mid marks: "+java_marks);
	 	System.out.println("maths mid marks: "+maths_marks);
	 	System.out.println("DBMS mid marks: "+dbms_marks);
	 	System.out.println("UHV mid marks: "+uhv_marks);
	 	System.out.println("ES mid marks: "+es_marks);
	 	System.out.println("DLCO mid marks: "+dlco_marks);
	 	}}
	  class exp{
	 	public static void main(String[] args){
	 		marks obj=new marks();
	 		obj.inpt();
	 		obj.show_marks();
	 		}
	 		}
	     
	 

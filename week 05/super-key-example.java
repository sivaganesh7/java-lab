class animal{
    int age=20;

    // animal(){
    //     System.out.println("this is animal class");
    // }
    
    animal(String name){
        System.out.println("animal name is: "+name);
    }
    void eat(){
        System.out.println("animal is eating");
    }
}
class dog extends animal{
   
    dog(){//constructor
        super("cat");
        System.out.println("this is dog class");
    }
    int age=30;
    void display(){
        System.out.println("animal age is: "+super.age);
        System.out.println("dog age is: "+age);
    }
    void bark(){
        System.out.println("dog barking");
    }
}
public class superjava{
    public static void main(String[] args) {
    dog d=new dog();
    d.eat();
    d.bark();  
    d.display();   
}}

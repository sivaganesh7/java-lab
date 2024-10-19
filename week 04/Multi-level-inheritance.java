class animal{
    void makesound(){
        System.out.println("animal is making sound");
    }
}
class dog extends animal{
    void makesound(){//overriding parent class animal
        System.out.println("dog making sound as woof");
    }
}
class puppy extends dog{
    void makesound(){//overriding parent class dog
        System.out.println("puppy make sound as yap!");
    }
} 
public class multi_inheritance{
    public static void main(String[] args) {
    puppy p=new puppy();
        animal a=new animal();
        dog d=new dog();
        p.makesound();
        d.makesound(); 
        a.makesound();
      
}}

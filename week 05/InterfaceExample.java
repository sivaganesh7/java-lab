interface shape{
    void area();
} 
interface coloring{
    void colour(String c);
}
class rectangle implements shape,coloring{
    double l,b;
    rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    
    public void area(){
        System.out.println("area of rectangle: "+(l*b));
    }
    public void colour(String c){
        String col=c;
        System.out.println("rectangle color is :"+col);
    }
}
class circle implements shape,coloring{
    int r;
    circle(int r){
        this.r=r;
        //this.b=b;
    }
    public void area(){
        System.out.println("area of circle: "+(3.14*r*r));
    }
   public void colour(String c){
        String col=c;
        System.out.println("rectangle color is :"+col);
   }
}
public class interfaces{
    public static void main(String[] args) {
        rectangle r=new rectangle(10, 5);
        circle c=new circle(2);
        
        r.area();
        r.colour("red");
     
        c.area();
        c.colour("green");
    }
}

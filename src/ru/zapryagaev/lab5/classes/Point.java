package ru.zapryagaev.lab5.classes;
import ru.zapryagaev.lab5.ifaces.*;
/**
Класс описывающий элемент "Точка"
*/
public class Point implements Movable, Symmetry{
    private String name="Точка";
    private double x, y, z;
    private int id;
    private static int nextId=1;
    
    {  id = nextId++; }
    
    public Point(double x, double y, double z){ // первый конструктор
        this.x=x; 
        this.y=y;
        this.z=z;
    } 
    
    public Point(Point p){  // второй конструктор
        this(p.getX(),p.getY(),p.getZ()); // вызов первого конструктора
    } 
    
    public int getId(){ 
        return id; 
    } 
    
    public String getName(){ 
        return name; 
    } 
    
    public void setName(String n){ 
        name=n; 
    } 
    
    public double getX(){ 
        return x; 
    }
    
    public double getY(){ 
        return y; 
    }
    
    public double getZ(){ 
        return z; 
    }
  
     
    protected void setPoint(Point p){
        x=p.getX();
        y=p.getY();
        z=p.getZ();
    }
    
      @Override
    public void move(Point p) {
        setPoint(p);
            }   
   
   public double distance(double x, double y, double z){ // первый метод для расстояния
        double dx=this.x-x; 
        double dy=this.y-y; 
        double dz=this.z-z;
        return Math.sqrt(dx*dx+dy*dy+dz*dz); 
    }
    
    public double distance(Point p){  // второй метод для расстояния
        return distance(p.getX(),p.getY(), p.getZ()); 
    }
    
      @Override 
    public String toString(){
        return "id="+id+",    "+name+" ("+x+","+y+","+z+") ;\n" ;
    }      
   
      @Override
    public void simetry() {
     x=-x; y=-y; z=-z;
       
    }
}

    

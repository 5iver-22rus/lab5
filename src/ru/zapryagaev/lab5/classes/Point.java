package ru.zapryagaev.lab5.classes;
import ru.zapryagaev.lab5.ifaces.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
Класс описывающий элемент "Точка"
*/
public class Point implements Movable, Symmetry{
    private String name="Точка";
    private double x, y, z;
    private int id;
    private static int nextId=1;
    private Date date;
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

    public Date getDate(){
        return date;
    }

    protected void setPoint(Point p){
        x=p.getX();
        y=p.getY();
        z=p.getZ();
        date=new Date();
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
        SimpleDateFormat format1 = new SimpleDateFormat("  Дата создания: dd.MM.yyyy hh:mm:ss");
        return "id="+id+",    "+name+" ("+x+","+y+","+z+")  "+format1.format(date)+" ;\n" ;
    }

      @Override
    public void simetry() {
     x=-x; y=-y; z=-z;

    }
}



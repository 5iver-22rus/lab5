package ru.zapryagaev.lab5.classes;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
Класс описывающий объект "Треугольник"
*/
public class Triangle extends Point{
    private double x0,y0,z0,x1,y1,z1,x2,y2,z2;
    private double square;
    private double perimeter;
    private Date date;

    public Triangle(double x0, double y0, double z0, double x1, double y1, double z1, double x2, double y2, double z2)
    {   super((x0+x1+x2)/3, (y0+y1+y2)/3, (z0+z1+z2)/3);
        this.setName("Треугольник");
        this.x0=x0;
        this.y0=y0;
        this.z0=z0;
        this.x1=x1;
        this.y1=y1;
        this.z1=z1;
        this.x2=x2;
        this.y2=y2;
        this.z2=z2;
        perimetr_squareVal();
        date=new Date();
    }
      @Override
    public void move(Point p) {
        double dx = p.getX() - getX();
        double dy = p.getY() - getY();
        double dz = p.getZ() - getZ();
        x0 = x0 + dx;
        y0 = y0 + dy;
        z0 = z0 + dz;
        x1 = x1 + dx;
        y1 = y1 + dy;
        z1 = z1 + dz;
        x2 = x2 + dx;
        y2 = y2 + dy;
        z2 = z2 + dz;
        setPoint(p);
    }
    @Override
    public void simetry() {
       x0=-x0;
       y0=-y0;
       z0=-z0;
       x1 = -x1;
       y1 = -y1;
       z1 = -z1;
       x2 = -x2;
       y2 = -y2;
       z2 = -z2;

    }

    private void perimetr_squareVal(){
        double a=Math.sqrt((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1)+(z0-z1)*(z0-z1));
        double b=Math.sqrt((x0-x2)*(x0-x2)+(y0-y2)*(y0-y2)+(z0-z2)*(z0-z2));
        double c=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
        perimeter=a+b+c;
        square=Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
    }

     public double getX0(){
        return x0;
    }

    public double getY0(){
        return y0;
    }

    public double getZ0(){
        return z0;
    }

    public double getX1(){
        return x1;
    }
    public double getY1(){
        return y1;
    }

   public double getZ1(){
        return z1;
    }

    public double getX2(){
        return x2;
    }
    public double getY2(){
        return y2;
    }

   public double getZ2(){
        return z2;
   }

   public double getSquare(){
        return square;
   }

   public double getPerimeter(){
        return perimeter;
   }

   @Override
   public String toString(){
        SimpleDateFormat format1 = new SimpleDateFormat("  Дата создания: dd.MM.yyyy hh:mm:ss");
        return "id="+this.getId()+",   "+this.getName()+"   ("+x0+","+y0+","+z0+")   -   ("+x1+","+y1+","+z1+") "
                + "- ("+x2+","+y2+","+z2+") , Периметр="+ perimeter+"  Площадь= "+square+" "+format1.format(date)+"\n";

   }

}

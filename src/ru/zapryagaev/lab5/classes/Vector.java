package ru.zapryagaev.lab5.classes;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
Класс описывающий объект "Вектор"
*/
public class Vector extends Point{
    private double x0,y0,z0,x1,y1,z1;
    private double length; // длина отрезка
    private double ox, oy, oz;
    private Date date;

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

    public Vector(double x0, double y0, double z0, double x1, double y1, double z1){ // конструктор
        super((x0+x1)/2, (y0+y1)/2, (z0+z1)/2);
        this.setName("Вектор");
        this.x0=x0;
        this.y0=y0;
        this.z0=z0;
        this.x1=x1;
        this.y1=y1;
        this.z1=z1;
        calcLength();
        anglesVal();
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
           }

    private void calcLength(){
        double dx=x0-x1;
        double dy=y0-y1;
        double dz=z0-z1;
        length = Math.sqrt(dx*dx+dy*dy+dz*dz);
    }

    private void anglesVal(){
        double x, y, z;
        x=x1-x0;
        y=y1-y0;
        z=z1-z0;
        double cos_ox=x/(Math.sqrt(x*x+y*y+z*z));
        double cos_oy=y/(Math.sqrt(x*x+y*y+z*z));
        double cos_oz=z/(Math.sqrt(x*x+y*y+z*z));
        ox=Math.toDegrees(Math.acos(cos_ox));
        oy=Math.toDegrees(Math.acos(cos_oy));
        oz=Math.toDegrees(Math.acos(cos_oz));
    }

    public double getLength(){
        return length;
    }

    @Override
    public String toString(){
 SimpleDateFormat format1 = new SimpleDateFormat("  Дата создания: dd.MM.yyyy hh:mm:ss");
 return   "id="+this.getId()+",   "+this.getName()+"   ("+x0+","+y0+","+z0+")   -   ("+x1+","+y1+","+z1+"), длина="+Math.round(length*100)/100f +
         "  Углы наклона к осям: оx="+ox+";  оy="+oy+"; oz="+oz+"  "+format1.format(date)+".\n";
    }

}

package ru.zapryagaev.lab5.classes;
/**
Класс описывающий объект "Четырехугольник"
*/
public class Quadrangle extends Point{
   private double x0,y0,z0,x1,y1,z1,x2,y2,z2,x3,y3,z3;
   private double perimeter;    
    
     public Quadrangle(double x0, double y0, double z0, double x1, double y1, double z1,
             double x2, double y2, double z2, double x3, double y3, double z3)
    {   super((x0+x1+x2+x3)/4, (y0+y1+y2+y3)/4, (z0+z1+z2+z3)/4);     
        this.setName("Четырехугольник"); 
        this.x0=x0;
        this.y0=y0;
        this.z0=z0;
        this.x1=x1;
        this.y1=y1;
        this.z1=z1;
        this.x2=x2;
        this.y2=y2;
        this.z2=z2;
        this.x3=x3;
        this.y3=y3;
        this.z3=z3;
        perimetr_squareVal();
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
        x3 = x3 + dx;
        y3 = y3 + dy;
        z3 = z3 + dz;
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
       x3 = -x3;
       y3 = -y3;
       z3 = -z3;
       
    }
    
    private void perimetr_squareVal(){
        double a=Math.sqrt((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1)+(z0-z1)*(z0-z1));
        double b=Math.sqrt((x0-x2)*(x0-x2)+(y0-y2)*(y0-y2)+(z0-z2)*(z0-z2));
        double c=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)+(z1-z3)*(z1-z3));
        double d=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)+(z3-z2)*(z3-z2));
        perimeter=a+b+c+d;     
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
      public double getX3(){ 
        return x3; 
    } 
    public double getY3(){ 
        return y3; 
    } 
   
   public double getZ3(){ 
        return z3; 
   }
      
   public double getPerimeter(){ 
        return perimeter; 
   }
   
   @Override
   public String toString(){
        return "id="+this.getId()+",   "+this.getName()+"   ("+x0+","+y0+","+z0+")   -   ("+x1+","+y1+","+z1+") "
                + "- ("+x2+","+y2+","+z2+") - ("+x3+","+y3+","+z3+") , Периметр="+ perimeter+"\n";
       
   }
        
    
    
    
    
    
    
}

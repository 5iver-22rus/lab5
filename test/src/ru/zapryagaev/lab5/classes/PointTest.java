package ru.zapryagaev.lab5.classes;
import static org.junit.Assert.*;
import org.junit.Test;




public class PointTest {
   
    @Test
    public void testDistance(){
     System.out.println("Проверка метода distance()"); 
        Point p = new Point(3,4,0); 
        assertEquals(5, p.distance(0,0,0),0.00001); 
}

    @Test
    public void testValues()
    {Point p = new Point(1,2,3);
    assertEquals(1,p.getX(),0.0000001);
    assertEquals(2,p.getY(),0.0000001);
    assertEquals(3,p.getZ(),0.0000001);
    assertEquals("Точка",p.getName());
    }
    
    @Test
    public void testMove(){
    Point p = new Point(1,2,3);
    Point a = new Point(3,2,1);
    p.move(a);
    assertEquals(3,p.getX(),0.0000001);
    assertEquals(2,p.getY(),0.0000001);
    assertEquals(1,p.getZ(),0.0000001);
    }
    
    @Test
    public void testSymmetry(){
    Point p = new Point(1,2,3);
    p.simetry();
    assertEquals(-1,p.getX(),0.0000001);
    assertEquals(-2,p.getY(),0.0000001);
    assertEquals(-3,p.getZ(),0.0000001);
    }
    
}

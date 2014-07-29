package ru.zapryagaev.lab5.classes;
import org.junit.Test;
import static org.junit.Assert.*;
/**Класс для тестирования класса Triangle
*/

public class TriangleTest {
 
    @Test
    public void testValue(){
        Triangle t=new Triangle(1,1,1,3,3,3, 2,2,2);
        assertEquals(1,t.getX0(),0.0000001);
        assertEquals(1,t.getY0(),0.0000001);
        assertEquals(1,t.getZ0(),0.0000001);
        assertEquals(3,t.getX1(),0.0000001);
        assertEquals(3,t.getY1(),0.0000001);
        assertEquals(3,t.getZ1(),0.0000001);
        assertEquals(2,t.getX2(),0.0000001);
        assertEquals(2,t.getY2(),0.0000001);
        assertEquals(2,t.getZ2(),0.0000001);
        assertEquals(25.45584412271571,t.getSquare(),0.0000001);    
        assertEquals(6.928203230275509,t.getPerimeter(),0.0000001);
        assertEquals("Треугольник",t.getName());
    }
    
    @Test
    public void testMove() {
      Triangle t=new Triangle(1,1,1,3,3,3, 2,2,2);  
      Point p=new Point(1,1,1);
        t.move(p);      
        assertEquals(0,t.getX0(),0.0000001);
        assertEquals(0,t.getY0(),0.0000001);
        assertEquals(0,t.getZ0(),0.0000001);
        assertEquals(2,t.getX1(),0.0000001);
        assertEquals(2,t.getY1(),0.0000001);
        assertEquals(2,t.getZ1(),0.0000001);
        assertEquals(1,t.getX2(),0.0000001);
        assertEquals(1,t.getY2(),0.0000001);
        assertEquals(1,t.getZ2(),0.0000001);
    }
    
    @Test
    public void testSymmetry(){
     Triangle t=new Triangle(1,1,1,3,3,3, 2,2,2);  
      t.simetry();
        assertEquals(-1,t.getX0(),0.0000001);
        assertEquals(-1,t.getY0(),0.0000001);
        assertEquals(-1,t.getZ0(),0.0000001);
        assertEquals(-3,t.getX1(),0.0000001);
        assertEquals(-3,t.getY1(),0.0000001);
        assertEquals(-3,t.getZ1(),0.0000001);
        assertEquals(-2,t.getX2(),0.0000001);
        assertEquals(-2,t.getY2(),0.0000001);
        assertEquals(-2,t.getZ2(),0.0000001);   
    }
   
}

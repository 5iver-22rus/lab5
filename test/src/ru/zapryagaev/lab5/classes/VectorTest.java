package ru.zapryagaev.lab5.classes;
import org.junit.Test;
import static org.junit.Assert.*;
/**Класс для тестирования класса вектор
*/

public class VectorTest {
   
    @Test
    public void testValues(){
       Vector v = new Vector(1,1,5,8,3,2);
        assertEquals(1,v.getX0(),0.0000001);
        assertEquals(1,v.getY0(),0.0000001);
        assertEquals(5,v.getZ0(),0.0000001);
        assertEquals(8,v.getX1(),0.0000001);
        assertEquals(3,v.getY1(),0.0000001);
        assertEquals(2,v.getZ1(),0.0000001);
        assertEquals(7.87,v.getLength(),0.01);
        assertEquals("Вектор",v.getName());
    }
    
    @Test
    public void testMove(){
        Vector v = new Vector(1,1,5,8,3,2);
        Point p=new Point(1,1,1);
        v.move(p);
        assertEquals(-2.5,v.getX0(),0.0000001);
        assertEquals(0.0,v.getY0(),0.0000001);
        assertEquals(2.5,v.getZ0(),0.0000001);
        assertEquals(4.5,v.getX1(),0.0000001);
        assertEquals(2.0,v.getY1(),0.0000001);
        assertEquals(-0.5,v.getZ1(),0.0000001);
    }
    
    @Test
    public void testSymmetry(){
       Vector v = new Vector(1,1,5,8,3,2);
       v.simetry();
        assertEquals(-1,v.getX0(),0.0000001);
        assertEquals(-1,v.getY0(),0.0000001);
        assertEquals(-5,v.getZ0(),0.0000001);
        assertEquals(-8,v.getX1(),0.0000001);
        assertEquals(-3,v.getY1(),0.0000001);
        assertEquals(-2,v.getZ1(),0.0000001);
    }
   
}

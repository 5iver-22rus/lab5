package ru.zapryagaev.lab5;

import ru.zapryagaev.lab5.classes.*;
import ru.zapryagaev.lab5.ifaces.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
*Программа для работы с классами В   трехмерном   пространстве:   точка,   вектор,     треугольник,   четырехугольник
*Выполнил студент: 7ИВТ(с)-21 Запрягаев Р.А.
* @author Zapryagaev
*
*/
public class Lab5 {

   public static List<Point> list;
   /**
    * Первичная инициализация объектов*/
   public static void init(){
       list=new ArrayList<>();
       list.add(new Point(3,4,5));
       list.add(new Triangle(1,1,1,3,3,3, 2,2,2));
       list.add(new Quadrangle(1,1,5,8,7,9,4,1,5,6,7,2));
       list.add(new Vector(1,1,5,8,3,2));
       list.add(new Point(2,2,7));
       list.add(new Vector(4,7,5,5,6,0));
       list.add(new Quadrangle(2,2,8,4,6,2,8,5,3,2,1,1));
       list.add(new Triangle(5,4,3,3,4,5, 1,3,4));
       list.add(new Point(9,8,5));
       list.add(new Quadrangle(3,3,4,8,3,1,7,1,9,4,3,3));
         }
    /**
     * Функция добавления объектов
     *
     */
   public static void adding(){
       double ax, ay, az, bx, by, bz, cx, cy, cz, dx, dy, dz;
       int index;
       Scanner in = new Scanner(System.in);
       System.out.println();
       System.out.println("Выберите тип фигуры :");
       System.out.println("--------------------------------------------------");
       System.out.println("1 - Точка");
       System.out.println("2 - Вектор");
       System.out.println("3 - Треугольник");
       System.out.println("4 - Четырехугольник");
       System.out.println("--------------------------------------------------");
       String number = in.nextLine();
       if (number.equals("1"))
               {System.out.println("Введите координаты x, y, z точки:");
               ax=Double.parseDouble(in.nextLine());
               ay=Double.parseDouble(in.nextLine());
               az=Double.parseDouble(in.nextLine());
               System.out.println("Введите номер в списке:");
               index=Integer.parseInt(in.nextLine());
               list.add(index-1, new Point(ax, ay, az));
               }
       else if (number.equals("2"))
                {System.out.println("Введите координаты x, y, z точки a:");
                ax=Double.parseDouble(in.nextLine());
                ay=Double.parseDouble(in.nextLine());
                az=Double.parseDouble(in.nextLine());
                System.out.println("Введите координаты x, y, z точки b:");
                bx=Double.parseDouble(in.nextLine());
                by=Double.parseDouble(in.nextLine());
                bz=Double.parseDouble(in.nextLine());
                System.out.println("Введите номер в списке:");
                index=Integer.parseInt(in.nextLine());
                list.add(index-1, new Vector(ax, ay, az, bx, by, bz));
                }
       else if (number.equals("3"))
                {System.out.println("Введите координаты x, y, z точки a:");
                ax=Double.parseDouble(in.nextLine());
                ay=Double.parseDouble(in.nextLine());
                az=Double.parseDouble(in.nextLine());
                System.out.println("Введите координаты x, y, z точки b:");
                bx=Double.parseDouble(in.nextLine());
                by=Double.parseDouble(in.nextLine());
                bz=Double.parseDouble(in.nextLine());
                System.out.println("Введите координаты x, y, z точки c:");
                cx=Double.parseDouble(in.nextLine());
                cy=Double.parseDouble(in.nextLine());
                cz=Double.parseDouble(in.nextLine());
                System.out.println("Введите номер в списке:");
                index=Integer.parseInt(in.nextLine());
                list.add(index-1, new Triangle(ax, ay, az, bx, by, bz, cx, cy, cz));
                }
       else if (number.equals("4"))
                {System.out.println("Введите координаты x, y, z точки a:");
                ax=Double.parseDouble(in.nextLine());
                ay=Double.parseDouble(in.nextLine());
                az=Double.parseDouble(in.nextLine());
                System.out.println("Введите координаты x, y, z точки b:");
                bx=Double.parseDouble(in.nextLine());
                by=Double.parseDouble(in.nextLine());
                bz=Double.parseDouble(in.nextLine());
                System.out.println("Введите координаты x, y, z точки c:");
                cx=Double.parseDouble(in.nextLine());
                cy=Double.parseDouble(in.nextLine());
                cz=Double.parseDouble(in.nextLine());
                System.out.println("Введите координаты x, y, z точки d:");
                dx=Double.parseDouble(in.nextLine());
                dy=Double.parseDouble(in.nextLine());
                dz=Double.parseDouble(in.nextLine());
                System.out.println("Введите номер в списке:");
                index=Integer.parseInt(in.nextLine());
                list.add(index-1, new Quadrangle(ax, ay, az, bx, by, bz, cx, cy, cz, dx, dy, dz));
                }
       System.out.println("Фигура добавлена");
   }
  /**
   * Удаление объектов по id с использованием интерфейса итератор*/
   public static void del()
   {int id;
   Scanner in = new Scanner(System.in);
   System.out.println("Введите id Удаляемого объекта: ");
   id=in.nextInt();
  Iterator <Point> it=list.iterator();
   while (it.hasNext())
   {Point p=it.next();
   if (p.getId()==id)
   {it.remove();}
   }
   }
    /**
     * Главная функция
     * @return
     */
    public static void main(String[] args) {
      init();
      Scanner in = new Scanner(System.in);
      for(;;){ // начинаем бесконечный цикл
          System.out.println();
          System.out.println("Выберите тип сортировки (выйти - пустая строка):");
          System.out.println("--------------------------------------------------");
          System.out.println("0 - Добавить объект");
          System.out.println("1 - Сортировка по возраcтанию id");
          System.out.println("2 - Сортировка по убыванию id");
          System.out.println("3 - Сортировка по возраcтанию имени");
          System.out.println("4 - Сортировка по убыванию имени");
          System.out.println("5 - Сортировка по возрастанию удаленности от начала координат");
          System.out.println("6 - Сортировка по убыванию удаленности от начала координат");
          System.out.println("7 - Сдвиг на вектор");
          System.out.println("8 - Симметрия относительно начала координат");
          System.out.println("9 - Удалить фигуру");
          System.out.println("--------------------------------------------------");
        String mode = in.nextLine();
      if (mode.isEmpty()) break; // прерываем цикл, если строка пустая
          boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6");
          int sortMode=0;
          if (mode.equals("3")||mode.equals("4")) sortMode=1;
          else if (mode.equals("5")||mode.equals("6")) sortMode=2;
          Collections.sort(list,new SortMode(sortUp,sortMode));
     if (mode.equals("7"))
         {System.out.println("Введите координату x: ");
          double xv = Double.parseDouble(in.nextLine());
          System.out.println("Введите координату y: ");
          double yv = Double.parseDouble(in.nextLine());
          System.out.println("Введите координату z: ");
          double zv = Double.parseDouble(in.nextLine());
          Point sdvig = new Point( xv ,yv , zv);
          for(Point p: list){
             p.move(sdvig);  }
                   }
     if (mode.equals("8"))
     {for(Point p: list){
             p.simetry();  }
     }
     if (mode.equals("0"))
         adding();
     if (mode.equals("9"))
         del();
        for(Point p: list){
        System.out.println(p);  }

      }

}}
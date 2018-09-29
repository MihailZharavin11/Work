package Candy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Gift {
    private static void sorted(List a) {
        Sweet[] massiv = new Sweet[a.size()];
        List listsorted;


        for (int i = 0; i < a.size(); i++) {
            massiv[i] = (Sweet) a.get(i);
        }

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length-1; j++) {
                if (massiv[j].getSugar()>massiv[j+1].getSugar()){
                    Sweet sweet = massiv[j];
                    massiv[j]=massiv[j+1];
                    massiv[j+1]=sweet;

                }
            }
        }
        for(int i=0;i<massiv.length;i++){
            System.out.println(massiv[i]);
        }
    }
    public static void main(String[] args) {
        int weight=0;
        System.out.println("Вы можете положить в подарок 5 сладостей");
        System.out.println("Вы положили:");
        List<Sweet> s = Arrays.asList(
        new Candy("Roshan",1,2,"Ukraine","Карамелька","Зеленые"),
        new Cake("Irish",2,6,"Ирландия","Заварное пироженое","Сгущенка"),
        new Cookie("Rome",2,4,"Италия","Песочное печенье","Шоколадная крошка"),
        new Candy("Stap",1,3,"Russia","Шоколадная","Нуга"));

        for(int i=0;i<5;i++){
            if(i>=s.size()){
                System.out.println((i+1)+"."+"Пусто");
            }
            else{
                System.out.println((i+1)+"."+s.get(i));
                weight+=s.get(i).getWeight();
            }
        }
        System.out.println("Вес подарка: "+weight +" грамм.");

        System.out.println("");
        System.out.println("Сортировка по кол-ву сахара:");
        Gift.sorted(s);
        }
    }

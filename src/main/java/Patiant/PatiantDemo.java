package Patiant;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class PatiantDemo {
    public static void main(String[] args) {
        /*a) список пациентов, имеющих данный диагноз;
          b) список пациентов, номер медицинской карты которых находится в за-
          данном интервале. */

        Patiant[] patiants = new Patiant[2];
        patiants[0] = new Patiant(0, "Geogrii", "Antonov", "Antonovich", "380663433"
                , "Grip");
        patiants[1] = new Patiant(1, "Michael", "Jordan", "Michael", "398383432",
                "Pneumonia");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите диагноз пациента:");
        String diagnos = scan.nextLine();
        System.out.println("Вы ввели: "+ diagnos);

        System.out.println("Имена пациентов с заданным диагназом: ");

        List<Patiant> patiantList = Arrays.asList(patiants);
        patiantList.stream()
                .filter(c -> c.getDiagnostic().equals(diagnos))
                .map(Patiant::getName)
                .forEach(System.out::println);


        System.out.println("Введите с какого id искать пациента:");
        int a = scan.nextInt();
        System.out.println("Введите по какой id");
        int b = scan.nextInt();

        System.out.println("Список пациентов: ");
        patiantList.stream()
                .filter(c -> c.getId()>=a && c.getId()<=b+1)
                .map(Patiant::getName)
                .forEach(System.out::println);
    }
}
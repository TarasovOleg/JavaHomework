package com.olegTarasov.practice.modul06.task04;

/**
 * Created by Олег on 21.03.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {
        CitizenFactory citizenFactory = creataByNationalyty("englishman");
        Ciitzen ciitzen = citizenFactory.createNewCitizen();
        ciitzen.sayHelloMethod();
    }

    static CitizenFactory creataByNationalyty(String nationality) {
        if (nationality.equalsIgnoreCase("chinese")) {
            return new CitizenFactory.ChineseCitizenFactory();
        } else if (nationality.equalsIgnoreCase("italian")) {
            return new CitizenFactory.ItalianCitizenFactory();
        } else if (nationality.equalsIgnoreCase("russian")) {
            return new CitizenFactory.RussianCitizenFactory();
        } else if (nationality.equalsIgnoreCase("englishman")) {
            return new CitizenFactory.EnglishmanCitizenFactory();
        } else {
            throw new RuntimeException(nationality + " - No such nationality found");
        }
    }
}

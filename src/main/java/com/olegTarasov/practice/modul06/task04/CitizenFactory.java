package com.olegTarasov.practice.modul06.task04;

/**
 * Created by Олег on 21.03.2017.
 */
public interface CitizenFactory {
    Ciitzen createNewCitizen();

    class ChineseCitizenFactory implements CitizenFactory {
        public Ciitzen createNewCitizen() {
            return new Ciitzen.ChineseCitizen();
        }
    }

    class EnglishmanCitizenFactory implements CitizenFactory {
        public Ciitzen createNewCitizen() {
            return new Ciitzen.EnglishmanCitizen();
        }
    }

    class RussianCitizenFactory implements CitizenFactory {
        public Ciitzen createNewCitizen() {
            return new Ciitzen.RussianCitizen();
        }
    }

    class ItalianCitizenFactory implements CitizenFactory {
        public Ciitzen createNewCitizen() {
            return new Ciitzen.ItalianCitizen();
        }
    }
}

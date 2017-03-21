package com.olegTarasov.practice.modul06.task04;

/**
 * Created by Олег on 21.03.2017.
 */
public interface Ciitzen {
    public void sayHelloMethod();

    class ChineseCitizen implements Ciitzen {
        public void sayHelloMethod() {
            System.out.println("你好，世界!!!");
        }
    }

    class EnglishmanCitizen implements Ciitzen {
        public void sayHelloMethod() {
            System.out.println("Hello world!!!");
        }
    }

    class ItalianCitizen implements Ciitzen {
        public void sayHelloMethod() {
            System.out.println("Ciao mondo!");
        }
    }

    class RussianCitizen implements Ciitzen {
        public void sayHelloMethod() {
            System.out.println("Privet, mir!");
        }
    }
}

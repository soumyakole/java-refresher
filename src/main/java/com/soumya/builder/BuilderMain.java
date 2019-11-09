package com.soumya.builder;

public class BuilderMain {
    public static void main(String[] args) {
            BankAccount acc1 = new BankAccount
                    .BankAccountBuilder("Soumya", "ACC101")
                    .withNewsLetter(true)
                    .withEmail("soumya@gmail.com")
                    .build();
        System.out.println(acc1);
    }
}

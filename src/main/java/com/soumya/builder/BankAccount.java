package com.soumya.builder;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(BankAccountBuilder builder){
        //stop direct object creation
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
        this.newsletter = builder.newsletter;
    };

    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber){
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String emai){
            this.email = emai;
            return this;
        }

        public BankAccountBuilder withNewsLetter (boolean newsLetter){
            this.newsletter = newsLetter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }
    }

    @Override
    public String toString() {
        return "Account(" +
                "Name : " + this.name +
                ", AccountNumber : " + this.accountNumber +
                ", Email : " + this.email +
                ", NewsLetter : " + this.newsletter + ")";
    }
}

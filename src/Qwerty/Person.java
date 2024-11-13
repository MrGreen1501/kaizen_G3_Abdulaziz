package Qwerty;

import java.time.LocalDate;

public class Person {
    private int id;
    private String fullName;
    private LocalDate birthday;
    private String adress;
    private double weight;
    private String qiziqish;

    public Person(int id, String fullName, LocalDate birthday, String adress, double weight, String qiziqish) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.adress = adress;
        this.weight = weight;
        this.qiziqish = qiziqish;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", adress='" + adress + '\'' +
                ", weight=" + weight +
                ", qiziqish='" + qiziqish + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAdress() {
        return adress;
    }

    public double getWeight() {
        return weight;
    }

    public String getQiziqish() {
        return qiziqish;
    }

    static class PersonBuilder {
        private int id;
        private String fullName;
        private LocalDate birthday;
        private String adress;
        private double weight;
        private String qiziqish;

        public PersonBuilder Id(int id) {
            this.id = id;
            return this;
        }

        public PersonBuilder FullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public PersonBuilder Birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public PersonBuilder Adress(String adress) {
            this.adress = adress;
            return this;
        }

        public PersonBuilder Weight(double weight) {
            this.weight = weight;
            return this;
        }

        public PersonBuilder Qiziqish(String qiziqish) {
            this.qiziqish = qiziqish;
            return this;
        }

        public Person build() {
            return new Person(
                    this.id,
                    this.fullName,
                    this.birthday,
                    this.adress,
                    this.weight,
                    this.qiziqish
            );
        }
    }
}

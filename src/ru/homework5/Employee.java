package ru.homework5;

public class Employee {

    String FIO;
    String Position;
    String Email;
    int Phone;
    int Salery;
    int Age;



    public Employee( String FIO, String Position, String Email, int Phone,int Salery, int Age){

        this.FIO = FIO;
        this.Position = Position;
        this.Email = Email;
        this.Phone = Phone;
        this.Salery = Salery;
        this.Age = Age;

    }

    public static void main(String[] args) {

       // Employee employee1 = new Employee("Иван Петрович Барсиков", "Директор", "dir@cat.com", 49588293,30000,30);
        Employee People[] = new Employee[5];

        People[0] = new Employee("Иван Петрович Барсиков", "Директор", "dir@cat.com", 49588293,30000,30);
        People[1] = new Employee("Сергей Васильевич Сладенький", "Менеджер", "vector@cat.com", 49588293,15000,30);
        People[2] = new Employee("Иван Алексеевич Мырзиков", "Помощник", "mos@cat.com", 49588293,16000,40);
        People[3] = new Employee("Иван Петрович Алешин", "Администратор", "chak@cat.com", 49588293,18000,42);
        People[4] = new Employee("Иван Петрович Змеев", "СБ", "smit@cat.com", 49588293,10000,30);
        int b = 0;

        for (int i = 0; i < People.length; i++){

            if (People[i].Age > 40) {
                printInfo(People[i]);
                b++;
            }
        }
        if (b == 0){
            System.out.println("Людей старше 40 не нашлось");
        }
    }

    private static void printInfo (Employee People){


         System.out.printf("Сотрудник '%s'; Должность: %s; Email: %s; Телефон '%d'; Зарплата: %d; Возраст: %d%n%n",
                 People.FIO, People.Position,People.Email,People.Phone, People.Salery, People.Age);

    }

}

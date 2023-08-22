package org.example;

public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[] {
                new Person("tim", "IS"),
                new Person("jim", "finance"),
                new Person("randy", "pissing about"),
                new Person("sandy", "cleaning"),
                new Person("andy", "cleaning"),
                new Person("katie", "cleaning"),
                new Person("laura", "pissing about"),
                new Person("saajid", "regulation"),
                new Person("alex", "regulation"),
                new Person("john", "accounts"),
                new Person("mr", "canteen")
        };

        System.out.println(boredom(person));

    }

    public static String boredom(Person[] staff) {
        int sum = 0;
        for(int i = 0; i < staff.length;i++) {
            String score = staff[i].department;
            switch(score) {
                case "accounts":
                    sum+=1;
                    break;
                case "finance":
                    sum+=2;
                    break;
                case "canteen":
                    sum+=10;
                    break;
                case "regulation":
                    sum+=3;
                    break;
                case "trading":
                    sum+=6;
                    break;
                case "change":
                    sum+=6;
                    break;
                case "IS":
                    sum+=8;
                    break;
                case "retail":
                    sum+=5;
                    break;
                case "cleaning":
                    sum+=4;
                    break;
                case "pissing about":
                    sum+=25;
                    break;
            }
        }
        if(sum <= 80) {
            return "kill me now";
        }else if(sum > 80 && sum < 100) {
            return "i can handle this";
        }
        else {
            return "party time!!";
        }
    }

    static public class Person {
        public final String name;        // name of the staff member
        public final String department;  // department they work in

        public Person(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }
}
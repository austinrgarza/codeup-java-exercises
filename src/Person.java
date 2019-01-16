public class Person {
    public static void main(String[] args) {
        Person austin = new Person("Austin");
        System.out.println(austin.personsName);
        austin.setName("Nacho");
        System.out.println(austin.personsName);
        austin.sayHello();
        System.out.println("========");


        //test 1
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //test 2
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //test 3
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }


    public String personsName;

    public Person (String name){
               this.personsName = name;

    }

    public String getName(){
        return this.personsName;
    }


    public void setName (String name){
        this.personsName = name;
        System.out.println("Your name is: " + personsName);
    }

    public void sayHello (){
        System.out.println("Hello "+ personsName + "!");
    }



}

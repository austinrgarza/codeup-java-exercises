public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,\nWorld!");

        int MyFavoriteVariable = 9;
        System.out.println(MyFavoriteVariable);

        String myString = "This is a string";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        int x = 5;
        x+=5;
        System.out.println(x);

        int a = 3;
        int y = 4;
        y*=a;
        System.out.println(y);

        int c = 10;
        int d = 2;
        c/=d;
        d-=c;
        System.out.println(c);
        System.out.println("d = " + d);
    }
}

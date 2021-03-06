package session07;

public class InheritanceExample {
    public static void main(String[] args) {
        //    new W(); // error, W is an Interface
        //		new X(); // error, X is an abstract class
        //		new Y(); // error Y is an abstract class
        // new Z(); //ok
    }
}

interface W {
    public void f();
    public void g();
}

class MyClass implements W {
    public void f() {
        System.out.println("MyClass overrode f");
    }

    public void g() {
        System.out.println("MyClass overrode g");
    }


    abstract class X implements W {
        public void f() {}

        public void f2() {
        }
    }

    abstract class Y implements W {
        public void g() {
        }
    }

    class Z extends X {
        public void g() {
        }
        public void f() {
        }
    }
    }

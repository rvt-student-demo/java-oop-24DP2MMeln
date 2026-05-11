package rvt;
import java.util.ArrayList;

public class Diagram {
    public static void main(String[] args) {
        
    }

    class A implements IA {}
    class B extends A implements IB {}
    class C extends B implements IC {
        private ArrayList<E> E;
    }
    class D {
        private ArrayList<IA> IA;
    }
    class E {
        private ArrayList<C> C;
    }

    interface IA {}
    interface IB {}
    interface IC {}
}

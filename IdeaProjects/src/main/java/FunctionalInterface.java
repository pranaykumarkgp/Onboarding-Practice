//functional interface is necessary.
@java.lang.FunctionalInterface

public interface FunctionalInterface {

    //can have only one abstract method
    public void add();

    //
    default String sayHi(){
        return "Hola";
    }
    static boolean isTrue(){
        return false;
    }

}

package main.creationalDesignPatterns.singletonPattern;

public class LazyInstantiation {
    private static LazyInstantiation obj;
    private LazyInstantiation(){}

    public static LazyInstantiation getLazyInstantiation(){
        if (obj == null){
            obj = new LazyInstantiation();//instance will be created at request time
        }
        return obj;
    }

    public void doSomething(){
            //write your code
    }
}

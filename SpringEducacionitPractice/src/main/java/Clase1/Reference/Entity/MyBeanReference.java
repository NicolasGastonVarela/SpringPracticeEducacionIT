package Clase1.Reference.Entity;

public class MyBeanReference {
    MyNumber number;

    public MyBeanReference(MyNumber myNumber){
        this.number = myNumber;
    }

    public String getGreeting(){
        return "Hello with number: " + number.show();
    }
}

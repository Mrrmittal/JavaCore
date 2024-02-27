package src;




class A{
    int a = 10;
    public void show(){
        System.out.println("A Class");
    }
}

class B{

}


public class demo implements a{
    public static void main(String[] args) {
        a obj = new demo();
        Integer a = 500;
        Integer b = 500;
        Integer c = 100;
        Integer d = 100;

        if(a==b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    @Override
    public void show() {

    }
}

interface a{
   public void show();
}

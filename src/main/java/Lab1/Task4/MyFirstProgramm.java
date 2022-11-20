package Lab1.Task4;
import java.lang.reflect.Method;

class MyFirstClass {
    public static void main(String[] arg) {
        MySecondClass o=new MySecondClass();
        int i,j;

        for (i=0; i<=8;i++){
            for (j=0; j<=8;j++){
                o.Method1(i);
                o.Method2(j);
                System.out.print(o.Method3());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class MySecondClass{
    private int MyFirVar,MySecVar;
    public int C;
    public void Method1(int j) {
        MyFirVar=j;
    }
    public void Method2(int j) {
        MySecVar = j;
    }
    public int Method3(){
        for (int j=0; j<=8;j++) {
            C=MyFirVar+MySecVar;
        }
        return C;
    }

}
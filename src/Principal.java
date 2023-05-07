public class Principal {

    public static void main(String[] args) {
        // write your code here
        Fraccionario f1;
        f1=new Fraccionario();
        f1.crear(3,4);
        Fraccionario f2;
        f2=new Fraccionario();
        f2.crear(5,4);
        Fraccionario f3=f1.sumar(f2);
        System.out.print(f3.numerador+"/"+f3.denominador);
    }
}

public class Fraccionario {
    int numerador;
    int denominador;
    void crear (int n, int d)
    {
        numerador=n;
        denominador=d;
    }

    Fraccionario sumar (Fraccionario f2)
    {
        int x, y;

        x=numerador*f2.denominador+denominador*f2.numerador;
        y=denominador*f2.denominador;

        Fraccionario f3=new Fraccionario();
        f3.crear(x, y);
        return f3;
    }

    Fraccionario restar (Fraccionario f2)
    {
        int x, y;
        x=numerador*f2.denominador-denominador*f2.numerador;
        y=denominador*f2.denominador;
        Fraccionario f3=new Fraccionario();
        f3.crear(x,y);
        return f3;
    }
}

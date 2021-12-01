package Principal;

import br.edu.fafic.BuildDividir;
import br.edu.fafic.BuildSomar;
import br.edu.fafic.BuildSubtrair;
import br.edu.fafic.BuilderMultiplicar;

public class Principal {
    public static void main(String[] args) {

        BuildSomar soma = new BuildSomar();
        BuildDividir divide = new BuildDividir();
        BuilderMultiplicar multiplica = new BuilderMultiplicar();
        BuildSubtrair subtrai = new BuildSubtrair();

        System.out.println("Soma: " + soma.somar(2,3));
        System.out.println("Divisão: " + divide.dividir(50, 5));
        System.out.println("Multiplicação: " + multiplica.multiplicar(2, 10));
        System.out.println("Subtração: " + subtrai.subtrair(50, 2));

    }
}

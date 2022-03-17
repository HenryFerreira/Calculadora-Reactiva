package co.com.sofka.calculadora;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Calculadora {
    //------------------------------------------------------//
    //SUMA y RESTA con operador binario
    IntBinaryOperator add = (numero1, numero2) -> numero1 + numero2;
    IntBinaryOperator sustract = (numero1, numero2) -> numero1 - numero2;
    //------------------------------------------------------//

    //------------------------------------------------------//
    //MULTIPLICACION
    IntBinaryOperator mult = (numero1, numero2) ->
            IntStream.range(0, numero2 + 1)
                    .reduce((acomulador, numero) -> add.applyAsInt(acomulador, numero1))
                    .getAsInt();
    //------------------------------------------------------//

    //------------------------------------------------------//
    //DIVISION
    BiFunction<Integer, Integer, Integer> divisionEntera = (num, den) -> {
        return IntStream.range(0, den + 1)
                .reduce((acumulador, numero) -> {
                    if (mult.applyAsInt(numero, den) <= num) {
                        return acumulador = acumulador + 1;
                    }
                    return acumulador;
                }).getAsInt();
    };
    //------------------------------------------------------//

}

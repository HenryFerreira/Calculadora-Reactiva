package co.com.sofka.calculadora;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Calculadora {
    //suma y resta con operador binario
    IntBinaryOperator add = (a, b) -> a + b;
    IntBinaryOperator sustract = (a, b) -> a - b;

    //multiplicacion
    IntBinaryOperator mult = (a, b) ->
            IntStream.range(0, b + 1)
                    .reduce((acomulador, numero) -> add.applyAsInt(acomulador, a))
                    .getAsInt();

    //division
    BiFunction<Integer, Integer, Integer> divisionEntera = (num, den) -> {
        return IntStream.range(0, den + 1)
                .reduce((acumulador, numero) -> {
                    if (mult.applyAsInt(numero, den) <= num) {
                        return acumulador = acumulador + 1;
                    }
                    return acumulador;
                }).getAsInt();
    };
}

package je18_exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class Excecoes {
    public static void main(String[] args) {
        checkEstado("PI");
    }

    static void checkEstado(String nomeEstado) throws EstadoValidateException{
        if(!nomeEstado.equalsIgnoreCase("PI"))
            throw new EstadoValidateException();
        System.out.println("Welcome to " + nomeEstado.toUpperCase());

    }
}

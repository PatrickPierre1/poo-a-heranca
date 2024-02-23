package restaurante;

import restaurante.pratos.*;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        setarPreco().forEach(prato -> System.out.println(prato.getPreco()));
    }
    public static List<Prato> setarPreco() {
        var macarrao = new Macarrao();
        var pastel = new Pastel();
        var pizza = new Pizza();
        var pratofeito = new PratoFeito();
        var strogonoff = new Strogonoff();
        var sushi = new Sushi();


        macarrao.setPreco(25.99F);
        pastel.setPreco(25.99F);
        pizza.setPreco(25.99F);
        pratofeito.setPreco(25.99F);
        strogonoff.setPreco(25.99F);
        sushi.setPreco(25.99F);4444

        return Arrays.asList(
                macarrao,
                pastel,
                pizza,
                pratofeito,
                strogonoff,
                sushi
        );
    }
}

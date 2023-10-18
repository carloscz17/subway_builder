package org.subway;

import org.subway.modelo.BreadBuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> pao = Arrays.asList("PAO ITALIANO","PAO FRANCÊS","PAO AMERICANO");
        List<String> sauce = Arrays.asList("Maionese", "Ketchup", "Mostarda");
        List<String> recheio = Arrays.asList("Frango", "Camarão", "Atum");
        var bread1 = new BreadBuilder("PAO ITALIANO")
                .filling("Frango")
                .sauce(Collections.singletonList("Ketchup"))
                .more("Bacon")
                .createdBread();

        var bread2 = new BreadBuilder("PAO AMERICANO")
                .filling("Frango")
                .sauce(Collections.singletonList("Maionese"))
                .more("Mostarda")
                .createdBread();

        System.out.println(bread1.toString());
        System.out.println(bread2.toString());

    }
}
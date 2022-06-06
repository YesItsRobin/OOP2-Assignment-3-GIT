package main;

import domain.collections.SpeciesCollection;
import domain.collections.StarCollection;
import domain.galaxy.Star;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StarCollection starCollection= StarCollection.instance();
        System.out.println(starCollection);

        SpeciesCollection speciesCollection = SpeciesCollection.instance();
        System.out.println(speciesCollection);
    }
}

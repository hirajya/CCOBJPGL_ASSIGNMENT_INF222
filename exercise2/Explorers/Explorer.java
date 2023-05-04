package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.NnC;
import Planets.Navori;

public interface Explorer {
    
    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(NnC nnc);

    void visit(Navori navori);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}

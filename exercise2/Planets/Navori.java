package Planets;

import Explorers.Explorer;

public class Navori implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
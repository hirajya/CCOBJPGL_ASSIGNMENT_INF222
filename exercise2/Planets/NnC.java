package Planets;

import Explorers.Explorer;

public class NnC implements Planet{
    
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}

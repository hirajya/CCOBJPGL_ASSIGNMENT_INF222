package Explorers;

import Planets.*;

public class DogExplorer implements Explorer{
    
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Arf Arf (Gone to Mercury)");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Arf Arf (Gone to Mars)");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Arf Arf (Gone to Saturn)");
    }

    @Override
    public void visit(NnC nnc) {
        System.out.println("Arf Arf (Gone to NnC)");
    }

    @Override
    public void visit(Navori navori) {
        System.out.println("Arf Arf (Gone to Navori)");
    }
}

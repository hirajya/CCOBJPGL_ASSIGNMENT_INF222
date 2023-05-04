package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer{
    
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... exploring life");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... exploring life");
    }

    @Override
    public void visit(NnC nnc) {
        System.out.println("Deploying tools specific to NnC... exploring life");
    }

    @Override
    public void visit(Navori navori) {
        System.out.println("Deploying tools specific to Navori... exploring life");
    }
}

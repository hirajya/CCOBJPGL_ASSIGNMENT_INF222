package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer{
    
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Android visits Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Android visits Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Android visits Saturn");
    }

    @Override
    public void visit(NnC nnc) {
        System.out.println("Android visits NnC");
    }

    @Override
    public void visit(Navori navori) {
        System.out.println("Android visits Navori");
    }
}

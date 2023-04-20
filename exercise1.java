package Test;

public class exercise1 {

    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;

    public static void main(String[] args) {
        
        // pre condtion
        assert iWillBehave == true : "mag behave kakase lods";

        college();

        // post condition
        assert iWillGraduate == true : "Ulit knlng lods";

    }

    static void college() {
        iWillGraduate = false;
        System.out.println("ez");
    }

}
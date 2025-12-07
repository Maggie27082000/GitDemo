//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Loops {
    public void ifCondition() {
        //Conditional statements
        int i = 3;
        if (i == 4) {
            System.out.println("A1");
        } else if (i >= 10) {
            System.out.println("A2");
        } else if (i >= 1) {
            System.out.println("A3");
        } else if (i >= 2) {
            System.out.println("A4");
        } else {
            System.out.println("A5");
        }
    }

    public void whileLoop() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void doWhileLoop() {
        //even if condition fails, loop executes 1 time
        int i = 11;
        do {
            System.out.println(i);
        } while (i == 10);
    }

    public void switchCases() {
        String name = "PICHI";
        switch (name) {
            case "PICHI":
                System.out.println("Hateu");
                break;
        }
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.ifCondition();
        l.whileLoop();
        l.doWhileLoop();
        l.switchCases();


    }
}
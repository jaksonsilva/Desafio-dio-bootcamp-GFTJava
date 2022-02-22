package one.digitalinovation.oo.polimofirmo;

public class RodarAplicacao {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFiha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        ClasseFiha2 classefilha2 = new ClasseFiha2();
        classefilha2.metodo2();
    }
}

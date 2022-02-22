package one.digitalinovation.oo;

/*
Classe criada para resolução do exercício do curso de Orientação a Objeto da Dio
*/

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5));


        Carro carro2 = new Carro("Cinza", "Mercedes-bens", 66);
        System.out.println("/n" + carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5));
    }
}
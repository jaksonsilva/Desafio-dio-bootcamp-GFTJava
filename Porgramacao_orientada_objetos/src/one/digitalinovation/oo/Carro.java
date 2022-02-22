package one.digitalinovation.oo;

import java.util.Objects;

public class Carro extends Veiculo{
    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return capacidadeTanque == carro.capacidadeTanque && cor.equals(carro.cor) && modelo.equals(carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, modelo, capacidadeTanque);
    }

    double totalValorTanque(double valorCombustibel){
        return valorCombustibel * capacidadeTanque;
    }
}
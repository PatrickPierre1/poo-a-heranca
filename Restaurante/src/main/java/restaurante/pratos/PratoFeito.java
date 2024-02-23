package restaurante.pratos;

import restaurante.Prato;

public class PratoFeito extends Prato {
    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    private Float preco;

}

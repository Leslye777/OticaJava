package Model;

/**
 * @autor Luiz Eduardo
 */
public class Produto {

    public Produto(String descricao, String categoria, int id, int qtdestoque, double preco) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.id = id;
        this.qtdestoque = qtdestoque;
        this.preco = preco;
    }

    private String descricao, categoria;
    private int id, qtdestoque;
    private double preco;

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the qtdestoque
     */
    public int getQtdestoque() {
        return qtdestoque;
    }

    /**
     * @param qtdestoque the qtdestoque to set
     */
    public void setQtdestoque(int qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

}

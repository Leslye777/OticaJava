package Model;

/**
 *
 * @author Luiz Eduardo
 */
public class OculosDeGrau {

    public OculosDeGrau(Produto p, String marca, String formato, String cor, double grau) {
        this.p = p;
        this.marca = marca;
        this.formato = formato;
        this.cor = cor;
        this.grau = grau;
    }

    private String marca, formato, cor;
    private double grau;
    private Produto p;

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the grau
     */
    public double getGrau() {
        return grau;
    }

    /**
     * @param grau the grau to set
     */
    public void setGrau(double grau) {
        this.grau = grau;
    }

    /**
     * @return the p
     */
    public Produto getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Produto p) {
        this.p = p;
    }

}

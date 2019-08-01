package Model;

/**
 *
 * @author Luiz Eduardo
 */
public class Lentes {

    public Lentes(Produto p, String marca, String tipoDeLente) {
        this.p = p;
        this.marca = marca;
        this.tipoDeLente = tipoDeLente;
    }
    private String marca, tipoDeLente;
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
     * @return the tipoDeLente
     */
    public String getTipoDeLente() {
        return tipoDeLente;
    }

    /**
     * @param tipoDeLente the tipoDeLente to set
     */
    public void setTipoDeLente(String tipoDeLente) {
        this.tipoDeLente = tipoDeLente;
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

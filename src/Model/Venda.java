package Model;

import java.util.Date;

/**
 *
 * @author Luiz Eduardo
 */
public class Venda {

    public Venda(int cod, Date data, int idCliente) {
        this.cod = cod;
        this.data = data;
        this.id = idCliente;
    }

    private int cod, id;
    private Date data;

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the c
     */
    public int getID() {
        return id;
    }

    /**
     * @param c the c to set
     */
    public void setID(int c) {
        this.id = c;
    }

}

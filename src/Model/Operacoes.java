package Model;

/**
 *
 * @author Luiz Eduardo
 */
public interface Operacoes {

    public void cadastraCliente(Cliente c);

    public void cadastraProduto(Produto p);

    public void cadastrarLentes(Lentes l);

    public void cadastrarOculosDeGrau(OculosDeGrau odc);

    public void cadastrarOculosDeSol(OculosDeSol ods);

    public void vender(Venda v);

    public void pedido(Pedido p, int id);

    public void listarClientes();

    public void listarLentes();

    public void listarOculosDeGrau();

    public void listarOculosDeSol();

    public void listarPedidos();

    public void listarVendas();

    public boolean validar(long cpf);

    public boolean verificar(int id);

    public boolean verificarCliente(int id);

    public boolean alterarEstoque(int id, int qtd);

    public boolean alterarCliente(int id);

    public boolean removerCliente(int id);

    public boolean removerProduto(int id);

    public boolean logar(String email, String senha);

}

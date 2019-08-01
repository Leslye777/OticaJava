package Model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luiz Eduardo
 */
public class OperacoesComerciais implements Operacoes {

    ArrayList<Cliente> cc = new ArrayList<>();
    ArrayList<Venda> cv = new ArrayList<>();
    ArrayList<Produto> cp = new ArrayList<>();
    ArrayList<Lentes> cl = new ArrayList<>();
    ArrayList<OculosDeGrau> og = new ArrayList<>();
    ArrayList<OculosDeSol> os = new ArrayList<>();
    ArrayList<Pedido> op = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    @Override
    public void cadastraCliente(Cliente c) {

        cc.add(new Cliente(c.getNome(), c.getEndereco(), c.getEmail(), c.getTelefone(), c.getCpf(), c.getSenha(), c.getId()));
    }

    @Override
    public void cadastraProduto(Produto p) {

        cp.add(new Produto(p.getDescricao(), p.getCategoria(), p.getId(), p.getQtdestoque(), p.getPreco()));
    }

    @Override
    public void cadastrarLentes(Lentes l) {

        cl.add(new Lentes(l.getP(), l.getMarca(), l.getTipoDeLente()));
    }

    @Override
    public void cadastrarOculosDeGrau(OculosDeGrau odc) {

        og.add(new OculosDeGrau(odc.getP(), odc.getMarca(), odc.getFormato(), odc.getCor(), odc.getGrau()));
    }

    @Override
    public void cadastrarOculosDeSol(OculosDeSol ods) {
        os.add(new OculosDeSol(ods.getP(), ods.getMarca(), ods.getFormato(), ods.getCor()));

    }

    @Override
    public void vender(Venda v) {

        cv.add(new Venda(v.getCod(), v.getData(), v.getID()));
    }

    @Override
    public void listarClientes() {

        if (cc.isEmpty()) {

            System.out.println("Não possuimos clientes cadastrados");
        }

        for (Cliente c : cc) {

            System.out.println("ID:" + c.getId());
            System.out.println("Nome:" + c.getNome());
            System.out.println("Cpf:" + c.getCpf());
            System.out.println("Telefone:" + c.getTelefone());
            System.out.println("Email:" + c.getEmail());
            System.out.println("Senha:" + c.getSenha());

        }

    }

    @Override
    public void listarLentes() {

        if (cl.isEmpty()) {

            System.out.println("Não possuimos lentes cadastradas");
        }

        for (Lentes l : cl) {
            System.out.println("ID:" + l.getP().getId());
            System.out.println("Descricao:" + l.getP().getDescricao());
            System.out.println("Qtd em estoque:" + l.getP().getQtdestoque());
            System.out.println("Marca:" + l.getMarca());
            System.out.println("Tipo de lente:" + l.getTipoDeLente());
            System.out.println("Preco:" + l.getP().getPreco());

        }

    }

    @Override
    public void pedido(Pedido p, int id) {
        int qtd;

        op.add(new Pedido(p.getCod(), p.getData(), p.getIdCliente(), p.getP(), p.getStatus()));

        for (Produto pr : cp) {

            if (id == pr.getId()) {
                qtd = pr.getQtdestoque() - 1;
                pr.setQtdestoque(qtd);
                break;

            }

        }
    }

    @Override
    public void listarPedidos() {

        if (op.isEmpty()) {

            System.out.println("Ainda não foram realizados pedidos.");
        }

        for (Pedido pe : op) {

            System.out.println("Cod:" + pe.getCod());
            System.out.println("Data:" + pe.getData());
            System.out.println("Status:" + pe.getStatus());
            System.out.println("Id cliente:" + pe.getIdCliente());

        }

    }

    @Override
    public void listarVendas() {

        if (cv.isEmpty()) {

            System.out.println("Ainda não foram realizadas vendas.");
        }

        for (Venda v : cv) {

            System.out.println("Cod:" + v.getCod());
            System.out.println("Data:" + v.getData());
            System.out.println("Id cliente:" + v.getID());

        }

    }

    @Override
    public void listarOculosDeGrau() {

        if (og.isEmpty()) {

            System.out.println("Não possuimos oculos cadastrados.");
        }

        for (OculosDeGrau oc : og) {

            System.out.println("ID:" + oc.getP().getId());
            System.out.println("Descricao:" + oc.getP().getDescricao());
            System.out.println("Qtd em estoque:" + oc.getP().getQtdestoque());
            System.out.println("Marca:" + oc.getMarca());
            System.out.println("Cor:" + oc.getCor());
            System.out.println("Formato:" + oc.getFormato());
            System.out.println("Grau:" + oc.getGrau());
            System.out.println("Preco:" + oc.getP().getPreco());
        }

    }

    @Override
    public void listarOculosDeSol() {

        if (os.isEmpty()) {

            System.out.println("Não possuimos  oculos cadastrados");
        }

        for (OculosDeSol s : os) {

            System.out.println("ID:" + s.getP().getId());
            System.out.println("Descricao:" + s.getP().getDescricao());
            System.out.println("Qtd em estoque:" + s.getP().getQtdestoque());
            System.out.println("Marca:" + s.getMarca());
            System.out.println("Cor:" + s.getCor());
            System.out.println("Formato:" + s.getFormato());
            System.out.println("Preco:" + s.getP().getPreco());
        }

    }

    @Override
    public boolean validar(long cpf) {

        /*if(cc.isEmpty()){
            System.out.println("CPF não cadastrado");
        }
         */
        for (Cliente c : cc) {

            if (cpf == c.getCpf()) {
                System.out.println("Cpf invalido");
                return true;
            }

        }
        System.out.println("Valido");
        return false;

    }

    @Override
    public boolean verificar(int id) {

        if (cp.isEmpty()) {
            System.out.println("Não ha produtos cadastrados ainda.");
        }

        for (Produto p : cp) {

            if (id == p.getId()) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean verificarCliente(int id) {

        for (Cliente c : cc) {

            if (id == c.getId()) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean alterarEstoque(int id, int qtd) {

        if (cp.isEmpty()) {

            System.out.println("Nao ha oculos cadastrados");
        }

        for (Produto p : cp) {

            if (id == p.getId()) {
                System.out.println("Qtd anterior:" + p.getQtdestoque());
                p.setQtdestoque(qtd);
                System.out.println("Nova qtd:" + p.getQtdestoque());
                return true;
            }

        }
        return false;

    }

    @Override
    public boolean alterarCliente(int id) {

        long dados1;
        String dados;
        int dados2;
        double dados3;
        for (Cliente c : cc) {

            if (id == c.getId()) {

                //System.out.println("Digite o novo id:");
                c.setId(c.getId() + 1);
                dados = entrada.nextLine();
                System.out.println("Digite o novo nome:");
                c.setNome(dados = entrada.nextLine());
                System.out.println("Digite o novo endereco:");
                c.setEndereco(dados = entrada.nextLine());
                System.out.println("Digite o novo email:");
                c.setEmail(dados = entrada.nextLine());
                System.out.println("Digite o novo telefone:");
                c.setTelefone(dados1 = entrada.nextLong());
                System.out.println("Digite o novo cpf:");
                c.setCpf(dados1 = entrada.nextLong());
                System.out.println("Digite a nova senha:");
                c.setSenha(dados = entrada.nextLine());
                System.out.println("Alterado com sucesso");
                return true;

            }

        }
        System.out.println("Cliente nao cadastrado");
        return false;
    }

    @Override
    public boolean removerCliente(int id) {

        if (cc.isEmpty()) {
            System.out.println("Não há cliente cadastrados.");
        } else {

            for (Cliente c : cc) {

                if (id == c.getId()) {
                    cc.remove(c);
                    System.out.println("Cliente removido com sucesso");
                    return true;

                }

            }

        }
        System.out.println("Nao foi possivel remover o cliente");
        return false;

    }

    @Override
    public boolean removerProduto(int id) {

        if (cp.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {

            for (Produto p : cp) {

                if (id == p.getId()) {
                    cp.remove(p);
                    System.out.println("Produto removido com sucesso.");
                    return true;

                }

            }

        }
        System.out.println("Nao foi possivel remover o produto");
        return false;

    }

    @Override
    public boolean logar(String email, String senha) {

        if (cc.isEmpty()) {
            System.out.println("Não há cliente cadastrados.");
        } else {

            for (Cliente c : cc) {

                if (email.equals(c.getEmail()) && senha.equals(c.getSenha())) {
                    System.out.println("Login feito com sucesso.");
                    return true;

                }

            }

        }

        return false;

    }
}

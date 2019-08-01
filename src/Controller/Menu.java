package Controller;

import Model.Cliente;
import Model.Lentes;
import Model.OculosDeGrau;
import Model.OculosDeSol;
import Model.OperacoesComerciais;
import Model.Pedido;
import Model.Produto;
import Model.Venda;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luiz Eduardo ER03995
 * @author Leslye Esteves ER03976
 * @author Danilo Silva ER03972
 */
public class Menu {
    
    int contId;
    int opcao, opcao2, dadosC1, cont = 0;
    String dadosC2, dadosC5;
    double dadosC3;
    long dadosC;
    Date dadosC4;
    boolean teste;
    Cliente c = new Cliente(dadosC2, dadosC2, dadosC2, dadosC, dadosC, dadosC2, dadosC1);
    Produto p = new Produto(dadosC2, dadosC2, dadosC1, dadosC1, dadosC3);
    Lentes l = new Lentes(p, dadosC2, dadosC2);
    OculosDeGrau coc = new OculosDeGrau(p, dadosC2, dadosC2, dadosC2, dadosC3);
    OculosDeSol cos = new OculosDeSol(p, dadosC2, dadosC2, dadosC2);
    Pedido fp = new Pedido(cont, dadosC2, cont, opcao, dadosC2);
    Venda nv = new Venda(cont, dadosC4, cont);
    OperacoesComerciais oc = new OperacoesComerciais();
    Scanner entrada = new Scanner(System.in);
    ClearConsole Clear = new ClearConsole();
    boolean ok = true;
    
    public void OperacoesComerciais() {        
        do {            
            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("●  MENU OTICA\t-OO-\t\t\t -●●-\t\t\t\t  ●");
            System.out.println("●  1 - Cadastrar Cliente\t\t 2 - Cadastrar Produto\t\t  ●");
            System.out.println("●  3 - Listar Clientes\t\t\t 4 - Listar Produtos\t\t  ●");
            System.out.println("●  5 - Login\t\t\t\t 6 - Listar Vendas Realizadas\t  ●");
            System.out.println("●  7 - Listar pedidos\t\t\t 8 - Alterar estoque\t\t  ●");
            System.out.println("●  9 - Remover Cliente\t\t\t 10 - Remover produto\t\t  ●");
            System.out.println("●  11 - Alterar dados cliente\t\t 0 - Sair\t\t\t  ●");
            System.out.println("\t\t\t\t\t\t\t\t  DLL C.O");
            System.out.printf("▬► DIGITE A OPÇÃO DESEJADA: ");
            
            while (ok) {
                try {
                    opcao = entrada.nextInt();
                    ok = false;
                } catch (InputMismatchException erro) {
                    System.err.println("FAVOR INFORMAR NUMEROS:");
                    entrada.nextLine();
                }
            }            
            Clear.Limpa();
            switch (opcao) {                
                case 0:
                    break;
                case 1:
                    c.setId(c.getId() + 1);                    
                    dadosC2 = entrada.nextLine();
                    
                    System.out.println("Digite seu nome:");
                    c.setNome(dadosC2 = entrada.nextLine());
                    
                    System.out.println("Digite seu endereco:");
                    c.setEndereco(dadosC2 = entrada.nextLine());
                    
                    ok = true;        //entrada de dados email;
                    do {                        
                        
                        System.out.println("Digite seu email:");
                        dadosC2 = entrada.nextLine();
                        
                        if (dadosC2.equals(c.getEmail())) {
                            System.err.println("EMAIL JÁ CADASTRADO");
                            System.err.println("EMAIL INVÁLIDO,TENTE NOVAMENTE");
                        } else if (dadosC2.contains("@")) {
                            System.out.println("EMAIL VÁLIDO");
                            c.setEmail(dadosC2);
                            ok = false;                            
                            break;
                        } else {
                            System.err.println("EMAIL INVÁLIDO,TENTE NOVAMENTE");
                        }
                    } while (ok);              //final do algoritmo email;
                    
                    ok = true;        //entrada de dados telefone;
                    while (ok) {                        
                        try {
                            System.out.println("Digite seu telefone:");
                            c.setTelefone(dadosC = entrada.nextLong());
                            ok = false;
                        } catch (InputMismatchException erro) {
                            System.err.println("NÃO E PERMITIDO INSERIR CARACTERES! FAVOR INFORMAR NUMEROS:");
                            entrada.nextLine();
                        }
                    }              //final do algoritmo telefone;
                    
                    boolean continua = true;
                    do {
                        do {
                            try {
                                System.out.println("Digite seu cpf:");
                                c.setCpf(dadosC = entrada.nextLong());
                                continua = false;
                                
                            } catch (InputMismatchException error) {
                                System.err.println("NÃO E PERMITIDO INSERIR CARACTERES! FAVOR INFORMAR NUMEROS:");
                                entrada.nextLine();
                            }
                            
                        } while (continua);
                        teste = oc.validar(dadosC);
                        String testizinho;
                        testizinho = Long.toString(dadosC);                        
                        int result;
                        result = testizinho.length();
                        if (teste == false && result == 11) {
                            break;
                        }
                    } while (teste != false);
                    entrada.nextLine();
                    System.out.println("Digite sua senha:");
                    c.setSenha(dadosC2 = entrada.nextLine());
                    oc.cadastraCliente(c);
                    break;
                
                case 2:
                    System.out.println("Digite o id:");
                    p.setId(dadosC1 = entrada.nextInt());
                    dadosC2 = entrada.nextLine();
                    System.out.println("Digite a descricao do produto:");
                    p.setDescricao(dadosC2 = entrada.nextLine());
                    System.out.println("Digite a qtd em estoque:");
                    p.setQtdestoque(dadosC1 = entrada.nextInt());
                    System.out.println("Escolha a categoria desejada:");
                    System.out.println("1-Lentes");
                    System.out.println("2-Oculos de grau");
                    System.out.println("3-Oculos de sol");
                    opcao2 = entrada.nextInt();
                    switch (opcao2) {
                        case 1:
                            p.setCategoria("lentes");
                            System.out.println("Digite o preco:");
                            p.setPreco(dadosC3 = entrada.nextDouble());
                            l.setP(p);
                            dadosC2 = entrada.nextLine();
                            System.out.println("Digite a marca:");
                            l.setMarca(dadosC2 = entrada.nextLine());
                            System.out.println("Digite o tipo de lente:");
                            l.setTipoDeLente(dadosC2 = entrada.nextLine());
                            oc.cadastraProduto(p);
                            oc.cadastrarLentes(l);
                            break;
                        case 2:
                            p.setCategoria("oculos de grau");
                            System.out.println("Digite o preco:");
                            p.setPreco(dadosC3 = entrada.nextDouble());
                            coc.setP(p);
                            dadosC2 = entrada.nextLine();
                            System.out.println("Digite a marca:");
                            coc.setMarca(dadosC2 = entrada.nextLine());
                            System.out.println("Digite a cor:");
                            coc.setCor(dadosC2 = entrada.nextLine());
                            System.out.println("Digite o formato:");
                            coc.setFormato(dadosC2 = entrada.nextLine());
                            System.out.println("Digite o grau:");
                            coc.setGrau(dadosC3 = entrada.nextDouble());
                            oc.cadastraProduto(p);
                            oc.cadastrarOculosDeGrau(coc);
                            break;
                        case 3:
                            p.setCategoria("oculos de sol");
                            System.out.println("Digite o preco:");
                            p.setPreco(dadosC3 = entrada.nextDouble());
                            cos.setP(p);
                            System.out.println("Digite a marca:");
                            cos.setMarca(dadosC2 = entrada.nextLine());
                            System.out.println("Digite a cor:");
                            cos.setCor(dadosC2 = entrada.nextLine());
                            System.out.println("Digite o formato:");
                            cos.setFormato(dadosC2 = entrada.nextLine());
                            oc.cadastraProduto(p);
                            oc.cadastrarOculosDeSol(cos);
                            break;
                        default:
                            System.out.println("Opcao invalida");
                            break;
                        
                    }
                
                case 3:
                    oc.listarClientes();
                    break;
                case 4:
                    System.out.println("Lentes:");
                    oc.listarLentes();
                    System.out.println("Oculos de grau:");
                    oc.listarOculosDeGrau();
                    System.out.println("Oculos de sol:");
                    oc.listarOculosDeSol();
                    break;
                case 5:
                    dadosC2 = entrada.nextLine();
                    System.out.println("Fazer login para comprar:");
                    System.out.println("Digite seu email:");
                    dadosC2 = entrada.nextLine();
                    System.out.println("Digite sua senha:");
                    dadosC5 = entrada.nextLine();
                    teste = oc.logar(dadosC2, dadosC5);
                    if (teste == true) {
                        
                        cont++;
                        fp.setCod(cont);
                        
                        System.out.println("Digite a data atual:");
                        dadosC2 = entrada.nextLine();
                        fp.setData(dadosC2);
                        System.out.println("Digite o seu id:");
                        fp.setIdCliente(dadosC1 = entrada.nextInt());
                        teste = oc.verificarCliente(dadosC1);
                        if (teste == true) {
                            System.out.println("Digite id do oculos desejado:");
                            fp.setP(dadosC1 = entrada.nextInt());
                            teste = oc.verificar(dadosC1);
                            if (teste == true) {
                                System.out.println("Deseja pagar agora ou um outro dia:");
                                System.out.println("1-Sim:pagar agora");
                                System.out.println("2-Nao:outro dia");
                                System.out.println("Digite a opcao desejada:");
                                opcao2 = entrada.nextInt();
                                switch (opcao2) {
                                    case 1:
                                        cont++;
                                        nv.setCod(cont);
                                        nv.setData(dadosC4);
                                        nv.setID(dadosC1);
                                        fp.setStatus("pendente");
                                        oc.pedido(fp, dadosC1);
                                        oc.vender(nv);
                                        break;
                                    case 2:
                                        fp.setStatus("Entregue");
                                        
                                        break;
                                    default:
                                        System.out.println("Opcao invalida");
                                        break;
                                    
                                }
                            } else {
                                
                                System.out.println("Nao possuimos esse oculos.");
                                
                            }
                        }
                    } else {
                        System.out.println("Cadastre-se primeiro para poder comprar!");
                        
                    }
                    
                    break;
                case 6:
                    oc.listarVendas();
                    break;
                case 7:
                    oc.listarPedidos();
                    break;
                case 8:
                    System.out.println("Digite o id desejado:");
                    opcao2 = entrada.nextInt();
                    System.out.println("Digite a qtd em estoque nova:");
                    dadosC1 = entrada.nextInt();
                    oc.alterarEstoque(opcao2, dadosC1);
                    break;
                case 9:                    
                    System.out.println("Digite o id desejado:");
                    opcao2 = entrada.nextInt();
                    teste = oc.removerCliente(opcao2);
                    break;
                case 10:
                    System.out.println("Digite o id desejado:");
                    opcao2 = entrada.nextInt();
                    teste = oc.removerProduto(opcao25);
                    break;
                case 11:
                    System.out.println("Digite o id desejado:");
                    opcao2 = entrada.nextInt();
                    oc.alterarCliente(opcao2);
                    break;
                
                default:
                    System.out.println("Opcao invalida");
                    break;
            }            
        } while (opcao != 0);
        
    }
}

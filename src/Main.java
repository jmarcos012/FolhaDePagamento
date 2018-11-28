import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int opcao = 0;
        int tipoSalario;
        ArrayList<Empregados> Funcionarios = new ArrayList<Empregados>();
        Scanner ler = new Scanner(System.in);
        do{
            System.out.println("*********** Folha de Pagamento ***********\n" +
                    "1 - Adicionar empregado\n" +
                    "2 - Ramover empregado\n" +
                    "3 - Cartão de ponto\n" +
                    "4 - Resultado de vendas\n" +
                    "5 - alterar detalhes de um empregado\n" +
                    "6 - Folha de pagamento para o dia\n" +
                    "0 - Sair");
            opcao = ler.nextInt();

            if(opcao == 1)
            {
                ler.nextLine();
                Empregados novoFuncionario = new Empregados();
                String nomeFuncionario;
                String enderecoFuncionario;

                System.out.println("Digite o nome do funcionario");
                nomeFuncionario = ler.nextLine();
                novoFuncionario.setNome(nomeFuncionario);

                System.out.println("Digite o endereço do funcionario");
                enderecoFuncionario = ler.nextLine();
                novoFuncionario.setEndereco(enderecoFuncionario);

                System.out.println("Qual tipo de salario do funcionario?\n" +
                        "1 - Salário horário\n" +
                        "2 - Salário mensal\n" +
                        "3 - Comissão");
                tipoSalario = ler.nextInt();

                double salario;
                if(tipoSalario == 1)
                {
                    novoFuncionario.setTipoSalario("Salário horário");
                    System.out.println("Qual sera o salário por hora do funcionario?");
                    salario = ler.nextDouble();
                    novoFuncionario.setSalario(salario);
                }
                else if(tipoSalario == 2)
                {
                    novoFuncionario.setTipoSalario("Salário mensal");
                    System.out.println("Qual sera o salário mensal do funcionario?");
                    salario = ler.nextDouble();
                    novoFuncionario.setSalario(salario);
                }
                else if(tipoSalario == 3)
                {
                    novoFuncionario.setTipoSalario("Comissão");
                    System.out.println("Qual sera a comissão por vanda do funcionario em %?");
                    salario = ler.nextDouble();
                    novoFuncionario.setComissao(salario);
                }

                System.out.println("O funcionario pertence ao sindicato?\n" +
                        "1 - Sim\n" +
                        "2 - Não");
                int sindicato = ler.nextInt();

                if(sindicato == 1)
                {
                    System.out.println("Qual valor da taxa?");
                    double taxa = ler.nextDouble();
                    novoFuncionario.setTaxaSindical(taxa);
                    System.out.println("O sindicato oferece algum outro serviço ao funcionario?\n" +
                            "1 - Sim\n" +
                            "2 - Não");
                    int servico = ler.nextInt();
                    if(servico == 1)
                    {
                        System.out.println("Quanto custa a taxa de serviços?");
                        double taxaservico = ler.nextDouble();
                        novoFuncionario.setServicosAdicioanais(taxaservico);
                    }
                    else if(servico == 2)
                    {
                        novoFuncionario.setServicosAdicioanais(0);
                    }
                }
                else if(sindicato == 2)
                {
                    novoFuncionario.setTaxaSindical(0);
                }

                Funcionarios.add(novoFuncionario);
                System.out.println("*****Funcionario cadastrado*****");
            }
            else if(opcao == 2)
            {
                ler.nextLine();
                System.out.println("Digite o nome do empregado!");
                String empregadoRemover;
                empregadoRemover = ler.nextLine();

                for(int i=0;i<Funcionarios.size();i++)
                {
                    if(Funcionarios.get(i).getNome().equals(empregadoRemover))
                    {
                        Funcionarios.remove(i);
                        System.out.println("*****Funcionario removido*****");
                    }
                }

            }
            else if(opcao == 3)
            {
                ler.nextLine();
                System.out.println("Digite o nome do funcionario!");
                String nomeCartao = ler.nextLine();
                CartaoDePonto cartao = new CartaoDePonto();

                for (int i = 0; i<Funcionarios.size();i++)
                {
                    if(Funcionarios.get(i).getNome().equals(nomeCartao))
                    {
                        System.out.println("Digite a quantidade de horas trabalhadas");
                        int quantidadeHoras = ler.nextInt();
                        Funcionarios.get(i).ho(quantidadeHoras);
                    }
                }
            }
            else if(opcao == 4)
            {
                ler.nextLine();
                System.out.println("Digite o nome do usuario!");
                String vendas = ler.nextLine();
                for (int i =0 ; i<Funcionarios.size();i++)
                {
                    if(Funcionarios.get(i).getNome().equals(vendas))
                    {
                        System.out.println("Digite quanto esse funcionario vendeu!");
                        double valorvendas = ler.nextDouble();
                        Funcionarios.get(i).setSalario(valorvendas);
                    }
                }
            }
            else if(opcao == 5)
            {
                ler.nextLine();
                System.out.println("Digite o nomer do funcionario que deseja alterar!");
                String nomeAlterar;
                nomeAlterar = ler.nextLine();
                int alterar = 0;

                for(int i = 0;i<Funcionarios.size();i++)
                {
                    if(Funcionarios.get(i).getNome().equals(nomeAlterar))
                    {
                        System.out.println("O que deseja alterar?\n" +
                                "1 - Nome\n" +
                                "2 - endereço\n" +
                                "3 - Forma de pagamento\n");
                        alterar = ler.nextInt();

                        do {
                            ler.nextLine();
                            if(alterar == 1)
                            {
                                String novoNome = ler.nextLine();
                                Funcionarios.get(i).setNome(novoNome);
                            }
                            else if(alterar == 2)
                            {
                                String novoEndereco = ler.nextLine();
                                Funcionarios.get(i).setEndereco(novoEndereco);
                            }
                            else if(alterar == 3)
                            {
                                String novaForma = ler.nextLine();
                                Funcionarios.get(i).setTipoSalario(novaForma);
                            }

                            System.out.println("Gostaria de alterar mais alguma coisa deste funcionario?\n" +
                                    "1 - Nome\n" +
                                    "2 - endereço\n" +
                                    "3 - Forma de pagamento\n" +
                                    "0 - Sair\n");

                            alterar = ler.nextInt();
                        }while (alterar != 0);
                    }
                }
            }
            else if(opcao == 6)
            {
                for(int i=0;i<Funcionarios.size();i++)
                {
                    System.out.println(Funcionarios.get(i).getNome() + "\t");
                    if(Funcionarios.get(i).getTipoSalario().equals("Salário horário"))
                    {
                        System.out.println("R$" + Funcionarios.get(i).getHoras() * Funcionarios.get(i).getSalario());
                    }
                    else if(Funcionarios.get(i).getTipoSalario().equals("Salário mensal"))
                    {
                        System.out.println("R$" + Funcionarios.get(i).getSalario());
                    }
                    else if(Funcionarios.get(i).getTipoSalario().equals("Comissão"))
                    {
                        System.out.println("Total de vendas R$" + Funcionarios.get(i).getSalario());
                        System.out.println("Comissão " + Funcionarios.get(i).getComissao() + "%");
                        System.out.println("Taxa do Sindicato R$" + Funcionarios.get(i).getTaxaSindical());
                        System.out.println("Serviços adicionais R$" + Funcionarios.get(i).getServicosAdicioanais());
                        System.out.println("Salário R$" + (Funcionarios.get(i).getComissao()/100)*Funcionarios.get(i).getSalario());
                    }
                }
            }

        }while(opcao != 0);
    }
}

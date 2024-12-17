//Nome: Carlos Eduardo Martins Ferreira RA: 2576163

import java.util.ArrayList;

public class Principal {

    public static void main(String arg[]) {

        ArrayList<Dvd> dvds = new ArrayList<>();
        ArrayList<Locatario> clientes = new ArrayList<>();
        ArrayList<Locacao> locacoes = new ArrayList<>();

        int opcao = 10;

        while (opcao != 0) {
            opcao = exibirMenuPrincipal();
            switch (opcao) {
                case 1:
                    Locatario l1 = cadastrarCliente();
                    clientes.add(l1);
                    break;

                case 2:
                    Filme f1 = cadastrarFilme();
                    dvds.add(f1);
                    break;

                case 3:
                    Seriado s1 = cadastrarSeriado();
                    dvds.add(s1);
                    break;
                case 4:
                    Documentario d1 = cadastrarDocumentario();
                    dvds.add(d1);
                    break;
                case 5:
                    cadastrarLocacao(dvds, clientes, locacoes);
                    break;
                case 6:
                    cadastraDevolucao(dvds, clientes, locacoes);
                    break;

                case 7:
                    exibirInformacoes(dvds, clientes, locacoes);
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente. Opções válidas: 0 - 7.");
                    break;
            }
        }

    }

    //Método que exibe o menu principal:
    public static int exibirMenuPrincipal() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Cadastrar Filme");
        System.out.println("3. Cadastrar Seriado");
        System.out.println("4. Cadastrar Documentário");
        System.out.println("5. Locar DVD");
        System.out.println("6. Devolver DVD");
        System.out.println("7. Exibir...");
        System.out.println("0. Sair");
        int opcao = -1;
        try {
            opcao = Integer.parseInt(Leitura.entDados("\nEscolha uma opção: "));
        } catch (NumberFormatException nfe) {
        }
        return opcao;
    }

    //Método que cadastra cliente. (Case 1):
    public static Locatario cadastrarCliente() {
        boolean atributoInvalido = true;
        Locatario l1 = new Locatario();

        System.out.println("----------------------------------------------\nLocatario:");
        l1.setNome(Leitura.entDados("\nInforme o nome: "));
        while (atributoInvalido) {
            try {
                l1.setCpf(Leitura.entDados("\nInforme o CPF: "));
                atributoInvalido = false;
            } catch (CpfException CpfExcpt) {
                atributoInvalido = true;
                System.err.println(CpfExcpt);
            }
        }
        atributoInvalido = true;
        while (atributoInvalido){
            try {
                l1.setTelefone(Leitura.entDados("\nInforme o numero para contato: "));
                atributoInvalido = false;
            } catch (TelefoneException TelExcpt) {
                atributoInvalido = true;
                System.err.println(TelExcpt);
            }
        }
        
        System.out.println("\nCliente cadastrado com sucesso!\n----------------------------------------------\n");
        return l1;
    }

    //Método que cadastra filme. (Case 2):
    public static Filme cadastrarFilme() {
        System.out.println("----------------------------------------------\nFilme:");
        Filme f1 = new Filme();
        boolean entradaValida = true;

        while (entradaValida) {
            try {
                f1.setCodigo(Integer.parseInt(Leitura.entDados("\nInforme o codigo do filme: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }
        f1.setTitulo(Leitura.entDados("\nInforme o titulo do filme: "));

        f1.setGenero(Leitura.entDados("\nInforme o genero do filme: "));

        entradaValida = true;
        while (entradaValida) {
            try {
                f1.setImdb(Integer.parseInt(Leitura.entDados("\nInforme o primeiro digito do imdb do filme: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }

        entradaValida = true;
        while (entradaValida) {
            try {
                f1.setAno(Integer.parseInt(Leitura.entDados("\nInforme o ano de lancamento: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }

        entradaValida = true;
        while (entradaValida) {
            try {
                f1.setDuracao(Integer.parseInt(Leitura.entDados("\nInforme a duracao do filme em minutos: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }
        System.out.println("\nFilme cadastrado com sucesso!\n----------------------------------------------\n");
        return f1;
    }

    //Método que cadastra série. (Case 3):
    public static Seriado cadastrarSeriado() {
        Seriado s1 = new Seriado();
        boolean entradaValida = true;

        System.out.println("----------------------------------------------\nSeriado:");

        while (entradaValida) {
            try {
                s1.setCodigo(Integer.parseInt(Leitura.entDados("\nInforme o codigo do seriado: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }

        s1.setTitulo(Leitura.entDados("\nInforme o titulo do seriado: "));
        s1.setGenero(Leitura.entDados("\nInforme o genero do seriado: "));
        
        entradaValida = true;
        while (entradaValida) {
            try {
                s1.setAno(Integer.parseInt(Leitura.entDados("\nInforme o ano de lancamento: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }

        entradaValida = true;
        while (entradaValida) {
            try {
                s1.setTemporadas(Integer.parseInt(Leitura.entDados("\nInforme a quantidade de temporadas: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }

        entradaValida = true;
        while (entradaValida) {
            try {
                s1.setEpisodios(Integer.parseInt(Leitura.entDados("\nInforme a quantidade de episodios(total): ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }

        System.out.println("\nSeriado cadastrado com sucesso!\n----------------------------------------------\n");
        return s1;
    }

    //Método que cadastra documentário. (Case 4):
    public static Documentario cadastrarDocumentario(){
        Documentario d1 = new Documentario();

        System.out.println("----------------------------------------------\nDocumentário:");
        boolean entradaValida = true;

        while (entradaValida) {
            try {
                d1.setCodigo(Integer.parseInt(Leitura.entDados("\nInforme o codigo do documentário: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }
        d1.setTitulo(Leitura.entDados("\nInforme o titulo do documentário: "));

        d1.setGenero(Leitura.entDados("\nInforme o genero do documentário: "));

        d1.setTema(Leitura.entDados("\nInforme o tema do documentário: "));
        
        d1.setNarrador(Leitura.entDados("\nInforme o narrador do documentário: "));

        

        entradaValida = true;
        while (entradaValida) {
            try {
                d1.setAno(Integer.parseInt(Leitura.entDados("\nInforme o ano de lancamento: ")));
                entradaValida = false;
            } catch (NumberFormatException nfe) {
                System.out.println("\nEntrada inválida, tente novamente!");
                entradaValida = true;
            }
        }

        System.out.println("\nDocumentário cadastrado com sucesso!\n----------------------------------------------\n");

        return d1;
    }

    //Método que cadastra a locação. (Case 5):
    public static void cadastrarLocacao(ArrayList<Dvd> dvds, ArrayList<Locatario> clientes, ArrayList<Locacao> locacoes) {
        System.out.println("===== Locação de Dvd =====");
        String cpfCliente = Leitura.entDados("\nInforme o CPF do cliente: ");
        Locatario locatario = null;
        for (Locatario cliente : clientes) {
            if (cliente.getCpf().equals(cpfCliente)) {
                locatario = cliente;
                break;
            }
        }

        if (locatario == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        int codigoDvd = Integer.parseInt(Leitura.entDados("Informe o código do DVD: "));
        Dvd dvdParaLocar = null;

        for (Dvd dvd : dvds) {
            if (dvd.getCodigo() == codigoDvd) {
                dvdParaLocar = dvd;
                break;
            }
        }

        if (dvdParaLocar == null || !dvdParaLocar.getDisponivel()) {
            System.out.println("DVD indisponivel para locar.");
            return;
        }

        dvdParaLocar.setDisponivel(false);
        Locacao novaLocacao = new Locacao(locatario, dvdParaLocar, Leitura.entDados("Informe a data de locação (dd/mm/aaaa): "));
        System.out.println("DVD locado com sucesso!");
        locacoes.add(novaLocacao);
    }

    //Método que cadastra a devolução. (Case 6):
    public static void cadastraDevolucao(ArrayList<Dvd> dvds, ArrayList<Locatario> clientes, ArrayList<Locacao> locacoes) {
        System.out.println("===== Devolução de DVD =====");

        int codigoDvdDevolucao = 0;
        try {
            codigoDvdDevolucao = Integer.parseInt(Leitura.entDados("Informe o código do DVD a ser devolvido: "));
        } catch (NumberFormatException nfe) {
        }
        Locacao locacaoEncontrada = null;

        for (Locacao locacao : locacoes) {
            if (locacao.getDvd().getCodigo() == codigoDvdDevolucao && !locacao.getDvd().getDisponivel()) {
                locacaoEncontrada = locacao;
                break;
            }
        }

        if (locacaoEncontrada == null) {
            System.out.println("Locação não encontrada ou DVD já devolvido.");
            return;
        }

        locacaoEncontrada.getDvd().setDisponivel(true);
        locacaoEncontrada.setDataDevolucao(Leitura.entDados("Digite a data da devolução: "));
        locacaoEncontrada.finalizarLocacao();
        System.out.println("Devolução registrada com sucesso!");
    }

    //Método que exibe informações. (Case 7):
    public static void exibirInformacoes(ArrayList<Dvd> dvds, ArrayList<Locatario> clientes, ArrayList<Locacao> locacoes) {
        int opcaoExibir = 1;
        while (opcaoExibir != 0) {
            System.out.println("===== Exibir: =====");
            System.out.println("1. Clientes");
            System.out.println("2. Dvds");
            System.out.println("3. Locações ativas");
            System.out.println("4. Histórico de locações");
            System.out.println("0. Sair");
            try {
                opcaoExibir = Integer.parseInt(Leitura.entDados("\nEscolha uma opção: "));
            } catch (NumberFormatException nfe) {
            }
            switch (opcaoExibir) {

                case 1:
                    System.out.println("====== Lista de clientes =====");
                    for (Locatario cliente : clientes) {
                        System.out.println("\nNome: " + cliente.getNome());
                        System.out.println("CPF: " + cliente.getCpf());
                        System.out.println("Telefone: " + cliente.getTelefone());
                        System.out.println("----------------------------");
                    }
                    break;
                case 2:
                    System.out.println("===== Lista de DVDs =====");
                    for (Dvd dvd : dvds) {
                        if (dvd instanceof Filme) {
                            Filme filme = (Filme) dvd;
                            System.out.println("Filme:");
                        } else if (dvd instanceof Seriado) {
                            Seriado seriado = (Seriado) dvd;
                            System.out.println("Seriado:");
                        } else if (dvd instanceof Documentario){
                            Documentario documentario = (Documentario) dvd;
                            System.out.println("Documentário:");
                        }

                        System.out.println("Código: " + dvd.getCodigo());
                        System.out.println("Título: " + dvd.getTitulo());
                        System.out.println("Gênero: " + dvd.getGenero());
                        System.out.println("Lançamento: " + dvd.getAno());

                        if (dvd.getDisponivel()) {
                            System.out.println("Disponível: Sim");
                        } else {
                            System.out.println("Disponível: Não");
                        }

                        if (dvd instanceof Filme) {
                            Filme filme = (Filme) dvd;
                            System.out.println("Duração: " + filme.getDuracao() + " minutos");
                            System.out.println("Imdb: " + filme.getImdb());
                        } else if (dvd instanceof Seriado) {
                            Seriado seriado = (Seriado) dvd;
                            System.out.println("Temporadas: " + seriado.getTemporadas());
                            System.out.println("Episodios: " + seriado.getEpisodios());
                        } else if (dvd instanceof Documentario){
                            Documentario documentario = (Documentario) dvd;
                            System.out.println("Tema: " + documentario.getTema());
                            System.out.println("Narrador: " +documentario.getNarrador());
                        }
                        System.out.println("\n----------------------------\n");
                    }
                    break;
                case 3:
                    System.out.println("===== Lista de Locações Ativas =====");
                    for (Locacao locacao : locacoes) {
                        if (locacao.getLocacaoAtiva()) {
                            System.out.println(locacao.getResumo());
                            
                        }
                        System.out.println("----------------------------");
                    }
                    break;
                case 4:
                    System.out.println("===== Histórico de Locações =====");
                    for (Locacao locacao : locacoes) {
                        System.out.println(locacao.getResumo());
                        System.out.println("Data da devolução: ");
                        if(locacao.getDataDevolucao() == null){
                            System.out.println("Dvd ainda não foi devolvido!");
                        }else{
                            System.out.println(locacao.getDataDevolucao());
                        }
                        System.out.println("----------------------------");
                    }
                    System.out.println("----------------------------");
                    break;
                case 0:
                    System.out.println("\nVoltando...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente. Opções válidas: 0 - 4.");
                    break;
            }
        }
    }
}

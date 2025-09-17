import java.util.Scanner;

public class trabGrauA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Info das vendas
        String historicoVendas = "";
        double totalVendas = 0;
        String clienteMaiorCompra = "";
        double valorMaiorVenda = 0;
        String maiorVendaQtd = "";

        // info do estoque
        int estoqueCalca = 20; double precoCalca = 112.00; String calca = "Calça";
        int estoqueCamisa = 18; double precoCamisa = 95.00;  String camisa = "Camisa";
        int estoqueBermuda = 23; double precoBermuda = 49.90;  String bermuda = "Bermuda";
        int estoqueSaia = 12; double precoSaia = 169.00; String saia = "Saia";
        int estoqueBlusa = 9; double precoBlusa = 120.00; String blusa = "Blusa";
        int estoqueMoletom = 4; double precoMoletom = 135.00; String moletom = "Moletom";
        int estoqueMeia = 17; double precoMeia = 12.99;  String meia = "Meia";
        int estoqueTenis = 8; double precoTenis = 183.00; String tenis = "Tênis";
        int estoqueBota = 3; double precoBota = 219.90; String bota = "Bota";

        //menu 
        int opcaoMenu;

        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1. Registrar venda");
            System.out.println("2. Repor estoque");
            System.out.println("3. Mostrar estoque");
            System.out.println("4. Histórico de vendas");
            System.out.println("5. Maior venda");
            System.out.println("6. Integrantes");
            System.out.println("7. Sair");
            System.out.print("Escolha uma das opções: ");
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();

            // registrar a venda 
            if(opcaoMenu == 1){
                System.out.println("\nNome do Cliente: ");
                String nomeCliente = scanner.nextLine();
                double totalVenda = 0;
                String itensVenda = "";

                //validar codigo produto e seguir venda
                while(true){
                    System.out.print("\nInsira o código do Produto: (Digite 0 para finalizar) ");
                    int codProduto = scanner.nextInt();
                    if ( codProduto == 0) break; 

                    System.out.print("\nDigite a quantidade que deseja comprar: ");
                    int qtd = scanner.nextInt();

                    boolean valido = true;
                    double subtotal = 0;
                    String item = "";

                    if(codProduto == 1){ 
                        if ( qtd <= estoqueCalca){subtotal = qtd * precoCalca; estoqueCalca -= qtd; item = calca;}
                        else valido = false;
                     } else if (codProduto == 2){
                        if(qtd <= estoqueCamisa){subtotal = qtd * precoCamisa; estoqueCamisa -= qtd; item = camisa;}
                        else valido = false;
                     }else if (codProduto == 3){
                        if(qtd <= estoqueBermuda){subtotal = qtd * precoBermuda; estoqueBermuda -= qtd; item = bermuda;}
                        else valido = false;
                     }else if (codProduto == 4){
                        if(qtd <= estoqueSaia){subtotal = qtd * precoSaia; estoqueSaia -= qtd; item = saia;}
                        else valido =false;
                     }else if(codProduto== 5){
                        if(qtd<= estoqueBlusa){subtotal = qtd * precoBlusa; estoqueBlusa -= qtd; item = blusa;}
                        else valido = false;
                     }else if(codProduto == 6){
                        if(qtd<=estoqueMoletom){subtotal = qtd * precoMoletom; estoqueMoletom -= qtd; item = moletom;}
                        else valido = false;
                     }else if(codProduto == 7){
                        if(qtd<=estoqueMeia){subtotal = qtd * precoMeia; estoqueMeia -= qtd; item = meia;}
                        else valido = false;
                     }else if(codProduto == 8){
                        if(qtd<=estoqueTenis){subtotal = qtd * precoTenis; estoqueTenis -= qtd; item = tenis;}
                        else valido = false;
                     }else if(codProduto == 9){
                        if(qtd<=estoqueBota){subtotal = qtd * precoBota; estoqueBota -= qtd; item = bota;}
                        else valido = false;
                     } else{
                        System.out.print("\nCódigo inválido");
                        valido = false;
                     }

                     if(!valido){
                        System.out.print("\nEstoque insuficiente ou produto não existe");
                     }else{
                        totalVenda += subtotal;
                        itensVenda += qtd + "x " + item + " (R$ " + String.format("%.2f", subtotal) + ")\n";
                     }
                }
                System.out.println("\nSubtotal= R$ " + String.format("%.2f", totalVenda));
                historicoVendas += "\nCliente: " + nomeCliente + "\n" + itensVenda + "Subtotal: R$ " + String.format("%.2f",totalVenda) + "\n\n";
                totalVendas += totalVenda;

                if(totalVenda > valorMaiorVenda){
                    valorMaiorVenda = totalVenda;
                    clienteMaiorCompra = nomeCliente;
                    maiorVendaQtd = itensVenda;

                }
            }

            //repor estoque
            else if (opcaoMenu == 2){

                System.out.print("\nInsira o Código do Produto: ");
                int codProduto = scanner.nextInt();
                System.out.print("\nInsira a quantidade que deseja repor: ");
                int qtd = scanner.nextInt();

                if( codProduto == 1 ) estoqueCalca += qtd;
                else if ( codProduto == 2 ) estoqueCamisa += qtd;
                else if ( codProduto == 3 ) estoqueBermuda += qtd;
                else if ( codProduto == 4 ) estoqueSaia += qtd;
                else if ( codProduto == 5 ) estoqueBlusa += qtd;
                else if ( codProduto == 6 ) estoqueMoletom += qtd;
                else if ( codProduto == 7 ) estoqueMeia += qtd;
                else if ( codProduto == 8 ) estoqueTenis += qtd;
                else if ( codProduto == 9 ) estoqueBota += qtd; 
                else System.out.println("\nCódigo Inválido");
            }

            // mostrar estoque
            else if (opcaoMenu == 3){
                System.out.println("\n  Estoque  ");
                System.out.println("1 - " + calca + " - " + " qtd: "+ estoqueCalca + " - R$: " + precoCalca);
                System.out.println("2 - " + camisa + " - " + " qtd: "+ estoqueCamisa + " - R$: " + precoCamisa);
                System.out.println("3 - " + bermuda + " - " + " qtd: "+ estoqueBermuda + " - R$: " + precoBermuda);
                System.out.println("4 - " + saia + " - " + " qtd: "+ estoqueSaia + " - R$: " + precoSaia);
                System.out.println("5 - " + blusa + " - " + " qtd: "+ estoqueBlusa + " - R$: " + precoBlusa);
                System.out.println("6 - " + moletom + " - " + " qtd: "+ estoqueMoletom + " - R$: " + precoMoletom);
                System.out.println("7 - " + meia + " - " + " qtd: "+ estoqueMeia + " - R$: " + precoMeia);
                System.out.println("8 - " + tenis + " - " + " qtd: "+ estoqueTenis + " - R$: " + precoTenis);
                System.out.println("9 - " + bota + " - " + " qtd: "+ estoqueBota + " - R$: " + precoBota);

            }

            //histórico de vendas
            else if (opcaoMenu == 4){
                System.out.println("\n Histórico de vendas ");
                System.out.println(historicoVendas);
                System.out.println("\nTotal das Vendas: " + String.format("%.2f", totalVendas));
            }

            //Maior Venda
            else if (opcaoMenu == 5){
                 System.out.println("\n Maior Venda ");
                  System.out.println("\nCliente: " + clienteMaiorCompra);
                   System.out.println(maiorVendaQtd);
                    System.out.println("\nTotal: R$ " + String.format("%.2f", valorMaiorVenda));

            }

            //Integrantes
            else if (opcaoMenu == 6){
                System.out.println("\nIntegrantes do Grupo: ");
                System.out.println("\nJoão Vitor Soares Rosa, Pedro Gabriel Oliveira e Victor Fernandes dos Anjos");

            }
        }while(opcaoMenu!=7);
        scanner.close();
        System.out.println("\nEncerrando Programa...ITS OVER");
         
        
    }
}

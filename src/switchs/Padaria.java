package switchs;

import java.util.Scanner;

class Padaria {
  public static void main(String[] args) {

    Scanner ler=new Scanner(System.in);
    
        int opLanche=0;
        String op=new String();
        double comanda=0;
        int cod=14;
        double valT=0;
        String nomeT=new String();
        int codT=0;
        int codigo[]=new int[100];
        int quantia[]=new int[100];
        String cliente=new String();
        String lanches[]=new String[100];
        double valor[]=new double[100];

        System.out.printf("Digite o seu nome: ");
        cliente=ler.next();
        int q=0;
        boolean teste=true;
        boolean condicao=true;
        int i=0;
        int id=14;
        
        lanches[0]="Pastel";
        lanches[1]="Pizza";
        lanches[2]="Pão";
        lanches[3]="Café";
        lanches[4]="Suco";
        
        codigo[0]=10;
        codigo[1]=11;
        codigo[2]=12;
        codigo[3]=13;
        codigo[4]=14;
        
        valor[0]=6;
        valor[1]=5;
        valor[2]=0.15;
        valor[3]=4;
        valor[4]=3;
        
        System.out.printf("Olá %s! Seja muito bem vindo(a), Digite uma das opções abaixo.\n\n",cliente);
        do{
          System.out.printf("[a]Visualizar comanda\n[b]Adicionar itens\n[c]Pagamento\n[d]Sair\n[e]Cadastrar produto\n[f]Alterar valor de um produto\nOpcão:");
          op=ler.next().toLowerCase();
        
          switch(op){
            case "a":
              System.out.printf("R$%.2f\n",comanda);
              break;

            case "b":
              for(i=0;i!=100;i++){
                  if(valor[i]!=0){
                      System.out.printf("[%d] %7s R$%.2f\n",codigo[i],lanches[i],valor[i]);
                  }
              }
                System.out.print("Opção:");
                opLanche=ler.nextInt();
                
            for(i=0;i!=100;i++){
                
                 if(codigo[i]==opLanche){
                     System.out.printf("Quanto(s) %s(s) deseja adicionar na comanda?\n",lanches[i]);
                     System.out.printf("quantidade: ");
                     quantia[i]=ler.nextInt();
                     
                     if(quantia[i]>0){
                     comanda+=valor[i]*quantia[i];  
                     q++;
                     }else{
                         System.out.println("A quantidade miníma é 1!");
                         quantia[i]=0;
                     }
                 }
            }
                break;
            case "c":
                
                if(comanda>0){
                    System.out.printf("~~~~Comaanda:R$%.2f~~~~\n",comanda);
                    
                    for(i=0;i<100;i++){
                        if(quantia[i]>0){
                            System.out.printf("[ %d ] x %7s = R$%.2f\n",quantia[i],lanches[i],valor[i]);
                        }
                    }
                    System.out.printf("Cliente:%s\n\n",cliente);
                    
                    comanda=0;
                    
                }else{
                    System.out.println("Não há nenhum valor em aberto para pagamento!");
                }
                break;
                
            case "d":
                if(comanda>0){
                    System.out.println("Há uma comanda aberta, trate dela para poder prosseguir!");
                }else{
                    System.out.println("Saindo...\n");
                    condicao=false;
                }
                break;
            case "e":
                
                System.out.printf("Qual nome deseja utilizar no cadastro?");
                nomeT=ler.next();
                
                i=0;
                while(teste && i!=100){
                    if(lanches[i].equals(nomeT)){
                        System.out.println("Nome já em uso!");
                    }else{
                        lanches[i+5]=nomeT;
                        
                          System.out.printf("Qual valor desejas adicionar para %s ?R$",lanches[i+5]);
                          valT=ler.nextDouble();
                          
                          if(valT>0){
                              valor[i+5]=valT;
                              
                              id++;
                              
                              
                                  codigo[i+5]=id;
                                  System.out.println("Produto cadastrado com sucesso!");
                                  teste=false;
                              
                          }else if(valor[i]<0){
                              System.out.println("Cadastre um valor maior R$0,00!");
                          }i++;
                    }
                }
                teste=true;
                
                 break;
                 
            case "f":
                
                System.out.println("Digite o código do produto que desejas atualizar: ");
                codT=ler.nextInt();
                
                for(i=0;i<100;i++){
                    if(codT==codigo[i]){
                        System.out.printf("Qual valor deseja colocar à %s ?R$",lanches[i]);
                        valT=ler.nextDouble();
                        
                        if(valT>0){
                            valor[i]=valT;
                        }else{
                            System.out.println("Valor deve ser maior que R$0,00!");     
                        }
                    }
                }
                break;

                default:
                System.out.printf("O código digitado não condiz com as opções acima!\n");
          }  
          
        }while(condicao);
  }
}
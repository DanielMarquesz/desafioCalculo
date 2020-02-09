/*
 * Esse código foi desenvolvido primeiramente em python por mim,
 * veracidade da informação em https://github.com/DanielMarquesz/Exercicios_Uri/blob/master/calculoINSS.py
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class desafioCalc {
    
    public static float exibirINSS(float salario){ // Função que recebe o salário e retorna o desconto do INSS
        DecimalFormat dc = new DecimalFormat("0.00");
        
        float descontoINSS = 0;
        
        if ((salario >= 0) && (salario <= 1751.81)) {                          /* Salários abaixo de 1751.81 */
            descontoINSS = salario * 0.08f;
            System.out.println("ImpostoINSS: R$ " + dc.format(descontoINSS));
            
         }
         
         
         else if ((salario >= 1751.82) && (salario <= 2919.74)) {               /* Salários Entre 1751.82 e 2919.74 */
             descontoINSS = salario * 0.09f;
            System.out.println("ImpostoINSS: R$ " + dc.format(descontoINSS));
            
         }
         
         
         else if ((salario >= 2919.73) && (salario <= 5839.45)) {               /* Salários entre 2919.73 e 5839.45 */
             descontoINSS = salario * 0.11f;
            System.out.println("ImpostoINSS: R$ " + dc.format(descontoINSS));
            
         }
         
         else if (salario >= 5839.45) {                                         /* Salários acima de 5839.45 */
             descontoINSS = 642.34f;
             System.out.println("ImpostoINSS: R$ " + dc.format(descontoINSS));
             
         }
        return descontoINSS;
    }
    
    
    public static float exibirIRPF(float salarioBase){
        DecimalFormat dc = new DecimalFormat("0.00");
        
        float impostoIRPF = 0;
        float saldo = 0;
        
        if  ((salarioBase > 0)&& (salarioBase <= 1903.98)){                    /* Salarios acima de 0 e 1903.98 */
            impostoIRPF = salarioBase * 0.0f;                                   /* Regra alíquota 0% */
            System.out.println("ImpostoIRPF: R$ " + dc.format(impostoIRPF));                                                           
             
             
         }
         
         else if ((salarioBase >= 1903.98) && (salarioBase <= 2826.65)){        /* Salarios entre 1903.99 e 2826.65 */
            impostoIRPF = salarioBase * 0.075f;                                 /* Regra alíquota 7,5% */
            saldo = impostoIRPF - 142.80f;
            System.out.println("ImpostoIRPF: R$ " + dc.format(saldo));       
            
        }
         
         else if ((salarioBase >= 2826.66) && (salarioBase <= 3751.05)){        /* Salarios entre 2826.66 e 3751.05 */
             impostoIRPF = salarioBase * 0.15f;                                 /* Regra alíquota 15% */
             saldo = impostoIRPF - 354.80f;
             System.out.println("ImpostoIRPF: R$ " + dc.format(saldo));
         }
         
         else if ((salarioBase >= 3751.06) && (salarioBase <= 4664.68)){        /* Salarios entre 3751.06 e 4664.68 */
             impostoIRPF = salarioBase * 0.225f;                                /* Regra alíquota 22,5% */
             saldo = impostoIRPF - 636.13f;
             System.out.println("ImpostoIRPF: R$ " + dc.format(saldo));
         }
         
         else if (salarioBase >= 4664.68) {                                     /* Salarios acima de 4664.68 */
             impostoIRPF = salarioBase * 0.275f;                                /* Regra alíquota 27.5% */
             saldo = impostoIRPF - 869.36f;
             System.out.println("ImpostoIRPF: R$ " + dc.format(saldo));
         }                  
        return saldo;
    }
    

     public static void main(String[] args) {  /******************************** PROGRAMA PRINCIPAL ************************************/
         
        Scanner entrada = new Scanner(System.in);               
        DecimalFormat dc = new DecimalFormat("0.00");
        
        // Variáveis                 
        float saldo = 0;
        float descDependente = 0;
        float descontoINSS = 0;
        float descontoIRPF = 0;
        float salarioBase = 0;
        float salarioDescontado = 0;
        float salarioFinal = 0;
        float valDependente = 189.59f;
        float impostoIRPF = 0;                                   
                                                                    // ENTRADA DE DADOS
        System.out.println("Digite o Valor do Salário: ");
        float salario = entrada.nextFloat();                        // Valor do Salário
        System.out.println("Digite Número de Dependentes: ");
        int dependentes = entrada.nextInt();                        // Num de Dependentes
                           
        descontoINSS = exibirINSS(salario);                        
         
        salarioBase = salario - descontoINSS;
        salarioFinal = salarioBase;          
                  
        if (dependentes > 0){
            descDependente = dependentes * valDependente;
            salarioBase = salarioBase - descDependente;
        }
                  
        saldo = exibirIRPF(salarioBase);
        salarioDescontado = saldo + descontoINSS;
        salarioFinal = salario - salarioDescontado;
         
        System.out.println("Total de Descontos: R$ " + dc.format(salarioDescontado));
        System.out.println("Salario Com Descontos: R$ " + dc.format(salarioFinal));
         
    }   
     
    
}

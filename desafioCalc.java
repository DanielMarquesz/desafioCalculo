/*
 * Esse código foi desenvolvido primeiramente em python por mim,
 * veracidade da informação em https://github.com/DanielMarquesz/Exercicios_Uri/blob/master/calculoINSS.py
 */
package desafiocalc;

public class desafioCalc {

     public static void main(String[] args) {
         
         
         /* Variáveis Deaclaradas */
         
        float var = 0;
        float descDependente = 0;
        float descontoINSS = 0;
        float descontoIRPF = 0;
        float salarioBase = 0;
        float salarioFinal = 0;
        float valDependente = 189.59f;
         
        /* Entrada de Dados */
        float salario = 6000.00f;
        int dependentes = 2;
            
         System.out.println("###################################################");
         
         
         /* Cálculo do desconto INSS */
         
         if ((salario >= 0) && (salario <= 1751.81)) {                /* Salários abaixo de 1751.81 */
             descontoINSS = salario * 0.08f;
            System.out.println("ImpostoINSS: R$" + descontoINSS);
         }
         
         
         else if ((salario >= 1751.82) && (salario <= 2919.74)) {     /* Salários Entre 1751.82 e 2919.74 */
             descontoINSS = salario * 0.09f;
            System.out.println("ImpostoINSS: R$" + descontoINSS);
         }
         
         
         else if ((salario >= 2919.73) && (salario <= 5839.45)) {     /* Salários entre 2919.73 e 5839.45 */
             descontoINSS = salario * 0.11f;
            System.out.println("ImpostoINSS: R$" + descontoINSS);     
         }
         
         else if (salario >= 5839.45) {                               /* Salários acima de 5839.45 */
             descontoINSS = 642.34f;
             System.out.println("ImpostoINSS: R$" + descontoINSS);         
         }
            
         /************ Colocar um return para a Função calcINSS aqui ****************/
         
         
         salarioBase = salario - descontoINSS;
         salarioFinal = salarioBase;
         /* System.out.println(salarioFinal); */
         
         /** Calculo do desconto de Dependentes **/
         
         if (dependentes != 0){
             descDependente = dependentes * valDependente;
             System.out.println(descDependente);
         }
    }
    
}

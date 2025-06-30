//Você está organizando uma viagem internacional e precisa converter 
//uma quantia em reais (R$) para dólares americanos (US$) com base na taxa 
//de câmbio atual. A taxa utilizada no momento é de R$ 5,25 para cada US$ 1.
//Crie um programa que realize a conversão para dólares usando a 
//taxa de câmbio e exiba o valor convertido.

public class teste7{
    public static void main(String[] args){

        double valorReais = 451.50;
        double taxaCambio = 5.25;

        double valorDolares = valorReais / taxaCambio;
        System.out.println("o valor em dolares é :" + valorDolares);

    }
}
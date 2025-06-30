public class teste5 {
    public static void main(String[] args) {
        double preco = 150.00;

        //Econômico: preço até R$ 50,00.
        //Intermediário: preço entre R$ 50,01 e R$ 200,00.
        //Premium: preço acima de R$ 200,00. Exemplo de entrada:

        if(preco < 50.00) {
            System.out.println("o produto é economico");
            
        }else if (preco > 50.00 && preco <= 200.00){
            System.out.println("seu produto é intermediário");

        }else {
            System.out.println("Seu produto é premium");
        }

    }
    
}

//Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer 
//com o combustível disponível no tanque. Para isso, você precisa considerar:

//O consumo médio do veículo (km/l)
//A capacidade total do tanque de combustível (litros)
//A quantidade de combustível disponível no momento (litros)
//A distância da viagem planejada (km)
//Com essas informações, o programa deverá calcular:

//A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
//A autonomia atual, baseada na quantidade de combustível disponível.
//Se a quantidade de combustível atual será suficiente para percorrer um 
//determinado trajeto informado pelo usuário.
public class teste9 {
    public static void main(String[] args){
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual; 

        System.out.printf("A autonomia Maxima  %.1f km%n: " , autonomiaMaxima  );
        System.out.printf("A autonomia atual  %.1f km%n: " , autonomiaAtual );

        if(autonomiaAtual >= distanciaViagem) {
            System.out.println("A quantidade de combustivel atual é suficiente para percorrer a viagem planejada.");
        } else {
            System.out.println("A quantidade de combustivel atual não é suficiente para percorrer a viagem planejada.");
        }
            
        

    
 }
}
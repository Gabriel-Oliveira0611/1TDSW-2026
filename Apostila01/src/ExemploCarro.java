public class ExemploCarro {

    public static void main(String[] args) {
        // criar um objeto do tipo carro

        Carro gol = new Carro();

        //Colocar valores nos atributor do objeto
        gol.cor = "Prata";
        gol.velocidadeMaxima = 190;
        gol.ano = 2010;
        gol.automatico = false;
        gol.Peso = 600;
        gol.modelo = "Gol Special Bola";
        gol.altura = 1.5f;

        // Exibir o valor dos atributos
        //System.out.println("Modelo: " + gol.modelo);
        //System.out.println("Ano: " + gol.ano);
        //System.out.println("Cor: " + gol.cor);
        //System.out.println("Velocidade Máxima: " + gol.velocidadeMaxima);
        //System.out.println("É Automático? " + gol.automatico);
        //System.out.println("Peso: " + gol.Peso);
        //System.out.println("Altura: " + gol.altura);

        //Criar um novo objeto
        Carro fox = new Carro();

        //Atribuir valores paea 2 atributos e exibir esses valores
        fox.Peso = 1063;
        fox.ano = 2023;

        System.out.println("Peso do Fox: " + fox.Peso);
        System.out.println("Ano do fox: " + fox.ano);

    }

}

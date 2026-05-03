import java.util.Scanner;

public class CalculadoraPintura4261214294 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    System.out.println(" === ORÇAMENTO PINTURA ===");
    System.out.print("Informe a medida (em metros) de uma parede: ");
    double medidaParede = scanner.nextDouble();

    double areaTotal = (medidaParede * 2.70) * 4; 
    double areaLiquida = areaTotal * (1 - 0.10);
    double qtdeLitros = areaLiquida / 10;
    
    System.out.println(" === RESUMO DO ORÇAMENTO === ");
    System.out.printf("Área bruta das paredes: %.2f m²\n", areaTotal);
    System.out.printf("Área a ser pintada com desconto: %.2f m²\n", areaLiquida);
    System.out.printf("Total de tinta necessária: %.2f litros ", qtdeLitros);
    scanner.close();   
}

}

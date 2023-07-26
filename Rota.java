import javax.swing.JOptionPane;

public class Rota {
    public void planejarDia() {
        int numRotas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de rotas:"));
        double totalKm = 0;
        for (int i = 0; i < numRotas; i++) {
            double km = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem da rota " + (i + 1) + ":"));
            totalKm += km;
        }
        double consumo = totalKm / 2.5;
        double valorCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do óleo diesel:"));
        double custoTotal = consumo * valorCombustivel;
        JOptionPane.showMessageDialog(null, "Total de km: " + totalKm + "\nLitros de combustível necessários: " + consumo + "\nCusto total: R$" + custoTotal);
    }
}

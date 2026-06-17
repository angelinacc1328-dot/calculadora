import javax.swing.*;

public class Triangulo {

    //metodo lados iguales
    public void ladosiguales(int L1, int L2, int L3) {
        if (L1 == L2 && L2 == L3) {
            JOptionPane.showMessageDialog(null, "los lados son iguales, es equilatero");

        }
    }

    //metodo lados diferentes
    public void ladosdiferentes(int L1, int L2, int L3) {
        if (L1 != L2 && L2 != L3 && L1 != L3) {
            JOptionPane.showMessageDialog(null, "los lado son diferentes, es escaleno");

        }
    }
}
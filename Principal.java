/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Circulo;
public class Principal {
    public static void main(String[] args){
        Circulo C = new Circulo();
        C.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: ")));
        
        JOptionPane.showMessageDialog(null, "A Area é: " + C.getArea());
    }
}

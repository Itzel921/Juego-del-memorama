package Memoramass;

import javax.swing.*;

public class MenuInicio {

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        String[] options = {"6 cartas", "12 cartas", "20 cartas"};
        int choice = JOptionPane.showOptionDialog(null, "Selecciona una forma de jugar:", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0:
                GameFrame6Cartas game6 = new GameFrame6Cartas();
                game6.setVisible(true);
                break;
            case 1:
                GameFrame12Cartas game12 = new GameFrame12Cartas();
                game12.setVisible(true);
                break;
            case 2:
                GameFrame20Cartas game20 = new GameFrame20Cartas();
                game20.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Se abrirá el juego de 12 cartas por defecto.");
                GameFrame12Cartas defaultGame = new GameFrame12Cartas();
                defaultGame.setVisible(true);
                break;
        }
    }
}

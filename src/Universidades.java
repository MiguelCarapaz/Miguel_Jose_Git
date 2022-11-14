import javax.swing.JOptionPane;
public class Universidades{
    public static void main(String[] args) {
        String nombre_test = JOptionPane.showInputDialog("Ingresa tu nombre");
        System.out.println("Bienvenido " + nombre_test);

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));

        System.out.println(nombre_test + " tiene " + edad);
        String carrera = JOptionPane.showInputDialog("Ingresa tu carrera");


        System.out.println("que miras sapo");
        System.out.println("que dices veeeeee");
    }
}

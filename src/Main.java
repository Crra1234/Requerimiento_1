import javax.swing.*;
import java.security.KeyStore;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de registro");
        ArrayList<Empleado> empleados_lista = new ArrayList<>();
        boolean checkmark = true;
        while (checkmark) {
            String identificador = JOptionPane.showInputDialog(null, "Numero de identifiacion del empleado");
            String nombrecompleto = JOptionPane.showInputDialog(null, "Nombre del empleado");
            String position = JOptionPane.showInputDialog(null, "Posicion del empleado");
            String email = JOptionPane.showInputDialog(null, "Email del empleado");
            String phonenumber = JOptionPane.showInputDialog(null, "Numero de telefono del empleado");
            String datehired = JOptionPane.showInputDialog(null, "Fecha de contrato del empleado");

            Empleado newEmpleado = new Empleado(identificador,nombrecompleto,position,email,phonenumber,datehired);
            empleados_lista.add(newEmpleado);
            JOptionPane.showMessageDialog(null, "Agregando al empleado:  \n" + newEmpleado.toString());
            int option = JOptionPane.showConfirmDialog(null, "¿Desea agregar a otro empleado?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Volviendo al menu anterior.");
            } else {
                JOptionPane.showMessageDialog(null, "Muchas gracias por usar nuestro servicio.");
                checkmark = false;
            }
        }

    }
}
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto JFrame
        JFrame ventana = new JFrame("Lamda");
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        // Configurar el tamaño de la ventana
        ventana.setSize(1920, 1080);

        // Configurar la posición de la ventana
        ventana.setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear un JLabel con el mensaje que deseas mostrar
        ImageIcon icono = new ImageIcon("C:\\Users\\usuario\\Downloads\\lamda.png");

        JLabel etiquetaImagen = new JLabel(icono);

        JLabel mensaje = new JLabel("Mi libro, luna de pluton");

        ventana.add(panel);

        // Agregar el JLabel a la ventana
        panel.add(etiquetaImagen);
         panel1.add(mensaje);

        // Hacer visible la ventana
        ventana.setVisible(true);

        // Finalizar el programa cuando se cierre la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Mostrar en consola la tecla presionada
                System.out.println("Tecla presionada: " + e.getKeyChar());
                ventana.getContentPane().remove(panel);
                ventana.getContentPane().add(panel1);
                ventana.revalidate();
                ventana.repaint();
            }
        });

    }
}
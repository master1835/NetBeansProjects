import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo2 extends JComponent {

    private final static int ANCHO = 512;

    private final static int ALTO = 384;

    private final static int DIAMETRO = 20;

    private float x, y;

    private float vx, vy;

    private boolean arriba, abajo, izquierda, derecha;

    public Demo2() {
        setPreferredSize(new Dimension(ANCHO, ALTO));
        x = 10;
        y = 20;
        addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    actualiza(e.getKeyCode(), true);
                }

                public void keyReleased(KeyEvent e) {
                    actualiza(e.getKeyCode(), false);
                }

                private void actualiza(int keyCode, boolean pressed) {
                    switch (keyCode) {
                        case KeyEvent.VK_UP:
                            arriba = pressed;
                            break;

                        case KeyEvent.VK_DOWN:
                            abajo = pressed;
                            break;

                        case KeyEvent.VK_LEFT:
                            izquierda = pressed;
                            break;

                        case KeyEvent.VK_RIGHT:
                            derecha = pressed;
                            break;
                    }
                }
            });
        setFocusable(true);
    }

    private float clamp(float valor, float min, float max) {
        if (valor > max)
            return max;
        if (valor < min)
            return min;
        return valor;
    }

    private void fisica(float dt) {
        vx = 0;
        vy = 0;
        if (arriba)
            vy = -300;
        if (abajo)
            vy = 300;
        if (izquierda)
            vx = -300;
        if (derecha)
            vx = 300;
        x = clamp(x + vx * dt, 0, ANCHO - DIAMETRO);
        y = clamp(y + vy * dt, 0, ALTO - DIAMETRO);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, ANCHO, ALTO);
        g.setColor(Color.RED);
        g.fillOval(Math.round(x), Math.round(y), DIAMETRO, DIAMETRO);
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, ANCHO, 5);
        g.fillRect(0, 0, 5, ALTO);
        g.fillRect(0, ALTO-5, ANCHO, 5);
        g.fillRect(ANCHO-5, 0, 5, ALTO);
        g.setColor(Color.BLUE);
        g.fillOval(Math.round(x+5), Math.round(y), 10, 10);
        g.setColor(Color.ORANGE);
        g.fillRect(Math.round(x-4), Math.round(y+16), 30, 8);
    }

    private void dibuja() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    paintImmediately(0, 0, ANCHO, ALTO);
                }
            });
    }

    public void cicloPrincipalJuego() throws Exception {
        long tiempoViejo = System.nanoTime();
        while (true) {
            long tiempoNuevo = System.nanoTime();
            float dt = (tiempoNuevo - tiempoViejo) / 1000000000f;
            tiempoViejo = tiempoNuevo;
            fisica(dt);
            dibuja();
        }
    }

    public static void main(String[] args) throws Exception {
        JFrame jf = new JFrame("Demo2");
        jf.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        jf.setResizable(false);
        Demo2 demo2 = new Demo2();
        jf.getContentPane().add(demo2);
        jf.pack();
        jf.setVisible(true);
        demo2.cicloPrincipalJuego();
    }
}

package com.Pantallas;

import javax.swing.JFrame;

public class UtilPantalla {

    public void cambiarPantalla(JFrame pantallaOrigen, JFrame pantallaDestino) {
        // Guardar la posición y dimensiones de la pantalla actual
        int x = pantallaOrigen.getLocation().x;
        int y = pantallaOrigen.getLocation().y;
        int ancho = pantallaOrigen.getWidth();
        int alto = pantallaOrigen.getHeight();

        // Verificar si la pantalla actual estaba en pantalla completa
        boolean pantallaCompleta = pantallaOrigen.getExtendedState() == JFrame.MAXIMIZED_BOTH;

        // Cerrar la pantalla actual
        pantallaOrigen.dispose();

        // Establecer la posición y dimensiones de la pantalla destino
        pantallaDestino.setLocation(x, y);
        pantallaDestino.setSize(ancho, alto);

        // Verificar si la pantalla destino debe estar en pantalla completa
        if (pantallaCompleta) {
            pantallaDestino.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }

        // Mostrar la pantalla destino
        pantallaDestino.setVisible(true);
    }

}

package CRUD;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ImagenesViewer {
    private final Map<String, ImageIcon> imagenes = new HashMap<>();

    public ImagenesViewer() {
        // Lista de nombres de imágenes
        String[] nombresImagenes = {
            "salida-de-emergencia.png",
            "limpieza-de-datos.png",
            "eliminar.png",
            "boton-mas.png",
            "boton-editar.png"
        };

        // Cargar imágenes
        for (String nombre : nombresImagenes) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/iconos/" + nombre));
            imagenes.put(nombre, icon);
        }
    }

    public void mostrarImagenes(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, imagenes.size()));

        for (ImageIcon icon : imagenes.values()) {
            JButton boton = new JButton(icon);
            boton.setPreferredSize(new Dimension(100, 100));
            panel.add(boton);
        }

        frame.add(panel, BorderLayout.SOUTH);
        frame.revalidate();
        frame.repaint();
    }
}

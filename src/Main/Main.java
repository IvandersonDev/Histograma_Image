package Main;

import Methods.Histograma;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedImage imagem;
        imagem = ImageIO.read(new File("C:\\Users\\NOTEBOOK\\PDI\\HistogramaImage\\src\\Image\\grey_scale.jpg"));
        Histograma.calcularHistogramaCinza(imagem);

        System.out.println();
        System.out.println("\033[35m" + "Carregando . . ." + "\033[0m");
        System.out.println();
        System.out.println("\033[0;33m" + "Histograma Colorido\n" + "\033[0m");

        BufferedImage imagem2 = ImageIO.read(new File("C:\\Users\\NOTEBOOK\\PDI\\HistogramaImage\\src\\Image\\sombrinhas.jpg"));
        Histograma.calcularHistogramaColorido(imagem2);


    }
}

package Methods;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Histograma {

    public static final String CAMINHO_PADRAO = "C:\\Users\\NOTEBOOK\\PDI\\HistogramaImage\\src\\Image\\";
    public static final String CAMINHO_PADRAO2 = "C:\\Users\\NOTEBOOK\\PDI\\HistogramaImage\\src\\Image\\sombrinhas.jpg";


    public static void calcularHistogramaCinza(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        int[] histograma = new int[256];

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                int intensidade = cor.getRed();
                histograma[intensidade]++;
            }
        }

        for (int i = 0; i < 256; i++) {
            System.out.println("Intensidade " + i + ": " + histograma[i] + " vezes");
        }
    }




    public static void calcularHistogramaColorido(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        int[] histogramaR = new int[256];
        int[] histogramaG = new int[256];
        int[] histogramaB = new int[256];

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                int red = cor.getRed();
                histogramaR[red]++;

                int green = cor.getGreen();
                histogramaG[green]++;

                int blue = cor.getBlue();
                histogramaB[blue]++;
            }
        }

        for (int i = 0; i < 256; i++) {
            System.out.println("Intensidade " + i + ": \033[31mR" + histogramaR[i] + " \033[32mG" + histogramaG[i] + " \033[34mB" + histogramaB[i] + "\033[0m vezes");
        }
    }
}
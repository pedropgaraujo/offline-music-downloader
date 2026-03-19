package com.pedropgaraujo.offlinemusic;

import com.pedropgaraujo.offlinemusic.controller.DownloadController;
import com.pedropgaraujo.offlinemusic.service.SearchService;
import java.util.Scanner;

public class AppRunner {

    private final Scanner scanner = new Scanner(System.in);
    private final DownloadController controller = new DownloadController();
    private final SearchService searchService = new SearchService();

    public void start() {

        showWelcome();

        while (true) {

            String query = askMusic();

            if (isExit(query)) break;

            String url = searchService.searchMusic(query);
            String title = searchService.getTitle(url);

            if (confirmMusic(title, url)) {

                System.out.println("\n⏳ Baixando música...");
                controller.download(url);

                System.out.println("✅ Download concluído!");
                break;
            }

            if (askExit()) break;
        }

        System.out.println("\n👋 Até mais!");
    }

    private void showWelcome() {
        System.out.println("=================================");
        System.out.println(" 🎵 Offline Music Downloader 🎵 ");
        System.out.println("=================================");
    }

    private String askMusic() {
        System.out.println("\nDigite o nome da música (ou 1 para sair):");
        return scanner.nextLine();
    }

    private boolean isExit(String input) {
        return input.equals("1");
    }

    private boolean confirmMusic(String title, String url) {

        System.out.println("\n🎶 Música encontrada:");
        System.out.println("Título: " + title);
        System.out.println("Link: " + url);

        System.out.println("\nÉ essa música que você deseja?\nDigite [Sim] para baixar ou [Nao] para procurar outra:");
        String response = scanner.nextLine();

        if (response.equals("Nao")) {
            return response.equalsIgnoreCase("0");
        }

            return response.equalsIgnoreCase("Sim");
        }


    private boolean askExit() {
        System.out.println("\nDeseja sair? Digite:\n(1 = Sair, 2 = Procurar mais música)");
        String input = scanner.nextLine();
        return input.equals("1");
    }
}
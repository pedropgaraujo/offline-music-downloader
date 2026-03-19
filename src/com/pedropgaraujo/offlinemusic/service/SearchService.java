package com.pedropgaraujo.offlinemusic.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchService {

    public String searchMusic(String query){
        return executeCommand("ytsearch1:"+ query, "--get-id");
    }

    public String getTitle(String url){
        return executeCommand(url, "--get-title");
    }

    private String executeCommand(String input, String option){

        try{

            ProcessBuilder pb = new ProcessBuilder(
                    "bin/yt-dlp.exe",
                    "--js-runtimes", "node:bin/node/node.exe",
                    input,
                    option
            );

            Process process = pb.start();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );

            String result = reader.readLine();

            process.waitFor();

            if(result == null){
                throw new RuntimeException("Nenhum resultado encontrado!");
            }

            if(option.equals("--get-id")){
                return "https://www.youtube.com/watch?v=" + result;
            }
            return result;

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar música.", e);
        }
    }
}

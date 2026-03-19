package com.pedropgaraujo.offlinemusic.util;

public class CommandExecutor {
    public void execute(String... command) {

        try {
            ProcessBuilder pb = new ProcessBuilder(command);

            pb.inheritIO();

            Process process = pb.start();

            int exitCode = process.waitFor();

            if (exitCode != 0) {
                throw new RuntimeException("Erro ao executar comando");
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro na execução do comando", e);
        }
    }
}

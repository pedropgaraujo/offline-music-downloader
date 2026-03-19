package com.pedropgaraujo.offlinemusic.service;

import com.pedropgaraujo.offlinemusic.util.CommandExecutor;

public class DownloadService {
    private final CommandExecutor executor = new CommandExecutor();

    public void downloadMusic(String url) {

        executor.execute(
                "bin/yt-dlp.exe",
                "--ffmpeg-location", "bin",
                "--js-runtimes", "node:bin/node/node.exe",
                "-x",
                "--audio-format", "mp3",
                "-o", "downloads/%(title)s.%(ext)s",
                url
        );
    }
}

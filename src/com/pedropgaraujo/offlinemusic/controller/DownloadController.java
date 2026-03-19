package com.pedropgaraujo.offlinemusic.controller;

import com.pedropgaraujo.offlinemusic.service.DownloadService;

public class DownloadController {
    private final DownloadService downloadService = new DownloadService();

    public void download(String url) {
        downloadService.downloadMusic(url);
    }
}

# 🎶 Offline Music Downloader

I created this program in **Java** to solve a problem my parents were facing. Due to their generation, they are not very familiar with technology, which made it difficult to explain anything slightly complex, like downloading music online. I taught my mom how to download songs using a website that converts YouTube videos to MP3, but even then, there were too many steps to follow. That’s when I decided to create this project to make everything easier for them: they can simply open the app, type the name of a song or artist, see the link provided, and choose to download it or search for another song.

---

## ✨ Features

- 🔍 Search for music by title and artist  
- 📊 Shows information such as duration and YouTube channel  
- ✅ Allows confirmation before downloading  
- 🎧 Automatically converts to MP3 using **FFmpeg**  
- 💾 Saves downloaded songs in the `downloads/` folder  
- 👩‍💻 User-friendly interface for non-technical users

---

## 🛠 Technologies Used

- Java 17  
- yt-dlp (CLI)  
- FFmpeg  
- Node.js (for YouTube JavaScript processing)  

---

## 📥 How to Use

1. Clone the repository:

```bash
git clone https://github.com/your-username/repo-name.git
```

2. Open the project in IntelliJ (or compile with javac)

3. Run the program:
 java -jar offline-music-downloader.jar
Or use the .exe generated with Launch4j (easier for end users)

📂 Project Structure
```bash
OfflineMusicDownloader/
├── app.jar
├── bin/
│   ├── yt-dlp.exe
│   ├── ffmpeg.exe
│   ├── ffprobe.exe
│   └── node/
└── downloads/
```

📝 Example Usage
```bash
Welcome to Offline Music Downloader!
Enter the name of the song: Shape of You
Song found: Shape of You
Artist: Ed Sheeran
Do you want to download this song? (yes/no):
```

🤝 How to Contribute
```bash
Pull requests are welcome!
For improvements or suggestions, open an issue on GitHub.
```

⚖️ Licença
```bash
This project is licensed under the MIT License.
You are free to use, modify, and distribute it, as long as you keep this copyright notice.
```

---

# 🎶 Offline Music Downloader

Um programa em **Java** que permite baixar músicas do YouTube diretamente para o computador em **MP3**, para ouvir offline — ideal para carros sem conexão à internet.

---

## ✨ Funcionalidades

- 🔍 Busca música pelo título e artista  
- 📊 Mostra informações como duração e canal do YouTube  
- ✅ Permite confirmação antes do download  
- 🎧 Converte automaticamente para MP3 usando **FFmpeg**  
- 💾 Salva músicas na pasta `downloads/`  
- 👩‍💻 Interface amigável para usuários leigos

---

## 🛠 Tecnologias utilizadas

- Java 17  
- yt-dlp (CLI)  
- FFmpeg  
- Node.js (para processamento JavaScript do YouTube)  

---

## 📥 Como usar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/nome-do-repo.git
```
2. Abra o projeto no IntelliJ (ou compile com javac)

3. Execute o programa:
 java -jar offline-music-downloader.jar
Ou use o .exe gerado pelo Launch4j (mais fácil para usuários finais)

📂 Estrutura de pastas
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

📝 Exemplo de uso
Bem-vindo ao Offline Music Downloader!
Digite o nome da música: Shape of You
Música encontrada: Shape of You
Artista: Ed Sheeran
Deseja baixar essa música? (sim/nao):


🤝 Como contribuir

Pull requests são bem-vindos!
Para melhorias ou sugestões, abra uma issue no GitHub.

⚖️ Licença

Este projeto está licenciado sob a MIT License.
Você é livre para usar, modificar e distribuir, desde que mantenha este aviso de copyright.


---

package src.Threads.YoutubeByThreads;

public class Youtube {
    public static void main(String[] args) {
        PlayingAudio playingAudio = new PlayingAudio();
        DownloadingVideo downloadingVideo = new DownloadingVideo();
        CreatingHistory creatingHistory= new CreatingHistory();

        Thread th1 = new Thread(playingAudio);
        Thread th2 = new Thread(downloadingVideo);
        Thread th3 = new Thread(creatingHistory);
        th1.setPriority(1);
        th2.setPriority(4);
        th3.setPriority(10);
        th1.start();
        th2.start();
        th3.start();
    }
}

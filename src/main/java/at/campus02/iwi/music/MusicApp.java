package at.campus02.iwi.music;

public class MusicApp {
    public static void main(String[] args) {
        Album HansiLovesYou = new Album();
        HansiLovesYou.nrSongs = 5;
        HansiLovesYou.shortestSong = 68;
        HansiLovesYou.longestSong = 419;
        System.out.println(HansiLovesYou.totalLength());
        System.out.println(HansiLovesYou.averageSongLength());
        System.out.println(HansiLovesYou.fitsOnMedium(50));
    }
}

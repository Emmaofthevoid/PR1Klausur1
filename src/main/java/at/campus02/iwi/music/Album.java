package at.campus02.iwi.music;

public class Album {
    int nrSongs;
    double shortestSong;
    double longestSong;

    public double averageSongLength() {
        return (longestSong + shortestSong) / 2;
    }
    public double totalLength (){
        return nrSongs*averageSongLength();
    }
    public boolean fitsOnMedium (int minutes) {
        if(totalLength() <= minutes*60) {
            return true;
        }
        else {
            return false;
        }
    }
}

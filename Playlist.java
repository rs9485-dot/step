import java.util.Scanner;

class Playlist {
    private String[] songs;
    private int count;

    Playlist(int size) {
        songs = new String[size];
        count = 0;
    }

    void addSong(String song) {
        if (count < songs.length) {
            songs[count] = song;
            count++;
        }
    }

    String[] getSongs() {
        String[] copy = new String[count];

        for (int i = 0; i < count; i++) {
            copy[i] = songs[i];
        }

        return copy;
    }

    int getSongCount() {
        return count;
    }
}

public class PlaylistDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum number of songs: ");
        int size = sc.nextInt();
        sc.nextLine();

        Playlist p = new Playlist(size);

        System.out.print("Enter number of songs to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();
            p.addSong(song);
        }

        String[] result = p.getSongs();

        System.out.println("Songs in playlist:");
        for (String song : result) {
            System.out.println(song);
        }

        System.out.println("Song count: " + p.getSongCount());

        sc.close();
    }
}
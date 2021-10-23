package lsp.mediaplayer_lsp_violation;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {

    public static void main(String[] args) {

        List<MediaPlayer> allPlayers = new ArrayList<>();

        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new TorMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");

        allPlayers.add(new WinampMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);
    }

    public static void playVideoInAllMediaPlayers(List<MediaPlayer> allPlayers) {
        for(var player : allPlayers) {
            player.playVideo();
        }
    }
}
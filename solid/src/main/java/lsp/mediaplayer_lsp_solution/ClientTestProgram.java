package lsp.mediaplayer_lsp_solution;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {

    public static void main(String[] args) {

        List<VideoMediaPlayer> allPlayers = new ArrayList<VideoMediaPlayer>();
        allPlayers.add(new VlcMediaPlayer());


        playVideoInAllMediaPlayers(allPlayers);


        System.out.println("---------------------------");

    }

    public static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {
        for(VideoMediaPlayer player : allPlayers) {
            player.playVideo();
        }
    }
}
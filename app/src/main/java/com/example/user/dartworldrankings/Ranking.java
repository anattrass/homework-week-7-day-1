package com.example.user.dartworldrankings;
import java.util.*;
/**
 * Created by user on 12/12/2016.
 */
public class Ranking {

    private ArrayList<Player> players;


    public Ranking() {
        this.players = new ArrayList<Player>();
    }

    public Ranking(ArrayList<Player> players) {
        this.players = new ArrayList<Player>(players);
    }

    public int countPlayersInTopTen(){
        return players.size();
    }

    public String getPlayerByRanking(int ranking) {
        int index = ranking -1;
        Player player = this.players.get(index);
        return player.toString();
    }

    public void removePlayerRankedTenth() {
        players.remove(9);
    }

    @Override
    public String toString() {
        for (Player player : players) {
            System.out.println(player.toString());
        }
        return "Top 10 ";
    }

    public void addPlayerToTopTen(Player player) {
        this.players.add(player);
    }
}

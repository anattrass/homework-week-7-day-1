package com.example.user.dartworldrankings;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */

public class RankingTest {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;
    Ranking rankings;

    @Before
    public void before() {
        player1 = new Player("Michael van Gerwen", "Mighty Mike", 1);
        player2 = new Player("Gary Anderson", "The Flying Scotsman", 2);
        player3 = new Player("Peter Wright", "Snakebite", 3);
        player4 = new Player("Phil Taylor", "The Power", 4);
        player5 = new Player("Adrian Lewis", "Jackpot", 5);
        player6 = new Player("James Wade", "The Machine", 6);
        player7 = new Player("Dave Chisnall", "Chizzy", 7);
        player8 = new Player("Mensur Suljović", "The Gentle", 8);
        player9 = new Player("Robert Thornton", "The Thorn", 9);
        player10 = new Player("Jelle Klaasen", "The Cobra", 10);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);
        rankings = new Ranking(players);
    }

    @Test
    public void getPlayersArraySizeTest() {
        assertEquals(10, rankings.countPlayersInTopTen());
    }

    @Test
    public void getPlayerByRanking() {
        assertEquals("Name: Michael van Gerwen. Nickname: Mighty Mike. Rank 1", rankings.getPlayerByRanking(1));
    }

    @Test
    public void removePlayerRankedTenthTest() {
        rankings.removePlayerRankedTenth();
        assertEquals(9, rankings.countPlayersInTopTen());
        System.out.println(rankings.toString());
    }

    @Test
    public void addPlayerToTopTenTest() {
        Player player = new Player("Gary Hoffenhimersonton", "So Pitted", 10);
        rankings.removePlayerRankedTenth();
        rankings.addPlayerToTopTen(player);
        assertEquals(10, rankings.countPlayersInTopTen());
        System.out.println(rankings.toString());
        }
    }



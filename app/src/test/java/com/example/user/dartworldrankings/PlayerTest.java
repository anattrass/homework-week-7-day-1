package com.example.user.dartworldrankings;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/12/2016.
 */
public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Phil Taylor", "The Power", 1);
    }

    @Test
    public void getName() {
        assertEquals("Phil Taylor", player.getName());
    }

    @Test
    public void setName() {
        player.setName("Dave Labowski");
        assertEquals("Dave Labowski", player.getName());
    }

    @Test
    public void getNickname() {
        assertEquals("The Power", player.getNickname());
    }

    @Test
    public void setNickname() {
        player.setNickname("The Jerkoff");
        assertEquals("The Jerkoff", player.getNickname());
    }

    @Test
    public void getRanking() {
        assertEquals(1, player.getRanking());
    }

    @Test
    public void setRanking() {
        player.setRanking(3);
        assertEquals(3, player.getRanking());
    }

    @Test
    public void toStringTest() {
        System.out.println(player.toString());
    }

}

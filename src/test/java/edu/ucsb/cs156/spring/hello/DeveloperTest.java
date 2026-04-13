package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()), "Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Tien N.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("itbolt", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("s26-11", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_number_of_members() {
        Team t = Developer.getTeam();
        assertEquals(6, t.getMembers().size());
    }

    @Test
    public void getTeam_returns_team_with_Tien_N() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Tien N."), "Team should contain Tien N.");
    }

    @Test
    public void getTeam_returns_team_with_Nini() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Nini"), "Team should contain Nini");
    }

    @Test
    public void getTeam_returns_team_with_Brian_H() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Brian H"), "Team should contain Brian H");
    }

    @Test
    public void getTeam_returns_team_with_Rushabh() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Rushabh"), "Team should contain Rushabh");
    }

    @Test
    public void getTeam_returns_team_with_Anish() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Anish"), "Team should contain Anish");
    }

    @Test
    public void getTeam_returns_team_with_Wilson() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Wilson"), "Team should contain Wilson");
    }
}

package edu.ucsb.cs156.spring.hello;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void addMember_adds_member_to_list() {
        team.addMember("Alice");
        assertTrue(team.getMembers().contains("Alice"));
    }

    @Test
    public void setMembers_replaces_members_list() {
        Team t = new Team("test-team");
        java.util.ArrayList<String> members = new java.util.ArrayList<>();
        members.add("Alice");
        members.add("Bob");
        t.setMembers(members);

        assertEquals(2, t.getMembers().size());
        assertTrue(t.getMembers().contains("Alice"));
        assertTrue(t.getMembers().contains("Bob"));
    }

    @Test
    public void toString_returns_string_with_name_and_members() {
        team.addMember("Alice");
        team.addMember("Bob");

        String s = team.toString();
        assertTrue(s.contains("test-team"));
        assertTrue(s.contains("Alice"));
        assertTrue(s.contains("Bob"));
    }

    @Test
    public void equals_returns_true_for_same_object() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_returns_false_for_null() {
        assertFalse(team.equals(null));
    }

    @Test
    public void equals_returns_false_for_different_class() {
        assertFalse(team.equals("not a team"));
    }

    @Test
    public void equals_returns_true_for_same_name_and_members() {
        Team t1 = new Team("test-team");
        t1.addMember("Alice");

        Team t2 = new Team("test-team");
        t2.addMember("Alice");

        assertTrue(t1.equals(t2));
    }

    @Test
    public void equals_returns_false_for_different_name() {
        Team t1 = new Team("team-one");
        Team t2 = new Team("team-two");

        assertFalse(t1.equals(t2));
    }

    @Test
    public void equals_returns_false_for_different_members() {
        Team t1 = new Team("test-team");
        t1.addMember("Alice");

        Team t2 = new Team("test-team");
        t2.addMember("Bob");

        assertFalse(t1.equals(t2));
    }

    @Test
    public void hashCode_returns_same_value_for_equal_objects() {
        Team t1 = new Team("test-team");
        t1.addMember("Alice");

        Team t2 = new Team("test-team");
        t2.addMember("Alice");

        assertEquals(t1.hashCode(), t2.hashCode());
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void hashCode_returns_different_for_different_members() {
        Team t1 = new Team("team");
        t1.addMember("Alice");

        Team t2 = new Team("team");
        t2.addMember("Bob");

        assertNotEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_returns_expected_value() {
        Team t = new Team("team");
        t.addMember("Alice");

        assertEquals(66512511, t.hashCode());
    }
}

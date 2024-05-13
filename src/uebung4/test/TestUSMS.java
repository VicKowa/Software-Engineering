package uebung4.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uebung4.businesslogic.*;

public class TestUSMS {

    private US_ManagementSystem usms;

    @BeforeEach
    public void setup() {
        usms = new US_ManagementSystem();
    }

    @Test
    public void addStoryAddsStoryToList() {
        usms.executeCommand("story 1 \"Story description\" high");
        assertEquals(1, usms.getStories().size());
    }

    @Test
    public void addStoryDoesNotAddDuplicateStory() {
        usms.executeCommand("story 1 \"Story description\" high");
        usms.executeCommand("story 1 \"Another story description\" low");
        assertEquals(1, usms.getStories().size());
    }

    @Test
    public void addTaskAddsTaskToList() {
        usms.executeCommand("task 1 \"Task description\"");
        assertEquals(1, usms.getTasks().size());
    }

    @Test
    public void addTaskDoesNotAddDuplicateTask() {
        usms.executeCommand("task 1 \"Task description\"");
        usms.executeCommand("task 1 \"Another task description\"");
        assertEquals(1, usms.getTasks().size());
    }

    @Test
    public void assignTaskAssignsTaskToStory() {
        usms.executeCommand("story 1 \"Story description\" high");
        usms.executeCommand("task 1 \"Task description\"");
        usms.executeCommand("assign 1 1");
        assertEquals(1, usms.getStories().get(0).getTasks().size());
    }

    @Test
    public void assignTaskDoesNotAssignTaskToNonExistentStory() {
        usms.executeCommand("task 1 \"Task description\"");
        usms.executeCommand("assign 1 1");
        assertEquals(0, usms.getStories().size());
    }

    @Test
    public void assignTaskDoesNotAssignNonExistentTaskToStory() {
        usms.executeCommand("story 1 \"Story description\" high");
        usms.executeCommand("assign 1 1");
        assertEquals(0, usms.getStories().get(0).getTasks().size());
    }

    @Test
    public void saveAndLoad() {
        usms.executeCommand("story 1 \"Story description\" high");
        usms.executeCommand("task 1 \"Task description\"");
        usms.executeCommand("assign 1 1");
        assertEquals(1, usms.getStories().size());
        assertEquals(1, usms.getTasks().size());
        assertEquals(1, usms.getStories().get(0).getTasks().size());

        usms.executeCommand("save");
        usms = new US_ManagementSystem();
        assertEquals(0, usms.getStories().size());
        assertEquals(0, usms.getTasks().size());

        usms.executeCommand("load");
        assertEquals(1, usms.getStories().size());
        assertEquals(1, usms.getTasks().size());
        assertEquals(1, usms.getStories().get(0).getTasks().size());
    }
}
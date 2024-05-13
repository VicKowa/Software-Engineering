package uebung4.businesslogic;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class US_ManagementSystem implements Serializable {

    private final List<Story> stories;
    private final List<Task> tasks;

    public US_ManagementSystem() {
        this.stories = new LinkedList<>();
        this.tasks = new LinkedList<>();
    }

    public List<Story> getStories() {
        return stories;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void executeCommand(String command) {
        //will split the string on spaces that are not enclosed in quotes.
        String[] parts = command.split("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
        try {
            switch (parts[0]) {
                case "story":
                    addStory(parts);
                    break;
                case "task":
                    addTask(parts);
                    break;
                case "assign":
                    assignTask(parts);
                    break;
                case "stories":
                    printStories();
                    break;
                case "tasks":
                    printTasks();
                    break;
                case "load":
                    load();
                    break;
                case "save":
                    save();
                    break;
                default:
                    System.out.println("Unknown command: " + parts[0]);
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Fehler: Falsche Anzahl an Argumenten");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    private void addStory(String[] parts) {
        int id = Integer.parseInt(parts[1]);
        String description = parts[2];
        String prio = parts[3];
        if(containsId(id, stories)) {
            System.out.println("Story mit ID " + id + " existiert bereits.");
            return;
        }
        stories.add(new Story(id, description, prio));
    }

    private void addTask(String[] parts) {
        int id = Integer.parseInt(parts[1]);
        String description = parts[2];
        if(containsId(id, tasks)) {
            System.out.println("Task mit ID " + id + " existiert bereits.");
            return;
        }
        tasks.add(new Task(id, description));
    }

    private void assignTask(String[] parts) throws IllegalArgumentException {
        int storyId = Integer.parseInt(parts[1]);
        int taskId = Integer.parseInt(parts[2]);
        Story story = stories.stream().filter(s -> s.getId() == storyId).findFirst().orElse(null);
        Task task = tasks.stream().filter(t -> t.getId() == taskId).findFirst().orElse(null);
        if (story != null && task != null) {
            story.assignTask(task);
            System.out.println("Task mit ID " + taskId + " wurde erfolgreich User Story mit ID " + storyId + " zugeordnet.");
        } else {
            throw new IllegalArgumentException("Story or Task not found");
        }
    }

    private boolean containsId(int id, List< ? extends USPart> usParts) {
        return usParts.stream().anyMatch(usPart -> usPart.getId() == id);
    }

    private void printStories() {
        System.out.println("Die folgenden User Stories sind im System gespeichert:");
        stories.forEach(System.out::println);
    }

    private void printTasks() {
        System.out.println("Die folgenden Tasks sind im System gespeichert:");
        tasks.forEach(System.out::println);
    }

    private void load() throws Exception{
        try(FileInputStream fis = new FileInputStream("UserStories.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            US_ManagementSystem temp = (US_ManagementSystem) ois.readObject();
            this.stories.clear();
            this.stories.addAll(temp.stories);
            this.tasks.clear();
            this.tasks.addAll(temp.tasks);

        } catch (IOException e) {
            throw new Exception("beim öffen/lesen der Datei");
        } catch (ClassNotFoundException e) {
            throw new Exception("serialisierte Klasse nicht gefunden");
        }

        System.out.println("User Stories und Tasks wurden erfolgreich geladen.");
    }

    private void save() throws Exception {
        try (FileOutputStream fos = new FileOutputStream("UserStories.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(this);
        } catch (IOException e) {
            throw new Exception("beim speichern der User Stories.");
        }
        System.out.println("User Stories und Tasks wurden erfolgreich gespeichert.");
    }
}

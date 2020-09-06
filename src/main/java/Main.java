import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        List<Command> commands = new ArrayList<>();

        commands.add(new JumpLeft(frog,1));
        commands.add(new JumpRight(frog,1));
        commands.add(new JumpRight(frog,1));
        commands.add(new JumpLeft(frog,1));
        commands.add(new JumpLeft(frog,2));

        commands.get(0).execute(); // 1 - прыжок влево на 1
        commands.get(1).execute(); // 2 - прыжок вправо на 1
        commands.get(2).execute(); // 3 - прыжок вправо на 1
        commands.get(3).execute(); // 4 - прыжок влево на 1
        commands.get(4).execute(); // 5 - прыжок влево на 2
        commands.get(4).redo();    // 6 - повторение действия 5
        commands.get(4).undo();    // 7 - отмена действия 5
    }
}

public class JumpLeft implements Command{
    Frog frog;
    int steps;

    public JumpLeft(Frog frog, int steps) {
        this.frog = frog;
        this.steps = steps;
    }

    @Override
    public void execute() {
        frog.jump(-steps);
        frog.show();
    }

    @Override
    public void undo() {
        frog.jump(steps);
        frog.show();
    }

    @Override
    public void redo() {
        frog.jump(-steps);
        frog.show();
    }

}

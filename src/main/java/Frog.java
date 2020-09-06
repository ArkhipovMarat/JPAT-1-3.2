public class Frog {
    public static final int MIN_POSITION = 0;
    public static final int MAX_POSITION = 10;
    public static int counter = 0;
    protected String[] frogField;
    protected int position;

    public Frog() {
        position = 5;
        frogField = new String[11];
    }

    public boolean jump (int steps) {
        if (!((position+steps)>10 | (position+steps)<0)) {
            position += steps;
            return true;
        }
        return false;
    }

    public void show() {
        counter ++;
        System.out.println("Поле с лягушкой. Действие №: " + counter);
        for (int i = 0; i < frogField.length; i++) {
            frogField[i] = i == position? "X" : "0";
            System.out.print(" " + frogField[i]);
        }
        System.out.println("");
    }
}

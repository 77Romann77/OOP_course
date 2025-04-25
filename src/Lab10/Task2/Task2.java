package Lab10.Task2;

public class Task2 {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        Playable[] playables = new Playable[2];

        playables[0] = guitar;
        playables[1] = piano;

        for(Playable a : playables){
            a.play();
        }
    }
}

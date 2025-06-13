interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Playable[] instruments = { new Guitar(), new Piano() };
        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}

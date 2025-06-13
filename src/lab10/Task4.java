package lab10;

interface Readable {
    void read();
}

interface Writable {
    void write();
}

class FileDocument implements Readable, Writable {
    @Override
    public void read() {
        System.out.println("Reading from file");
    }

    @Override
    public void write() {
        System.out.println("Writing to file");
    }
}

public class Task4 {
    public static void main(String[] args) {
        FileDocument file = new FileDocument();
        file.read();
        file.write();
    }
}

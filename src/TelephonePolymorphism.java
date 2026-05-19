abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    void ring() {
        System.out.println("ringing...");
    }

    void lift() {
        System.out.println("lift the telephone");
    }

    void disconnect() {
        System.out.println("disconnecting...");
    }
}

public class TelephonePolymorphism {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone();
        t.disconnect();
        t.lift();
        t.ring();
    }
}

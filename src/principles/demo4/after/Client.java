package principles.demo4.after;

import principles.demo4.before.HeimaSafetyDoor;

public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor door1 = new HeimaSafetyDoor();
        door1.antiTheft();
        door1.fireProof();
        door1.waterProof();

        ItcastSafetyDoor door2 = new ItcastSafetyDoor();
        door2.antiTheft();
        door2.fireproof();

    }
}

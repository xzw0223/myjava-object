package com.xzw.shuai.principles.demo4.after;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        XzwSafetyDoor xzwSafetyDoor = new XzwSafetyDoor();

        xzwSafetyDoor.antiTheft();
        xzwSafetyDoor.fireProof();
        xzwSafetyDoor.waterProof();

        System.out.println();
        System.out.println(" -------------------- ");
        System.out.println();

        XzwShuaiSafetyDoor xzwShuaiSafetyDoor = new XzwShuaiSafetyDoor();

        xzwShuaiSafetyDoor.antiTheft();
        xzwShuaiSafetyDoor.waterProof();
    }
}

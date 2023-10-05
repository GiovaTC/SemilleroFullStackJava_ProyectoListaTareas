package org.bedu.java.jse.basico3;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leeOpcion(){
        System.out.print("Opción: ");
        return scanner.nextByte();
    }
}
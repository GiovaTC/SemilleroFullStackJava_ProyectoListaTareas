package org.bedu.java.jse.basico5;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leeOpcion(){
        System.out.print("Digite Opción: ");
        return scanner.nextByte();
    }
    public String leeCadena(){
        System.out.print("Digite opción: ");
        return scanner.nextLine();
    }
}
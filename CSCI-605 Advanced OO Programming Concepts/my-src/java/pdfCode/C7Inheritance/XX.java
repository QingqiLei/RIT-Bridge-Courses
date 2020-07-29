package pdfCode.C7Inheritance;

import javax.swing.*;

public class XX implements X{

    @Override
    public void setPrice(int x) {
        System.out.println("XX.setPrice");
    }

    public static void main(String[] args) {
        XX t = new XX();
        t.volume1();
    }
}

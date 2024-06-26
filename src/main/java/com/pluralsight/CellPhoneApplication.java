package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.println("Welcome to your Cell Phone Service!");

        System.out.print("Please enter your phones serial number: ");

        phone.setSerialNumber(keyboard.nextInt());
        keyboard.nextLine();

        System.out.print("Please enter your phones model: ");
        phone.setCellPhoneModel(keyboard.nextLine());

        System.out.print("Please enter your phones carrier: ");
        phone.setCarrier(keyboard.nextLine());

        System.out.print("Please enter your phones number: ");
        phone.setPhoneNumber(keyboard.nextLine());

        System.out.print("Please enter your phones owner: ");
        phone.setName(keyboard.nextLine());

        System.out.println(phone.getSerialNumber() + " " + phone.getPhoneNumber() + " " + phone.getCarrier() + " " + phone.getCellPhoneModel() + " " + phone.getName());
    }




}

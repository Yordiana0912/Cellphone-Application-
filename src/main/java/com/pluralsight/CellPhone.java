package com.pluralsight;

public class CellPhone {
    private  int serialNumber;
    private  String cellPhoneModel;
    private  String carrier;
    private  String phoneNumber;
    private  String name;

    public void phone(){

        serialNumber = 0;
       cellPhoneModel = "";
       carrier = "";
       phoneNumber = "";
       name  = "";

    }

    public void setSerialNumber (int serialNumber){
        this.serialNumber = serialNumber;
    }
    public int getSerialNumber(){
        return serialNumber;
     }

     public void setCellPhoneModel(String s){
        this.cellPhoneModel = cellPhoneModel;
     }

    public String getCellPhoneModel(){
        return cellPhoneModel;
    }
    public void setCarrier(String s){
        this.carrier =carrier;
    }
    public String  getCarrier(){
        return  carrier;
    }
    public void setPhoneNumber(String s){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void  setName(String s){
        this.name = name;
    }
    public String getName(){
        return name ;
    }



}


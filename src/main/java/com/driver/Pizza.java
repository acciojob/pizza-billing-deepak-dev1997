package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheese=false;

    private boolean takeaway=false;

    private boolean extratopping=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            this.price=300;

        }
        else{
            this.price=400;

        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(this.cheese==false){
            this.price+=80;
            cheese=true;
        }

    }

    public void addExtraToppings(){
        if(extratopping==false){
            if(this.isVeg==true){
                this.price+=70;
                extratopping=true;
            }
            else{
                this.price+=120;
                extratopping=true;
            }
        }
    }

    public void addTakeaway(){
        if(takeaway==false) {
            this.price += 20;
            takeaway=true;
        }

    }

    public String getBill(){
        if(isVeg==true){
            this.bill="Base Price Of The Pizza: 300"+"\n";
        }
        else{
            this.bill="Base Price Of The Pizza: 400"+"\n";
        }
        if(cheese==true){
            this.bill+="Extra Cheese Added: 80"+"\n";
        }
        if(extratopping==true){
            this.bill+="Extra Toppings Added: 120"+"\n";
        }
        if(takeaway==true){
            this.bill+="Paperbag Added: 20"+"\n";
        }
        this.bill+="Total Price: "+Integer.toString(this.price)+"\n";

        return this.bill;
    }
}

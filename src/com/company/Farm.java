package com.company;

public class Farm {
    private String address;
    private String OwnerName;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;


    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        OwnerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Information: " +'\n' +
                "address: " + address + '\n' +
                "ownerName: " + OwnerName + '\n' +
                "sheep: " + sheep.length +'\n' +
                "horses: " + horses.length +'\n' +
                "cows: " + cows.length+'\n';
    }
}

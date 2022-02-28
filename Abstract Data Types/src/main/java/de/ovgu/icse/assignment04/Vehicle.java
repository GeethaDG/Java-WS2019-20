package de.ovgu.icse.assignment04;


public abstract class Vehicle {
    protected boolean wiper_active;
    protected boolean[] doors;
    protected boolean trunk_open;

    public Vehicle(boolean wiperState, boolean trunkState) {
        wiper_active=wiperState;
        trunk_open=trunkState;
    }    
    
    public void toggle_wiper() {
        wiper_active=!wiper_active;
    } 

    public boolean getWiperState() {
        return wiper_active;
    }
    
    public int getNumberOfDoors() {
            return doors.length-1;
    }
    
    public boolean getDoorState(int door) {
        return doors[door];
    }
    
    public boolean getTrunkState() {
        return trunk_open;
    }

    public abstract void unlockAllDoors(); 
    public abstract void lockAllDoors(); 

}

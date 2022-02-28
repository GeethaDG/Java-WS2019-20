package de.ovgu.icse.assignment04;

import static org.hsqldb.lib.ArrayUtil.resizeArray;

public class Motorcycle extends Vehicle  {

    public Motorcycle(boolean wiperState, boolean trunkState) {
        super(wiperState,trunkState);
        doors = new boolean[1];
    }

    @Override
    public void unlockAllDoors() {
        for (int i=0;i<doors.length;i++){ doors[i]=false;}
    }

    @Override
    public void lockAllDoors() {
        for (int i=0;i<doors.length;i++){ doors[i]=true;}
    }
}

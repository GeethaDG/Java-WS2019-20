package de.ovgu.icse.assignment04;

import static org.hsqldb.lib.ArrayUtil.resizeArray;

public class Bus extends Vehicle implements Trunk{

    public Bus(boolean wiperState, boolean trunkState) {
        super(wiperState,trunkState);
        doors = new boolean[3];
    }

    @Override
    public void unlockAllDoors() {
        for (int i=0;i<doors.length;i++){ doors[i]=false;}
    }

    @Override
    public void lockAllDoors() {
        for (int i=0;i<doors.length;i++){ doors[i]=true;}
    }

    @Override
    public void openTrunk() {
        trunk_open=true;
    }

    @Override
    public void closeTrunk() {
        trunk_open=false;

    }
}

package com.jee.jeebt;


import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;

import java.util.Set;

public class JeeBT {

    private BluetoothAdapter BA;
    private Set<BluetoothDevice> pairedDevices;

    public String version (){
        return "v1.0.0";
    }

    public String info (){
        return "Jee Bluetooth App";
    }

    public Intent getBluetooth(){
        BA = BluetoothAdapter.getDefaultAdapter();
        Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        return turnOn;
    }

    public Set<BluetoothDevice> getPairedDevices (){
        pairedDevices = BA.getBondedDevices();
        return pairedDevices;
    }
}

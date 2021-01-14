package com.example.blep2p.model;

public class DeviceModel {
    private final String deviceName;
    private final String deviceAddress;

    public DeviceModel(String deviceName, String deviceAddress) {
        this.deviceName = deviceName;
        this.deviceAddress = deviceAddress;
    }


    public String getDeviceName() {
        return deviceName;
    }


    public String getDeviceAddress() {
        return deviceAddress;
    }


}

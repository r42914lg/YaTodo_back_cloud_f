package com.r42914lg.arkados.yatodo.restservice;

import java.util.List;

public class TodoContainer {
    private List<TodoItem> items;
    private String deviceId;

    public TodoContainer(List<TodoItem> items, String deviceId) {
        this.items = items;
        this.deviceId = deviceId;
    }

    public void setItems(List<TodoItem> items) { this.items = items; }
    public void setDeviceid(String deviceId) { this.deviceId = deviceId; }

    public List<TodoItem> getItems() { return items; }
    public String getDeviceId() { return deviceId; }
}

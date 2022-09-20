package com.r42914lg.arkados.yatodo.repository;

public class InMemTodoItem {
    private String userid;
    private int localid;
    private String text;
    private int importance;
    private boolean done;
    private long created;
    private String deadline;
    private long changed;
    private String deviceid;

    public InMemTodoItem() {}

    public InMemTodoItem(
        String userid,
        int localid,
        String text,
        int importance,
        boolean done,
        long created,
        String deadline,
        long changed,
        String deviceid
    ) {
        this.userid = userid;
        this.localid = localid;
        this.text = text;
        this.importance = importance;
        this.done = done;
        this.created = created;
        this.deadline = deadline;
        this.changed = changed;
        this.deviceid = deviceid;
    }

    public int getLocalid() { return localid; }
    public String getText() { return text; }
    public int getImportance() { return importance; }
    public boolean getDone() { return done; }
    public long getCreated() { return created; }
    public String getDeadline() { return deadline; }
    public long getChanged() { return changed; }
    public String getUserid() { return userid; }
    public String getDeviceid() { return deviceid; }

    public void setLocalid(int localid) { this.localid = localid; }
    public void setText(String text) { this.text = text; }
    public void setImportance(int importance) { this.importance = importance; }
    public void setDone(boolean done) { this.done = done; }
    public void setCreated(long created) { this.created = created; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
    public void setChanged(long changed) { this.changed = changed; }
    public void setUserid(String userid) { this.userid = userid; }
    public void setDeviceid(String deviceid) { this.deviceid = deviceid; }
}


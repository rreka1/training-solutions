package activitytrackerdb;

import java.time.LocalDateTime;

public class Activity {

    private long id; //bigint, auto_increment, primary key
    private LocalDateTime startTime; //timestamp
    private String desc; //varchar(255)
    private Type type; //varchar(255)

    public Activity(long id, LocalDateTime startTime, String desc, Type type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(LocalDateTime startTime, String desc, Type type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public Type getType() {
        return type;
    }
}

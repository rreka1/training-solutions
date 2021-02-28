package activitytrackerdb;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public void insertActivity(DataSource dataSource, Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement preStm = conn.prepareStatement(
                     "INSERT INTO activities(start_time, activity_desc, activity_type) values(?,?,?) ")
        ) {
            preStm.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            preStm.setString(2, activity.getDesc());
            preStm.setString(3, activity.getType().toString());
            preStm.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert!", se);
        }
    }

    public static void main(String[] args) {

        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect!", se);
        }

        Activity activity1 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 20), "Biking in Mátra", Type.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 02, 23, 11, 20), "Running in Mátra", Type.RUNNING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 02, 23, 12, 20), "Hiking in Mátra", Type.HIKING);

        ActivityTrackerMain activityTrackerMain = new ActivityTrackerMain();
        activityTrackerMain.insertActivity(dataSource, activity1);
        activityTrackerMain.insertActivity(dataSource, activity2);
        activityTrackerMain.insertActivity(dataSource, activity3);
    }
}

package activitytrackerdb;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

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

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        Activity activity1 = new Activity(LocalDateTime.of(2021, 2, 23, 10, 20), "Biking in Mátra", Type.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 2, 23, 11, 20), "Running in Mátra", Type.RUNNING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 2, 23, 12, 20), "Hiking in Mátra", Type.HIKING);

        //ActivityTrackerMain activityTrackerMain = new ActivityTrackerMain();
        /*activityTrackerMain.insertActivity(dataSource, activity1);
        activityTrackerMain.insertActivity(dataSource, activity2);
        activityTrackerMain.insertActivity(dataSource, activity3);*/
        /*System.out.println(activityTrackerMain.findById(dataSource, 2));
        System.out.println(activityTrackerMain.listAllActivities(dataSource));*/

        ActivityDao activityDao = new ActivityDao(dataSource);
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        activityDao.saveActivity(activity1);
        System.out.println("All activities: " + activityDao.listActivities());
        System.out.println("Activities by type: " + activityDao.findActivityByType(Type.BIKING));
    }

    /*public Activity findById(DataSource dataSource, long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement preStm = conn.prepareStatement("SELECT * FROM activities WHERE id = ?")
        ) {
            preStm.setLong(1, id);
            return selectActivityByPreparedStatement(preStm);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    public List<Activity> listAllActivities(DataSource dataSource) {
        List<Activity> activities = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT id FROM activities ORDER BY id")
        ) {
            while (resultSet.next()) {
                activities.add(findById(dataSource, resultSet.getLong("id")));
            }
            return activities;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    private Activity selectActivityByPreparedStatement(PreparedStatement preparedStatement) {
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                long id = resultSet.getLong("id");
                LocalDateTime startTime = resultSet.getTimestamp("start_time").toLocalDateTime();
                String desc = resultSet.getString("activity_desc");
                Type type = Type.valueOf(resultSet.getString("activity_type"));
                return new Activity(id, startTime, desc, type);
            }
            throw new IllegalArgumentException("Activity not found!");
        } catch (SQLException se) {
            throw new IllegalStateException("Query execution failed!", se);
        }
    }*/
}

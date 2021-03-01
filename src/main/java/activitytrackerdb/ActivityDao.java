package activitytrackerdb;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity activity) {
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

    public Activity findActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement preStm = conn.prepareStatement("SELECT * FROM activities WHERE id = ?")
        ) {
            preStm.setLong(1, id);
            List<Activity> result = selectActivityByPreparedStatement(preStm);
            if (result.size() == 1) {
                return result.get(0);
            }
            throw new IllegalArgumentException("Not found!");
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    public List<Activity> findActivityByType(Type type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(
                     "SELECT * FROM activities WHERE activity_type = ?");
        ) {
            preparedStatement.setString(1, type.toString());
            return selectActivityByPreparedStatement(preparedStatement);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    public List<Activity> listActivities() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM activities");
        ) {
            return selectActivityByPreparedStatement(preparedStatement);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    public List<Activity> listActivitiesBeforeDate(LocalDate date) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(
                     "SELECT * FROM activities WHERE start_time < ?");
        ) {
            //preparedStatement.setTimestamp(1, Timestamp.valueOf(LocalDateTime.of(date, LocalTime.of(0,0,0))));
            preparedStatement.setTimestamp(1, Timestamp.valueOf(date.atTime(0, 0, 0)));
            return selectActivityByPreparedStatement(preparedStatement);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    private List<Activity> selectActivityByPreparedStatement(PreparedStatement preparedStatement) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                LocalDateTime startTime = resultSet.getTimestamp("start_time").toLocalDateTime();
                String desc = resultSet.getString("activity_desc");
                Type type = Type.valueOf(resultSet.getString("activity_type"));
                result.add(new Activity(id, startTime, desc, type));
            }
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Query execution failed!", se);
        }
    }
}

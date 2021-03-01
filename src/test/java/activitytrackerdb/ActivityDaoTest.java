package activitytrackerdb;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init() {
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
        activityDao = new ActivityDao(dataSource);
    }

    @Test
    public void findActivityByIdTest() {
        Activity activity = activityDao.findActivityById(1);
        assertEquals(Type.BIKING, activity.getType());
    }

    @Test
    public void findActivityByTypeTest() {
        List<Activity> activities = activityDao.findActivityByType(Type.BIKING);
        assertEquals(2, activities.size());
        assertEquals(Type.BIKING, activities.get(0).getType());
        assertEquals(Type.BIKING, activities.get(1).getType());
    }

    @Test
    public void listActivitiesTest() {
        List<Activity> activities = activityDao.listActivities();
        assertEquals(4, activities.size());
    }

    @Test
    public void saveActivityTest() {
        Activity activity = new Activity(LocalDateTime.of(2021, 8, 23, 11, 20), "Running in Mátra", Type.RUNNING);
        activityDao.saveActivity(activity);
        assertEquals(5, activityDao.listActivities().size());
    }

    @Test
    public void testListActivitiesBeforeDate() {
        LocalDate date = LocalDate.of(2021, 2, 13);
        List<Activity> result = activityDao.listActivitiesBeforeDate(date);
        assertEquals(1, result.size());
    }
}
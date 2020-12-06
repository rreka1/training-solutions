package inheritanceconstructor.classroom;

public class ClassRoom extends Room {

    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public Facility getFacility() {
        return facility;
    }

    public boolean isSuitable(Course course) {
        int numberOfParticipants = course.getParticipants();
        Facility facilityNeeded = course.getFacilityNeeded();
        if (this.facility == facilityNeeded) {
            if (super.getCapacity() >= numberOfParticipants) {
                return true;
            }
        }
        return false;
    }
}

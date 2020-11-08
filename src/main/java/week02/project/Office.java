package week02.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for(MeetingRoom room : meetingRooms) {
            System.out.println(room.getName());
        }
        System.out.println();
    }

    public void printNamesReverse() {
        for(int i = meetingRooms.size()-1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
        System.out.println();
    }

    public void printEvenNames() {
        for(int i = 1; i < meetingRooms.size(); i = i + 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
        System.out.println();
    }

    public void printAreas() {
        for(MeetingRoom room : meetingRooms) {
            System.out.println("Tárgyaló neve: " + room.getName());
            System.out.println("Hosszúság: " + room.getLength() + " m");
            System.out.println("Szélesség: " + room.getWidth() + " m");
            System.out.println("Terület: " + room.getArea() + " m2");
            System.out.println();
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for(MeetingRoom room : meetingRooms) {
            if(room.getName().equals(name)) {
                System.out.println("Hosszúság: " + room.getLength() + " m");
                System.out.println("Szélesség: " + room.getWidth() + " m");
                System.out.println("Terület: " + room.getArea() + " m2");
                System.out.println();
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for(MeetingRoom room : meetingRooms) {
            if(room.getName().contains(part)) {
                System.out.println("Hosszúság: " + room.getLength() + " m");
                System.out.println("Szélesség: " + room.getWidth() + " m");
                System.out.println("Terület: " + room.getArea() + " m2");
                System.out.println();
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom room : meetingRooms) {
            if(room.getArea() > area) {
                System.out.println("Tárgyaló neve: " + room.getName());
                System.out.println("Hosszúság: " + room.getLength() + " m");
                System.out.println("Szélesség: " + room.getWidth() + " m");
                System.out.println("Terület: " + room.getArea() + " m2");
                System.out.println();
            }
        }
    }

}

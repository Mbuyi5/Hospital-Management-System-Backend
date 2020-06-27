package com.example.Hospital.Management.System.entity;

import java.util.List;

public class Room {
    private String roomId;
    private List equipment;
    private Hospital details;

    private Room(){

    }

    public String getroomId() {
        return roomId;
    }

    public List getEquipment() {
        return equipment;
    }

    public Hospital getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", equipment='" + equipment + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public static class Builder{
        private String roomId;
        private List equipment;
        private Hospital details;


        public Builder(String roomId){
            this.roomId = roomId;
        }
        public Room.Builder setEquipment(List equipment) {
            this.equipment = equipment;
            return this;
        }

        public Room.Builder setDetails(Hospital details) {
            this.details = details;
            return this;
        }

        public Room.Builder copy(Room room){
            this.roomId = roomId;
            this.equipment = equipment;
            this.details =details;
            return this;
        }

        public Room build(){
            Room room = new Room();
            room.roomId = roomId;
            room.equipment = equipment;
            room.details = details;
            return room;
        }
    }
}


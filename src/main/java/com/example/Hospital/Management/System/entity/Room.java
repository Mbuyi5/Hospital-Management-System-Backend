package com.example.Hospital.Management.System.entity;

import java.util.List;

public class Room {
    private String roomId;
    private List equipment;
    private Hospital details;

    private Room(Builder builder){
        this.roomId = roomId;
        this.equipment = equipment;
        this.details =details;
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


        public Builder(String roomId, List equipment, Hospital details) {
            this.roomId = roomId;
            this.equipment = equipment;
            this.details = details;
        }

        public Builder setEquipment(List equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setDetails(Hospital details) {
            this.details = details;
            return this;
        }

        public Builder copy(Room room){
            this.roomId = roomId;
            this.equipment = equipment;
            this.details =details;
            return this;
        }

        public Room build(){
            return new Room(this);
        }
    }
}


package com.vtb.jsonparser.core.entities;

public class EntityFactory {
    public static Entity createEntityByType(EntityType entityType){
        switch (entityType){
            case LABEL:
                return new Label();
            case STUDENT:
                return new Student();
            case TASK:
                return new Task();
            case TEAM:
                return new Team();
            case TEAMS:
                return new Teams();
            default:
                return null;
        }
    };
}

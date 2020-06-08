package models;

import java.util.Objects;

public class Squad {
    private String squadName;
    private String causeDedicatedToFighting;
    private int id;
    private int squadMembersCounter;

    public Squad(String squadName, String causeDedicatedToFighting, int squadMembersCounter){
        this.squadName = squadName;
        this.causeDedicatedToFighting = causeDedicatedToFighting;
        this.squadMembersCounter = squadMembersCounter;
    }

    public String getSquadName(){
        return squadName;
    }

    public String getCauseDedicatedToFighting(){
        return causeDedicatedToFighting;
    }

    public int getSquadMembersCounter() {return squadMembersCounter;}

    public int getId(){
        return id;
    }

    public void setSquadName(String squadName){
        this.squadName = squadName;
    }

    public void setSquadMembersCounter(int squadMembersCounter){this.squadMembersCounter = squadMembersCounter;}

    public void setCauseDedicatedToFighting(String causeDedicatedToFighting){
        this.causeDedicatedToFighting = causeDedicatedToFighting;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Squad squad = (Squad) o;

        if (id != squad.id) return false;
        if (squadMembersCounter != squad.squadMembersCounter) return false;
        if (!Objects.equals(squadName, squad.squadName)) return false;
        return Objects.equals(causeDedicatedToFighting, squad.causeDedicatedToFighting);
    }

    @Override
    public int hashCode() {
        int result = squadName != null ? squadName.hashCode() : 0;
        result = 31 * result + (causeDedicatedToFighting != null ? causeDedicatedToFighting.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + squadMembersCounter;
        return result;
    }
}

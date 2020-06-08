package models;

import org.graalvm.compiler.replacements.nodes.UnaryMathIntrinsicNode;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.ArrayList;

public class Hero {

    private String name;
    private String weakness;
    private int squadId;
    private String specialPower;
    private LocalDateTime createdAt;
    private int age;
    private int id;

    public Hero(String name, String weakness, String specialPower, int age, int squadId){
        this.name = name;
        this.weakness = weakness;
        this.specialPower = specialPower;
        this.age = age;
        this.squadId = squadId;
        this.createdAt = LocalDateTime.now();
    }

    public int getSquadId() {
        return squadId;
    }

    public void setSquadId(int squadId) {
        this.squadId = squadId;
    }

    public void setWeakness(String weakness){
        this.weakness = weakness;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSpecialPower(String specialPower){
        this.specialPower = specialPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSpecialPower(){
        return specialPower;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public  String getWeakness(){
        return weakness;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        if (squadId != hero.squadId) return false;
        if (age != hero.age) return false;
        if (id != hero.id) return false;
        if (!Objects.equals(name, hero.name)) return false;
        if (!Objects.equals(weakness, hero.weakness)) return false;
        if (!Objects.equals(specialPower, hero.specialPower)) return false;
        return Objects.equals(createdAt, hero.createdAt);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (weakness != null ? weakness.hashCode() : 0);
        result = 31 * result + squadId;
        result = 31 * result + (specialPower != null ? specialPower.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + id;
        return result;
    }
}

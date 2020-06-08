package dao;

import models.Squad;
import models.Hero;
import org.sql2o.*;
import java.util.List;

public class Sql2oSquadDao implements  SquadDao {

    private final Sql2o sql2o;

    public Sql2oSquadDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Squad squad){
        String sql = "INSERT INTO squads (squadName, causeDedicatedToFighting, squadMembersCounter) VALUES (:squadName, :causeDedicatedToFighting, :squadMembersCounter)";
        try(Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(squad)
                    .executeUpdate()
                    .getKey();
            squad.setId(id);
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public List<Squad> getAll(){
        try(Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM squads")
                    .executeAndFetch(Squad.class);
        }
    }

    @Override
    public Squad findById(int id){
        try(Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM squads WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Squad.class);
        }
    }

    @Override
    public void update(int id, String newSquadName, String newCauseDedicatedToFighting, int newSquadSize){
        String sql = "UPDATE squads SET (squadName, causeDedicatedToFighting, squadMembersCounter) VALUES (:squadName, :causeDedicatedToFighting, :squadMembersCounter) WHERE id = :id";
        try(Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("squadName", newSquadName)
                    .addParameter("causeDedicatedToFighting", newCauseDedicatedToFighting)
                    .addParameter("squadMembersCounter", newSquadSize)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void deleteById(int id){
        String sql = "DELETE from squads WHERE id = :id";   //raw sql
        try(Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void clearAllSquads(){
        String sql = "DELETE from squads";  //raw sql
        try(Connection conn = sql2o.open()) {
            conn.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Hero> getAllHeroesBySquad(int squadId){
        try(Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM heroes WHERE squadId = :squadId")
                    .addParameter("squadId", squadId)
                    .executeAndFetch(Hero.class);
        }
    }
}

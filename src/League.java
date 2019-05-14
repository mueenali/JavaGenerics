
import java.util.Collections;
import java.util.LinkedList;

public class League <T extends Team> {
    public String name;
    private LinkedList<T> leagueTeams = new LinkedList<>();
    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(leagueTeams.contains(team)) {
            return false;
        }
        leagueTeams.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(leagueTeams);
        for (T team : leagueTeams) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}


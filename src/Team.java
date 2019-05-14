
import java.util.LinkedList;

public class Team <T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private LinkedList<T> teamMembers = new LinkedList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (teamMembers.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            teamMembers.add(player);
            System.out.println(player.getName() + " Added to team:" + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.teamMembers.size();
    }

    public void matchResult(Team<T> opponent, int ourTeamScore, int theirTeamScore) {
        String message;
        if(ourTeamScore > theirTeamScore) {
            won++;
            message = " Won Against ";
        } else if(ourTeamScore == theirTeamScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, ourTeamScore, theirTeamScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}

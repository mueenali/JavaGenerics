public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        Team<FootballPlayer> NewEnglandPatriots = new Team<>("New England Patriots");
        Team<FootballPlayer> DallasCowboys = new Team<>("Dallas Cowboys");
        Team<FootballPlayer> PhiladelphiaEagles= new Team<>("Philadelphia Eagles");
        Team<FootballPlayer> OaklandRaiders= new Team<>("Oakland Raiders");
        NewEnglandPatriots.matchResult(DallasCowboys, 2, 1);
        PhiladelphiaEagles.matchResult(OaklandRaiders, 5, 6);
        OaklandRaiders.matchResult(NewEnglandPatriots, 4, 2);
        footballLeague.add(NewEnglandPatriots);
        footballLeague.add(DallasCowboys);
        footballLeague.add(PhiladelphiaEagles);
        footballLeague.add(OaklandRaiders);
        footballLeague.showLeagueTable();
        FootballPlayer tomBrady = new FootballPlayer("Tom Brady");
        NewEnglandPatriots.addPlayer(tomBrady);
    }
}

package lesson1;

public class Team {
    private String teamName;

    public Team(String teamName) {
        teamName = this.teamName;
    }


    public void teamINfo(Team team) {
        System.out.println(getTeamName());
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}

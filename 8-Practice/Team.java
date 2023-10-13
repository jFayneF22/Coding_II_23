import java.util.ArrayList;

public class Team {
    private String name;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int totalGoalsAllowed;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWinTotal() {
        return winTotal;
    }
    public void setWinTotal(int winTotal) {
        this.winTotal = winTotal;
    }
    public int getLossTotal() {
        return lossTotal;
    }
    public void setLossTotal(int lossTotal) {
        this.lossTotal = lossTotal;
    }
    public int getTieTotal() {
        return tieTotal;
    }
    public void setTieTotal(int tieTotal) {
        this.tieTotal = tieTotal;
    }
    public int getTotalGoalsAllowed() {
        return totalGoalsAllowed;
    }
    public void setTotalGoalsAllowed(int totalGoalsAllowed) {
        this.totalGoalsAllowed = totalGoalsAllowed;
    }
    public ArrayList<Team> getTeams() {
        return teams;
    }
    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    ArrayList<Team> teams = new ArrayList<Team>();

    public Team(String name) {
        this.name = name;
        teams.add(this);
    }
    public void Display(){
        System.out.println("Team Name: " + name);
        System.out.println("Win Total: " + winTotal + ", Loss Total: " + lossTotal + ", Tie Total: " + tieTotal);
    }
    public void numteams(){
        System.out.println(teams.size());
    }
}

public class candidate {
    private String name;
    private int voteCount;

    public candidate(String name) {
        this.name = name;
        this.voteCount = 0; 
    }

    public String getName() {
        return name;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void incrementVoteCount() {
        this.voteCount++;
    }
}

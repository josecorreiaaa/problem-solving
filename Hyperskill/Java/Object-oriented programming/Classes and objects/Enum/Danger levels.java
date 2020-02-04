//https://hyperskill.org/learn/step/2971

enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    private int dangerLevel;
 
    DangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }
 
    public int getLevel() {
        return dangerLevel;
    }
}
public class SentinelGuard {


    private GuardState currentState;


    public SentinelGuard() {
        currentState = new IdleState(this);
    }

    
    public GuardState getCurrentState() {
        return currentState;
    }
    public void setCurrentState(GuardState state) {
        this.currentState = state;
    }

    public void hearNoise() {
        currentState.hearNoise();
    }
    public void seeEnemy() {
        currentState.seeEnemy();
    }

    public void loseTarget() {
        currentState.loseTarget();
    }

}

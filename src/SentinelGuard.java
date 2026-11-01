public class SentinelGuard {

    public enum GuardState{
        IDLE,
        PATROLLING, 
        ATTACKING
    }

    private GuardState currentState;

    public SentinelGuard() {
        currentState = GuardState.IDLE;
    }

    public void hearNoise() {
        if (currentState == GuardState.IDLE) {
            currentState = GuardState.PATROLLING;
            System.out.println("Sentinel Guard is now patrolling.");
        }
        else if (currentState == GuardState.PATROLLING) {
            System.out.println("Sentinel Guard is still patrolling.");
        }
        else {
            System.out.println("Sentinel Guard is attacking and too busy to notice noise.");
        }
    }
    public void seeEnemy() {
        currentState = GuardState.ATTACKING;
        System.out.println("Sentinel Guard spotted an enemy!");

    }

    public void loseTarget() {
        if (currentState == GuardState.ATTACKING) {
            currentState = GuardState.PATROLLING;
            System.out.println("Sentinel Guard is searching for the escaped enemy.");
        }
        else {
            System.out.println("No target to lose.");
        }
    }

    public GuardState getCurrentState() {
        return currentState;
    }
}

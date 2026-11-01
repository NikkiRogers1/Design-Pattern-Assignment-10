public class PatrollingState implements GuardState {
    private SentinelGuard guard;

    public PatrollingState(SentinelGuard guard) {
        this.guard = guard;
    }

    @Override
    public void hearNoise() {
      System.out.println("Sentinel Guard is already on alert.");
    }

    @Override
    public void seeEnemy() {
        System.out.println("Sentinel Guard spotted an enemy while patrolling!");
        guard.setCurrentState(new AttackingState(guard));
    }

    @Override
    public void loseTarget() {
        System.out.println("No target to lose.");
    }
}

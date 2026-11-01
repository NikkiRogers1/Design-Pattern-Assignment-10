public class AttackingState implements GuardState {
    private SentinelGuard guard;

    public AttackingState(SentinelGuard guard) {
        this.guard = guard;
    }

    @Override
    public void hearNoise() {
        System.out.println("Sentinel Guard is too busy fighting to notice the noise.");
    }

    @Override
    public void seeEnemy() {
        System.out.println("Sentinel Guard is already attacking the enemy!");
    }

    @Override
    public void loseTarget() {
        System.out.println("Sentinel Guard lost the target and is now patrolling.");
        guard.setCurrentState(new PatrollingState(guard));
    }
    
}

public class IdleState implements GuardState {
    private SentinelGuard guard;

    public IdleState(SentinelGuard guard) {
        this.guard = guard;
    }

    @Override
    public void hearNoise() {
        System.out.println("Sentinel Guard is now investigating.");
        guard.setCurrentState(new PatrollingState(guard));

    }

    @Override   
    public void seeEnemy() {
        System.out.println("Sentinel Guard spotted an enemy!");
        guard.setCurrentState(new AttackingState(guard));
    }
    @Override
    public void loseTarget() {
        System.out.println("No target to lose.");
    }
}

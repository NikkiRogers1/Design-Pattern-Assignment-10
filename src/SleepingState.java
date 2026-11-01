public class SleepingState implements GuardState {
    private SentinelGuard guard;
    
    public SleepingState(SentinelGuard guard) {
        this.guard = guard;
    }

    @Override
    public void hearNoise() {
        System.out.println("The guard is sleeping and wakes up to investigate the noise.");
        guard.setCurrentState(new PatrollingState(guard));
    }

    @Override
    public void seeEnemy() {
        System.out.println("The guard is snoring loudly and doesn't see a thing.");
    }


    @Override
    public void loseTarget() {
        System.out.println("The guard is fast asleep and doesn't care about targets.");
    }
}


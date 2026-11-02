public class Main {
    public static void main(String[] args) {
        SentinelGuard guard = new SentinelGuard();

        System.out.println("Starting State: SLEEPING");

        guard.hearNoise(); // Test transition from SLEEPING to PATROLLING
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());

        guard.seeEnemy(); // Transition from PATROLLING to ATTACKING
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());

        // Test transition from ATTACKING to PATROLLING
        guard.loseTarget();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());

        // Test behavior while PATROLLING
        guard.hearNoise();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());

        // Test behavior while PATROLLING
        guard.loseTarget();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());

        guard.hearNoise();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());

        // Test transition from PATROLLING to ATTACKING
        guard.seeEnemy();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());

        // Test behavior while ATTACKING
        guard.seeEnemy();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());

        guard.hearNoise();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());
        // Test transition from ATTACKING to PATROLLING
        guard.loseTarget();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());
    
        guard.setCurrentState(new IdleState(guard));
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());
        

        guard.loseTarget();
        System.out.println("Current State: " + guard.getCurrentState().getClass().getSimpleName());
    }


}
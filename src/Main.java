public class Main {
    public static void main(String[] args) {
        SentinelGuard guard = new SentinelGuard();



        System.out.println("Current State: " + guard.getCurrentState());

        guard.loseTarget(); // Should not change state, still IDLE
        System.out.println("Current State: " + guard.getCurrentState());
        
        guard.hearNoise(); // Should transition to PATROLLING
        System.out.println("Current State: " + guard.getCurrentState());

        guard.loseTarget(); // Should still be PATROLLING
        System.out.println("Current State: " + guard.getCurrentState());

        guard.hearNoise(); // Should still be PATROLLING
        System.out.println("Current State: " + guard.getCurrentState());

        guard.seeEnemy(); // Should transition to ATTACKING
        System.out.println("Current State: " + guard.getCurrentState());

        guard.seeEnemy(); // Should still be ATTACKING
        System.out.println("Current State: " + guard.getCurrentState());

        guard.hearNoise(); // Should still be ATTACKING
        System.out.println("Current State: " + guard.getCurrentState());    
        guard.loseTarget(); // Should transition back to PATROLLING
        System.out.println("Current State: " + guard.getCurrentState());

    }
}

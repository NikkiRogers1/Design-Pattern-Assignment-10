public class Main {
    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard();

        System.out.println("Starting State: IDLE");

        // Test losing a target while IDLE
        guard.loseTarget();

        // Test transition from IDLE to PATROLLING
        guard.hearNoise();

        // Test behavior while PATROLLING
        guard.loseTarget();
        guard.hearNoise();

        // Test transition from PATROLLING to ATTACKING
        guard.seeEnemy();

        // Test behavior while ATTACKING
        guard.seeEnemy();
        guard.hearNoise();

        // Test transition from ATTACKING to PATROLLING
        guard.loseTarget();
    }
}
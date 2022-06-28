import static org.junit.jupiter.api.Assertions.*;

class AutoPolicyTest {
    public static void main(String[] args) {

        AutoPolicy myPolicy1 = new AutoPolicy(1111111111, "Rolls Royce", "NJ");
        AutoPolicy myPolicy2 = new AutoPolicy(1121121211, "Bentley", "NJ");

        policyInNoFaultState(myPolicy1);
        policyInNoFaultState(myPolicy2);
    }

    private static void policyInNoFaultState(AutoPolicy autoPolicy) {
        System.out.printf("""
                The Auto policy:
                Account No. : %d
                Car : %s
                State : %s %s is a no fault state
                
                """, autoPolicy.getAccountNumber(), autoPolicy.getMakeAndModel(), autoPolicy.getState(), (autoPolicy.isNoFaultState()));
    }
}
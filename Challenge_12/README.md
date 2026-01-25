# Flag 12 - Careful intent conditions

## Solution

This challenge is similar to Flag 10 and Flag 11, but introduces additional intent validation.

The exported activity requires an extra intent containing the extra "login".
Only when this additional condition is satisfied does the execution flow reach the success Method.


### Execution Flow

1. The attacker app sends an implicit intent with a specific action.

2. The attacker creates a new activity with a matching intent-filter.

3. Android resolves the intent to the attacker’s activity.

4. The attacker-controlled activity executes and reaches the success condition.

5. sending an intent with specific condition to reach success Method.
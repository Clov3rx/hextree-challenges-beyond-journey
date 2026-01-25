# Flag 10 - Respond to implicit intent

## Solution 

This challenge abuses implicit intents by registering a malicious activity that matches the expected intent-filter, allowing to intercept execution and trigger with sending an intent with specific condition to reach success Method.

### Key Concepts

1. Any app can claim an intent by declaring a matching action, category, and data.

2. Without proper validation, implicit intents can be hijacked by attacker-controlled components.


### Execution Flow

1. The attacker app sends an implicit intent with a specific action.

2. The attacker creates a new activity with a matching intent-filter.

3. Android resolves the intent to the attacker’s activity.

4. The attacker-controlled activity executes and reaches the success condition.

5. sending an intent with specific condition to reach success Method.
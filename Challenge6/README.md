# non exported activity 

## Solution 

1. u should know that exported=false block external apps mean only app itself can start it 
2. abusing intent redirection from an exported activity, allowing attacker-controlled intent flags to reach a non-exported activity.
3. start this non exported activity by abusing intent-rediraction in flag5 
4. look at the condition where reason = next in flag5 

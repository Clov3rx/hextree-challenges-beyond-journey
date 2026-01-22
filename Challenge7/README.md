# Flag 7 - Activity lifecycle tricks

## Solution 

This challenge abuses the singleTop launch mode to reach logic inside onNewIntent(), which is not executed during normal activity creation.

### Key Concepts

1. Lifecycle methods are special callback entry points controlled by the Android framework.
2. `onCreate()` is always the first entry point for an Activity instance.
3. `onNewIntent()` is only called when an existing Activity instance is reused (via `singleTop`).

### Execution Flow

1. `onCreate()` is triggered first and expects the action `"OPEN"`.
2. The Activity is then relaunched using `singleTop`.
3. `onNewIntent()` is triggered, expects the action `"REOPEN"`, and calls

### From adb 

1. am start-activity -n io.hextree.attacksurface/io.hextree.attacksurface.activities.Flag7Activity -a OPEN
2. am start-activity -n io.hextree.attacksurface/io.hextree.attacksurface.activities.Flag7Activity -a REOPEN --activity-single-top  

### Think of it as 

Lifecycle methods are the front doors; other methods are rooms inside.
You can’t reach the rooms unless you enter through a door first.
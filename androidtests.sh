#!/bin/bash
set -euo pipefail

#Start the emulator
~/Library/Android/sdk/tools/emulator -avd Nexus_5X_API_26 -wipe-data &
EMULATOR_PID=$!

# Wait for Android to finish booting
while [ "`~/Library/Android/sdk/platform-tools/adb shell getprop sys.boot_completed | tr -d '\r' `" != "1" ] ; do sleep 1; done

# until $WAIT_CMD | grep -m 1 stopped; do
#   echo "Waiting..."
#   sleep 1
# done

# Run the tests
../gradlew connectedCheck -Pcucumber -Ptags="@wip"


# Stop the background processes
kill $EMULATOR_PID

#!/bin/sh
# This the platform launching script.
# ---
# Authors - Alexey Cheptsov, Luka Bradesko

java -Xmx512M -Dgat.adaptor.path=bin/javagat/adaptors -Djava.util.logging.config.file=conf/larkc.properties -jar bin/larkc-platform.jar
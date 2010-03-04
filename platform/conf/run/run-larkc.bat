@echo off

echo This is a platform launching script
java -Xmx512M -Dgat.adaptor.path=bin\javagat\adaptors -Djava.util.logging.config.file=conf\larkc.properties -jar bin\larkc-platform.jar
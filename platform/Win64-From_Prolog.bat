cd w:
cd "W:\opt\CYC_JRTL_with_CommonLisp\platform"
SET HOME=W:\opt\CYC_JRTL_with_CommonLisp\platform

@PATH=c:\pf\Java\jdk1.8.0_162\bin;%PATH%

SET MAIN_CLASS=com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain


SET JVM_OPTS="-server -Xms5000m -Xmx8000m -XX:ReservedCodeCacheSize=96m  -XX:+DoEscapeAnalysis -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC"

cls

pskill swipl

:RESTART 

start /wait swipl.exe from_swipl.pl
@echo Exit %errorlevel%
@if %ERRORLEVEL% EQU 0 (
   echo Success
) else (
   @REM exit /b %errorlevel%
)
GOTO RESTART


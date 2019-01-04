
export LM_WORKSPACE=/mnt/dddd/workspace
export LM_LIBDIR=${LM_WORKSPACE}/swicli/lib
export LM_IKVMC="mono ${LM_LIBDIR}/ikvmc.exe -r:${LM_LIBDIR}/IKVM.Runtime.dll -r:${LM_LIBDIR}/IKVM.OpenJDK.Core.dll  -lib:${LM_LIBDIR} -nowarn:0109 -nowarn:0102 -sharedclassloader -time "

# 5 mins
${LM_IKVMC} -out:${LM_LIBDIR}/platform-deps.dll ${LM_WORKSPACE}/runtime/lib/?*.jar
${LM_IKVMC} -r:${LM_LIBDIR}/platform-deps.dll -recurse:${LM_WORKSPACE}/phase02-jrtl/AppdapterGUI/bin-eclipse/ -out:${LM_LIBDIR}/platform-appdapter.dll
${LM_IKVMC} -r:${LM_LIBDIR}/platform-appdapter.dll -r:${LM_LIBDIR}/platform-deps.dll -recurse:${LM_WORKSPACE}/phase02-jrtl/platform/bin-eclipse/ -out:${LM_LIBDIR}/platform-base.dll
${LM_IKVMC} -r:${LM_LIBDIR}/platform-base.dll -recurse:${LM_WORKSPACE}/phase02-jrtl/CycJava/bin-eclipse/ -out:${LM_LIBDIR}/platform-rcyc.dll

${LM_IKVMC}  -debug -r:${LM_LIBDIR}/platform-appdapter.dll -r:${LM_LIBDIR}/platform-deps.dll -recurse:${LM_WORKSPACE}/phase02-jrtl/platform/bin-eclipse/ -out:${LM_LIBDIR}/platform-base.dll

# ${LM_IKVMC} -recurse:${LM_WORKSPACE}/phase02-jrtl/bin-eclipse/org/jpl7/ platform-jpl7.dll

${LM_IKVMC} -r:{LM_LIBDIR}/platform-deps.dll -recurse:${LM_WORKSPACE}/phase02-jrtl/bin-eclipse/ -out:${LM_LIBDIR}/platform-base.dll


SET LM_WORKSPACE=D:/workspace
SET LM_LIBDIR=%LM_WORKSPACE%/swicli/lib
SET LM_IKVMC=D:\workspace\swicli\lib\ikvmc.exe -r:%LM_LIBDIR%/IKVM.Runtime.dll -r:%LM_LIBDIR%/IKVM.OpenJDK.Core.dll  -lib:%LM_LIBDIR% -nowarn:0109 -nowarn:0102 -sharedclassloader -time 

# 5 mins
${LM_IKVMC} -r:%LM_LIBDIR%/platform-deps.dll -recurse:%LM_WORKSPACE%/phase02-jrtl/AppdapterGUI/bin-eclipse/ -out:%LM_LIBDIR%/platform-appdapter.dll


%LM_IKVMC% -recurse:%LM_WORKSPACE%/phase02-jrtl/platform/bin-eclipse/ -out:%LM_LIBDIR%/platform-base.dll
%LM_IKVMC% -recurse:%LM_WORKSPACE%/phase02-jrtl/AppdapterGUI/bin-eclipse/ -out:%LM_LIBDIR%/platform-appdapter.dll
%LM_IKVMC% -debug -recurse:%LM_WORKSPACE%/phase02-jrtl/platform/bin-eclipse/ -out:%LM_LIBDIR%/platform-base.dll

%LM_IKVMC% -out:%LM_LIBDIR%/platform-deps.dll %LM_WORKSPACE%/runtime/lib/?*.jar


%LM_IKVMC% -recurse:%LM_WORKSPACE%/phase02-jrtl/CycJava/bin-eclipse/ -out:%LM_LIBDIR%/platform-rcyc.dll


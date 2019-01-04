

@rem -r:IKVM.Runtime.dll -r:IKVM.OpenJDK.Core.dll 

SET LM_WORKSPACE=D:\workspace
SET LM_LIBDIR=%LM_WORKSPACE%\swicli\lib
SET LM_IKVMC=D:\workspace\swicli\lib\ikvmc.exe -lib:%LM_LIBDIR%\ -nowarn:0109 -nowarn:0102 -sharedclassloader -time 



%LM_IKVMC% -out:%LM_LIBDIR%\platform-base.dll -debug -recurse:%LM_WORKSPACE%\phase02-jrtl\platform\bin-eclipse\
%LM_IKVMC% -out:%LM_LIBDIR%\platform-deps.dll %LM_WORKSPACE%\runtime\lib\?*.jar

@ -debug switch breaks this:
@Rem maybe addd -r:platform-base.dll -r:platform-deps.dll to next line
%LM_IKVMC% -out:%LM_LIBDIR%\platform-appdapter.dll  -recurse:%LM_WORKSPACE%\phase02-jrtl\AppdapterGUI\bin-eclipse\ 



%LM_IKVMC% -out:%LM_LIBDIR%\platform-rcyc.dll -recurse:%LM_WORKSPACE%\phase02-jrtl\CycJava\bin-eclipse\

%LM_IKVMC% -out:%LM_LIBDIR%\platform-contrib.dll -debug -recurse:%LM_WORKSPACE%\phase02-jrtl\platform\dist\abcl-contrib.jar



%LM_IKVMC% -out:%LM_LIBDIR%\uabcl.exe -debug -main:org.armedbear.lisp.Main -r:platform-contrib.dll -r:platform-rcyc.dll -r:platform-base.dll -r:platform-appdapter.dll -r:platform-deps.dll
%LM_IKVMC% -out:%LM_LIBDIR%\larkc.exe -debug -main:com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain -r:platform-contrib.dll -r:platform-rcyc.dll  -r:platform-base.dll -r:platform-appdapter.dll -r:platform-deps.dll
%LM_IKVMC% -out:%LM_LIBDIR%\appdapter.exe -main:org.appdapter.gui.demo.DemoBrowser -r:platform-rcyc.dll  -r:platform-base.dll -r:platform-appdapter.dll -r:platform-deps.dll


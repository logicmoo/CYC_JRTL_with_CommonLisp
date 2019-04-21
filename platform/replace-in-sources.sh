
#export BA="org/armedbear/lisp|org/armedbear/lisp"
export BA="org/armedbear/lisp|org/armedbear/lisp"
find src/ -name "*.java"  -printf "%p\n" -exec sed -e "s|$BA|g" -i {} \;
find src/ -name "*.lisp"  -printf "%p\n" -exec sed -e "s|$BA|g" -i {} \;
find ! -name "*.*" -type f -printf "%p\n" -exec sed -e "s|$BA|g" -i {} \;
sed -e "s|$BA|g" -i -i *.*

#export BA="org\\.armedbear\\.lisp|org.armedbear.lisp"
export BA="org.armedbear.lisp|org\\.armedbear\\.lisp"
find src/ -name "*.java"  -printf "%p\n" -exec sed -e "s|$BA|g" -i {} \;
find src/ -name "*.lisp"  -printf "%p\n" -exec sed -e "s|$BA|g" -i {} \;
find ! -name "*.*" -type f -printf "%p\n" -exec sed -e "s|$BA|g" -i {} \;
sed -e "s|$BA|g" -i -i *.*


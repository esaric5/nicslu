export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/home/esaric/Desktop/files
swig -java -package com.nicslu.jni -outdir com/nicslu/jni -o nicslu_readfile_wrap.c nicslu_readfile.i
gcc -c -fPIC nicslu_readfile.c nicslu_readfile_wrap.c  -I"/usr/lib/jvm/java-11-openjdk-amd64/include" -I"/usr/lib/jvm/java-11-openjdk-amd64/include/linux"
swig -java -package com.nicslu.jni -outdir com/nicslu/jni -o nicslu_wrap.c nicslu.i
gcc -c -fPIC nicslu.c nicslu_wrap.c  -I"/usr/lib/jvm/java-11-openjdk-amd64/include" -I"/usr/lib/jvm/java-11-openjdk-amd64/include/linux"
gcc -shared  nicslu.o  nicslu_wrap.o nicslu_readfile.o nicslu_readfile_wrap.o libnicslu.a -o libnicslu.so -lrt -lpthread -lm
javac test.java
jar cvf nicslu_so_beta.jar com/nicslu/jni/*.class libnicslu.so


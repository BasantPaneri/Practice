#!/bin/bash

javac *.java

if [ $? -ne 0 ]; then
    echo "Compilation failed"
    exit 1
fi

# java -cp src com.bakery.controller.BakeryController
java Main
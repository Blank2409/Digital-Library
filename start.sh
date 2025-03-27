#!/bin/bash
# Find Java in standard locations
if [ -f "/usr/bin/java" ]; then
  /usr/bin/java -jar target/*.jar
elif [ -f "/usr/lib/jvm/java-17-openjdk-amd64/bin/java" ]; then
  /usr/lib/jvm/java-17-openjdk-amd64/bin/java -jar target/*.jar
else
  echo "ERROR: Java not found in expected locations"
  exit 1
fi
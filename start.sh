#!/bin/bash
# Find Java automatically
JAVA_PATH=$(update-alternatives --list java | grep "java-17" | head -1)
exec "$JAVA_PATH" -jar target/*.jar
#!/bin/bash

# 사용법: ./run.sh <패키지.클래스명>
# 예시: ./run.sh array.TwoSum

if [ -z "$1" ]; then
    echo "사용법: ./run.sh <패키지.클래스명>"
    echo "예시: ./run.sh array.TwoSum"
    exit 1
fi

# 컴파일
./gradlew compileKotlin

# 실행
kotlin -cp build/classes/kotlin/main "${1}Kt"
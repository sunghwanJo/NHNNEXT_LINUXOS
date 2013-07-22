#!/bin/bash

COUNT=$1

#만약 인자값이 없다면 숫자를 받는다
if [ $# -lt 1 ]; then
	echo '몇초 입력?'
	read COUNT
fi

for i in $(seq 1 $COUNT)
do	
	sleep 1
	echo $((COUNT-i+1))
done
echo 

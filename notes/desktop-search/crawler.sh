#!/bin/sh

seed=$1

echo $seed
echo "#hash|path|size|date|owner|type" > storage.txt

for file in `find $seed -type f`; do
    sh extract.sh $file >> storage.txt
done    



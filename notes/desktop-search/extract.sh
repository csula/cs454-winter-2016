#!/bin/sh

file=$1
md5sum=`md5sum $file | awk '{print $1}'`
size=`ls -l $file | awk '{print $5}'`
owner=`ls -l $file | awk '{print $4}'`
date=`ls -l $file | awk '{print $6"-"$7"-"$8}'`
type=`ls $file | awk -F. '{print $NF}'`
echo "${md5sum}|${file}|$size|$date|$owner|$type"

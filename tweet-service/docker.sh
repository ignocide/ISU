#!/bin/bash

echo "==================== Start build npm ===================="

echo "==================== End build npm ===================="


echo "==================== Start build docker image ===================="

docker build -t docker.ignocide.xyz/tweet-service .

echo "==================== End build docker image ===================="

echo "==================== Start push docker image ===================="

docker push docker.ignocide.xyz/tweet-service

echo "==================== End push docker image ===================="
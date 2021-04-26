#!/bin/bash

echo "Connectivity tester starting..."


while [ 1 ] 
do
	echo "Testing connectivity with cURL...";
	curl -I "http://stash.univeris.com/projects";
	# TODO: define other important URLs
	sleep 5;
done;

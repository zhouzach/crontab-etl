
year=`date +%Y`
month=`date +%m`
day=`date +%d`
hdfs dfs -ls /mysql/${year}/${month}/${day}

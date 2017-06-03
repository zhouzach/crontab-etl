
echo "start migrating data on `date +'%Y-%m-%d %H:%M:%S'`"
mysql_dir="/mysql"
hadoop fs -test -d ${mysql_dir}
if [ $? == 1 ]; then
	hdfs dfs -mkdir -p ${mysql_dir}
	echo "Created directory: ${mysql_dir}"
fi

year=`date +%Y`
month=`date +%m`
day=`date -d "-1 day" +'%d'`
month_dir="/mysql/${year}/${month}"
hadoop fs -test -d ${month_dir}
if [ $? == 1 ]; then
	hdfs dfs -mkdir -p ${month_dir}
	echo "Created directory: ${month_dir}"
fi

day_dir="/mysql/${year}/${month}/${day}"
hadoop fs -test -d ${day_dir}
if [ $? == 1 ]; then
	hdfs dfs -mkdir -p ${day_dir}
	echo "Created directory: ${day_dir}"
#else 
#	hdfs dfs -rm -r ${day_dir}	
#	echo "delete directory: ${day_dir}"
fi

hdfs dfs -cp -p /sqoop/warehouse/*  ${day_dir}
echo "finished migrating data into directory: ${day_dir} on `date +'%Y-%m-%d %H:%M:%S'`"

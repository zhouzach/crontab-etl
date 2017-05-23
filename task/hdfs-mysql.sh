

mysql_dir="/mysql"
hadoop fs -test -d ${mysql_dir}
if [ $? == 1 ]; then
	hdfs dfs -mkdir -p ${mysql_dir}
	echo "Created directory: ${mysql_dir}"
fi

year=`date +%Y`
month=`date +%m`
day=`date +%d`
month_dir="/mysql/${year}/${month}"
hadoop fs -test -d ${month_dir}
if [ $? == 1 ]; then
	hdfs dfs -mkdir -p ${month_dir}
	echo "Created directory: ${month_dir}"
fi

day_dir="/mysql/${year}/${month}/${day}"
hadoop fs -test -d ${day_dir}
if [ $? == 1 ]; then
	hdfs dfs -cp /sqoop/warehouse  ${day_dir}
	echo "Migrated data into directory: ${day_dir}"
fi


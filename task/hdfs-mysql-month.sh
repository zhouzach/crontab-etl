
n=${1}

echo "start migrating data on `date +'%Y-%m-%d %H:%M:%S'`"
mysql_dir="/mysql"
hadoop fs -test -d ${mysql_dir}
if [ $? == 1 ]; then
	hdfs dfs -mkdir -p ${mysql_dir}
	echo "Created directory: ${mysql_dir}"
fi

year=`date +%Y`
month=`date -d "$(date +%Y-%m-01) -${n} month" +%m`
month_dir="/mysql/${year}/${month}"
hadoop fs -test -d ${month_dir}
if [ $? == 1 ]; then
	hdfs dfs -mkdir -p ${month_dir}
	echo "Created directory: ${month_dir}"
#else
#	hdfs dfs -rm -r ${month_dir}
#	echo "deleted directory: ${month_dir}"
fi

hdfs dfs -cp -p /sqoop/warehouse/*  ${month_dir}
echo "Migrated data into directory: ${month_dir}"
echo "finished migrating data on `date +'%Y-%m-%d %H:%M:%S'`"


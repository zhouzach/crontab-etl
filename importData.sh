
host=$1
db=$2
user=$3
passwd=$4
table=$5
import_data() {
	sqoop import --connect "jdbc:mysql://${host}:3306/${db}?tinyInt1isBit=false&zeroDateTimeBehavior=convertToNull" --username ${user} --password ${passwd} --fields-terminated-by '*' --query "select * from ${table} WHERE \$CONDITIONS" -m 1 --target-dir '/sqoop/warehouse'
}

upload_dir=/sqoop/warehouse
if $(hadoop fs -test -d ${upload_dir}) ; then 
	hdfs dfs -rm -r /sqoop/warehouse;
	echo "deleted directory: ${upload_dir}";
fi

import_data


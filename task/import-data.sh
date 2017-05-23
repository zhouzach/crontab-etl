

host=$1
db=$2
user=$3
passwd=$4
table=$5

upload_dir="/sqoop/warehouse/${db}.${table}"
if $(hadoop fs -test -d ${upload_dir}) ; then 
	hdfs dfs -rm -r ${upload_dir};
	echo "deleted directory: ${upload_dir}";
fi

import_data() {
	sqoop import --connect "jdbc:mysql://${host}:3306/${db}?tinyInt1isBit=false&zeroDateTimeBehavior=convertToNull" --username ${user} --password ${passwd} --fields-terminated-by '|' --escaped-by '\\' --lines-terminated-by '*' --query "select * from ${table} WHERE \$CONDITIONS" -m 1 --target-dir ${upload_dir}
}

import_data


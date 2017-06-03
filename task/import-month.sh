

host=$1
db=$2
user=$3
passwd=$4
table=$5
n=${6}
splitting_col=${7}

upload_dir="/sqoop/warehouse/${db}.${table}"
if $(hadoop fs -test -d ${upload_dir}) ; then 
	hdfs dfs -rm -r ${upload_dir};
	echo "deleted directory: ${upload_dir}";
fi

import_data() {
	start_day=`date -d "$(date +%Y-%m-01) -${n} month " +'%Y-%m-%d'`
	end_day=`date -d "$(date +%Y-%m-01) -${n} month +1 month" +'%Y-%m-%d'`
	sqoop import --connect "jdbc:mysql://${host}:3306/${db}?tinyInt1isBit=false&zeroDateTimeBehavior=convertToNull" --username ${user} --password ${passwd} --fields-terminated-by '|' --escaped-by '\\' --lines-terminated-by '*' --query "select * from ${table} WHERE create_time >= '${start_day}' and create_time < '${end_day}' and \$CONDITIONS" --split-by ${splitting_col} --target-dir ${upload_dir}
}

import_data


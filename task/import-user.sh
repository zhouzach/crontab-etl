

host=$1
db=$2
user=$3
passwd=$4
table=$5
splitting_col=$6

upload_dir="/sqoop/warehouse/${db}.${table}"
if $(hadoop fs -test -d ${upload_dir}) ; then 
	hdfs dfs -rm -r ${upload_dir};
	echo "deleted directory: ${upload_dir}";
fi

import_data() {
	start_day=`date -d "-7 day" +'%Y-%m-%d 00:00:00'`
	end_day=`date +'%Y-%m-%d 00:00:00'`
	sqoop import --connect "jdbc:mysql://${host}:3306/${db}?tinyInt1isBit=false&zeroDateTimeBehavior=convertToNull" --username ${user} --password ${passwd} --fields-terminated-by '|' --escaped-by '\\' --lines-terminated-by '`' --query "select userid, un, username_third, lt, longitude, latitude, detail, province, province_id, city, city_code, district, town, country, village, gender, birthday, age_stage, height, weight, bmi, icon_url, bp_level, id_card, using_os_android, using_os_ios, using_device_bp3m, using_device_bp3l, using_device_bpm1, reg_time, update_time, last_measure_time, available from ${table} WHERE reg_time >= '${start_day}' and reg_time < '${end_day}' and \$CONDITIONS" --split-by ${splitting_col} --target-dir ${upload_dir}
}

import_data


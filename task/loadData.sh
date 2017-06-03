
host=${1}
table=${2}
load_dir="/sqoop/warehouse/${table}"
echo "start loading data on `date +'%Y-%m-%d %H:%M:%S'`"
impala-shell -i ${host} -q "load data inpath \"${load_dir}\" into table ${table};"
hdfs dfs -rm -r ${load_dir}
echo "deleted load directory: ${load_dir}."
echo "finished load data on `date +'%Y-%m-%d %H:%M:%S'`"

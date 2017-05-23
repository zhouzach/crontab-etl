
host=${1}
table=${2}
impala-shell -i ${host} -q "load data inpath \"/sqoop/warehouse/${table}\" into table ${table};"

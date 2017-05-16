
host=${1}
table=${2}
impala-shell -i ${host} -q "desc formatted ${table};"

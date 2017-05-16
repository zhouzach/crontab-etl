
host=${1}
table=${2}
raw_table=${3}
impala-shell -i ${host} -q "insert into table ${table}
select cast(bpid as bigint), dataid, cast(device_type as smallint), cast(userid as bigint), deviceid, cast(position as smallint), cast(data_type as smallint), cast(high_bp as bigint), cast(low_bp as bigint), cast(heart_rate as bigint), cast(who as tinyint), cast(Is_arhythima as smallint), cast(hsd as smallint), cast(inner_temp as float), cast(out_temp as float), weather, cast(take_pill as tinyint), cast(mood as smallint), create_time, measure_time, update_time, cast(available as smallint), phoneid, version, cast(longitude as float), cast(latitude as float), appid
from ${raw_table};"

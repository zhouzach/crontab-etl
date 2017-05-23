
impala-shell -i 10.9.0.11:32400 -q "create table ih_aijiakang.ih_blood_pressure_ptt (
	bpid bigint,
	dataid string,
	userid bigint,
	deviceid string,
	position smallint,
	data_type smallint,
	high_bp bigint,
	low_bp bigint,
	heart_rate bigint,
	who tinyint,
	Is_arhythima smallint,
	hsd smallint,
	inner_temp float,
	out_temp float,
	weather string,
	take_pill tinyint,
	mood smallint,
	create_time STRING,
	measure_time STRING,
	update_time STRING,
	available smallint,
	phoneid string,
	version STRING,
	longitude float,
	latitude float,
	appid STRING
)
PARTITIONED BY (year smallint, month tinyint, day tinyint, device_type smallint)
row format delimited 
fields terminated by '|' ESCAPED BY '\\\\'
lines terminated by '*'
;"

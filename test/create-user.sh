
impala-shell -i 10.9.0.11:32400 -q "create table ih_aijiakang.ih_user_profile (
	userid bigint,
	un string,
	username_third string,
	lt string,
	nickname string,
	longitude float,
	latitude float,
	detail string,
	province string,
	province_id bigint,
	city string,
	city_code bigint,
	district string,
	town string,
	country string,
	village string,
	gender smallint,
	birthday string,
	age_stage tinyint,
	height double,
	weight double,
	bmi bigint,
	icon_url string,
	bp_level tinyint,
	id_card string,
	using_os_android tinyint,
	using_os_ios tinyint,
	using_device_bp3m tinyint,
	using_device_bp3l tinyint,
	using_device_bpm1 tinyint,
	reg_time string,
	update_time string,
	last_measure_time string,
	available smallint
)
row format delimited 
fields terminated by '|' ESCAPED BY '\\\\'
lines terminated by '\`'
;"

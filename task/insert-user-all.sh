
year=`date +%Y`
month=`date +%m`
day=`date -d "-1 day" +'%d'`
echo "start inserting data on `date +'%Y-%m-%d %H:%M:%S'`"
impala-shell -i 10.9.0.11:32400 -q "insert into ih_aijiakang.ih_user_profile_ptt (userid, un, username_third, lt, longitude, latitude, detail, province, province_id, city, city_code, district, town, country, village, gender, birthday, age_stage, height, weight, bmi, icon_url, bp_level, id_card, using_os_android, using_os_ios, using_device_bp3m, using_device_bp3l, using_device_bpm1, reg_time, update_time, last_measure_time, available) partition (year=${year}, month=${month}, day=${day}) select userid, un, username_third, lt, longitude, latitude, detail, province, province_id, city, city_code, district, town, country, village, gender, birthday, age_stage, height, weight, bmi, icon_url, bp_level, id_card, using_os_android, using_os_ios, using_device_bp3m, using_device_bp3l, using_device_bpm1, reg_time, update_time, last_measure_time, available from ih_aijiakang.ih_user_profile;"
echo "finished inserting data on `date +'%Y-%m-%d %H:%M:%S'`"

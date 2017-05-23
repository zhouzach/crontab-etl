
year=`date +%Y`
month=`date +%m`
day=`date +%d`
impala-shell -i 10.9.0.11:32400 -q "insert into ih_aijiakang.ih_blood_pressure_ptt (bpid, dataid, userid, deviceid, position, data_type, high_bp, low_bp, heart_rate, who, Is_arhythima, hsd, inner_temp, out_temp, weather, take_pill, mood, create_time, measure_time, update_time, available, phoneid, version, longitude, latitude, appid) partition (year=${year}, month=${month}, day=${day}, device_type=1) select bpid, dataid, userid, deviceid, position, data_type, high_bp, low_bp, heart_rate, who, Is_arhythima, hsd, inner_temp, out_temp, weather, take_pill, mood, create_time, measure_time, update_time, available, phoneid, version, longitude, latitude, appid from ih_aijiakang.ih_blood_pressure_all where device_type = 1;"
impala-shell -i 10.9.0.11:32400 -q "insert into ih_aijiakang.ih_blood_pressure_ptt (bpid, dataid, userid, deviceid, position, data_type, high_bp, low_bp, heart_rate, who, Is_arhythima, hsd, inner_temp, out_temp, weather, take_pill, mood, create_time, measure_time, update_time, available, phoneid, version, longitude, latitude, appid) partition (year=${year}, month=${month}, day=${day}, device_type=2) select bpid, dataid, userid, deviceid, position, data_type, high_bp, low_bp, heart_rate, who, Is_arhythima, hsd, inner_temp, out_temp, weather, take_pill, mood, create_time, measure_time, update_time, available, phoneid, version, longitude, latitude, appid from ih_aijiakang.ih_blood_pressure_all where device_type = 2;"
impala-shell -i 10.9.0.11:32400 -q "insert into ih_aijiakang.ih_blood_pressure_ptt (bpid, dataid, userid, deviceid, position, data_type, high_bp, low_bp, heart_rate, who, Is_arhythima, hsd, inner_temp, out_temp, weather, take_pill, mood, create_time, measure_time, update_time, available, phoneid, version, longitude, latitude, appid) partition (year=${year}, month=${month}, day=${day}, device_type=3) select bpid, dataid, userid, deviceid, position, data_type, high_bp, low_bp, heart_rate, who, Is_arhythima, hsd, inner_temp, out_temp, weather, take_pill, mood, create_time, measure_time, update_time, available, phoneid, version, longitude, latitude, appid from ih_aijiakang.ih_blood_pressure;"
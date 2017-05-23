
year=`date +%Y`
month=`date +%m`
day=`date +%d`
impala-shell -i 10.9.0.11:32400 -q "alter table ih_aijiakang.ih_blood_pressure_ptt add partition (year=${year}, month=${month}, day=${day}, device_type=1);"
impala-shell -i 10.9.0.11:32400 -q "alter table ih_aijiakang.ih_blood_pressure_ptt add partition (year=${year}, month=${month}, day=${day}, device_type=2);"
impala-shell -i 10.9.0.11:32400 -q "alter table ih_aijiakang.ih_blood_pressure_ptt add partition (year=${year}, month=${month}, day=${day}, device_type=3);"


year=`date +%Y`
month=`date +%m`
day=`date +%d`
impala-shell -i 10.9.0.11:32400 -q "load data inpath \"/sqoop/warehouse/${year}/${month}/${day}/ih_blood_pressure_all\" into table ih_aijiakang.ih_blood_pressure_all;"

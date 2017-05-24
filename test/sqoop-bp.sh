
sqoop import --connect "jdbc:mysql://120.131.8.76:3306/ih_aijiakang?tinyInt1isBit=false&zeroDateTimeBehavior=convertToNull" --username root --password Wifah0Aaj3 --fields-terminated-by '|' --escaped-by '\\' --lines-terminated-by '*' --query "select * from ih_blood_pressure WHERE \$CONDITIONS" -m 1 --target-dir "/sqoop/warehouse"

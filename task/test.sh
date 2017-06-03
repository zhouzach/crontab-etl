echo "start migrating data on `date +'%Y-%m-%d %H:%M:%S'`"
n=${1}
start=`date -d "$(date +%Y-%m-01) -${n} month " +'%Y-%m-%d'`
end=`date -d "$(date +%Y-%m-01) -${n} month +1 month -1 day" +'%Y-%m-%d'`
month=`date -d "$(date +%Y-%m-01) -${n} month" +%m`
day=`date -d "-1 day" +'%d'`
echo ${day}

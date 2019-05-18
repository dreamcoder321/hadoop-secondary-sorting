""""


start-yarn.sh

start-dfs.sh

hadoop fs -rm -r -f /user/hduser/output/

export HADOOP_CLASSPATH=/usr/lib/jvm/jdk1.7.0_80/lib/tools.jar

#upload weather file from local filesystem to hdfs

hadoop fs -copyFromLocal weather_shuf.csv /user/hduser/input

cd hadoop-secondary-sorting

sudo mvn install assembly:single

cd target

export HADOOP_CLASSPATH=hadoop-secondary-sort-1.0-SNAPSHOT-jar-with-dependencies.jar

hadoop com.secomdarysort.DriverSecondarySort /user/hduser/input/weather_shuf.csv   /user/hduser/output

hadoop fs -cat  /user/hduser/output/part-* | sort

""""

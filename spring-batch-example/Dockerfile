FROM oraclelinux:9

RUN yum clean all \
   && yum update -y \
   && yum install -y librepo \
   && yum install -y tar \
   && yum install -y procps \
   && yum install -y sudo \
   && yum install -y xz-libs \
   && yum install -y wget
#RUN wget https://dev.mysql.com/get/mysql80-community-release-el9-5.noarch.rpm
#RUN yum localinstall mysql80-community-release-el9-5.noarch.rpm
#RUN yum install mysql-community-server
#CMD systemctl start mysqld
WORKDIR /
COPY jdk1.8.0_321.tar /
RUN tar -xvf jdk1.8.0_321.tar
COPY target/batch-processing-demo-0.0.1-SNAPSHOT.jar .
EXPOSE 9191
#EXPOSE 3306
#CMD tail -f /var/log/dnf.rpm.log
ENTRYPOINT ["/jdk1.8.0_321/bin/java", "-jar", "batch-processing-demo-0.0.1-SNAPSHOT.jar"]

docker ps
echo "Hello keralhum"
exit
ls
cat -last /var/run/docker.sock
ls -last /var/run/docker.sock 
whoami
cat /etc/group | grep docker
setfacl --modify user:<user name or ID>:rw /var/run/docker.sock
setfacl --modify user:<jenkins>:rw /var/run/docker.sock
setfacl --modify jenkins:rw /var/run/docker.sock
usermod -aG docker jenkins
user root
logn
login
chmod 666 /var/run/docker.sock
exit
